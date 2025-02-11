import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MyFrame extends Frame implements MouseListener, MouseMotionListener {
    Label l, l2;
    private Object lL;

    MyFrame() {
        super("Mouse Events");
        l = new Label("");
        l2 = new Label("");
        setLayout(null);
        l.setBounds(10, 50, 100, 20);
        l2.setBounds(10, 80, 100, 20);

        add(l);
        add(l2);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Dragged");
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Moved");
        l2.setText("(" + e.getX() + "," + e.getY() + ")");
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Clicked");

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Pressed");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Released");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        l.setText("MouseEntered");

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        l.setText("Mouse is Exited");

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyFrame mf = new MyFrame();
        mf.setSize(500, 500);
        mf.setVisible(true);
    }
}
