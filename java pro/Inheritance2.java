class parent{
  public parent(){
    System.out.println("Non param of parent");
  }
  parent(int x){
    System.out.println("param of parent " + x);
  }
}

class child extends parent{
  child(){
    System.out.println("Non param of child");
  }
  child(int x){
    super(x);
    System.out.println("param of child " + x);
  }
}
public class Inheritance2 {
  public static void main(String[] args) {
    
  child c = new child(10);
}
}