class Super{
  public void display(){
    System.out.println("Super display ");
  }
}
class Sub extends Super{
  public void display(int x){
    System.out.println("Sub display ");
  }
}

public class methodOverride {
  public static void main(String[] args) {
    // Super sup = new Super();
    // sup.display();

    Sub sub = new Sub();
    sub.display();
  }
}
