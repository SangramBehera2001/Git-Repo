class Superk{
  public void display(){
    System.out.println("Super display ");
  }
}
class Sub extends Superk{
  public void display(int x){
    System.out.println("Sub display ");
  }
}

public class methodOverride {
  public static void main(String[] args) {
    Superk sup = new Superk();
    sup.display();

    Sub sub = new Sub();
    sub.display();
  }
}
