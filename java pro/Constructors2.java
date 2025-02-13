class Rectangle {
  private double length;
  private double breadth;

  public Rectangle() {
      length = 8;
      breadth = 1;
  }

  public double getLength() {
      return length;
  }

  public double getBreadth() {
      return breadth;
  }
}

public class Constructors2 {
  public static void main(String[] args) {
      Rectangle r = new Rectangle();
      System.out.println(r.getLength());  // ✅ Allowed: Accessing via getter
  }
}
