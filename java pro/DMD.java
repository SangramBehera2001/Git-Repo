class Superx{
  public void display(){
    System.out.println("Super display ");
  }
}
class Subx extends Superx{
  public void display(){
    System.out.println("Sub display ");
  }
}

public class DMD {
  public static void main(String[] args) {
    Superx sup = new Subx();
    sup.display();;
  }
}

