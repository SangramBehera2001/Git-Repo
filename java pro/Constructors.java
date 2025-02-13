class Rectangle{
  private double length;
  private double breadth;

  public Rectangle(){
    length=1;
    breadth=1;
  }

  public Rectangle(double l, double b){
    length=l;
    breadth=b;
  }

  public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}

public class Constructors {
  public static void main(String[] args) {
  
  Rectangle  r = new Rectangle(5,4);
  System.out.println(r.area());
  }
}
