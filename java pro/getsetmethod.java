class Rectangle {
  private double length;
  private double breadth;

  public double getLength(){
    return length;
  }
  public double getBreadth(){
    return breadth;
  }

  public double setLength(double l){
    return length=l;
  }

  public double setBreadth(double b){
    return breadth=b;
  }

  public double area(){
    return length*breadth;
  }

  public double perimeter(){
    return 2*(length + breadth);
  }

  public boolean isSquare(){
    if(length == breadth)
    return true;
    else return false; 
  }
}



public class getsetmethod {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.setLength(4.6);
    r.setBreadth(8.5);

    System.out.println(r.area());
    System.out.println(r.perimeter());
    System.out.println(r.isSquare() + "It is a square");

    System.out.println(r.getLength());
    System.out.println(r.getBreadth());
  }
}
