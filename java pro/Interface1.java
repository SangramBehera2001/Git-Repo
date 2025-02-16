interface Test{
  public void meth1();  
  public void meth2();
}

 class My implements Test{
    public void meth1(){
      System.out.println("Method 1");
    }
    public void meth2(){
      System.out.println("Method 2");
    }
    public void meth3(){
      System.out.println("Method 3");
    }
}

public class Interface1 {
  public static void main(String[] args) {
    Test t = new My();
    t.meth1();
    t.meth2();
    
  }
}
