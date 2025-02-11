public class MethodOverload {
  static double area(double l, double b)
  {
    return l * b;
  }

  static double area(double r)
  {
    return Math.PI*r*r;
  }

  public static void main(String[] args) {
    
    System.out.println(area(2,6));

    System.out.println(area(7));
  }
}
