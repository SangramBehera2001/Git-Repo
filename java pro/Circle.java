 class Circle1 {
  public double radius;

  public double area(){
    return Math.PI*radius*radius;
  }
  public double perimeter(){
    return 2*Math.PI*radius;
  }
  public double circumference(){
    return perimeter();
  }
}
   
  public class Circle{
  public static void main(String[] args) {
    Circle1 c = new Circle1();
    c.radius = 7;
    System.out.println(c.area());
   
    System.out.println(c.perimeter());

    System.out.println(c.circumference());

  }
}
