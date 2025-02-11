import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class xyz {
    public void menu() {
        Frame frame = new Frame("Menu and Menu Bar");
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu pasteMenu = new Menu("Paste");

        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Save as");
        MenuItem item5 = new MenuItem("Exit");

        MenuItem item6 = new MenuItem("Cut");
        MenuItem item7 = new MenuItem("Copy");

        MenuItem item8 = new MenuItem("Plane Text Paste");
        MenuItem item9 = new MenuItem("Formatted Text paste");
         pasteMenu.add(item8);
        pasteMenu.add(item9);

        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.add(item3);
        fileMenu.add(item4);
        fileMenu.add(item5);

        editMenu.add(item6);
        editMenu.add(item7);
        editMenu.add(pasteMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        Color backgColor = Color.MAGENTA;

        frame.setMenuBar(menuBar);
        frame.setBackground(backgColor);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
 frame.addWindowListener((WindowListener) new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
                frame.dispose();
            }
        });

        item2.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
        });

    }

    private void add(Menu editMenu) {
    }

    public static void main(String[] args) {
        xyz menuBar = new xyz();
        menuBar.menu();
    }
}


