public class ThrowThrows {
  static int meth3(){
    return 10/0;
  }
  static void meth2(){
    meth3();
  }
  static void meth1(){
    meth2();
  }
  
  public static void main(String[] args) {
    try{
      meth1();
  }
  catch(Exception e)
  {
    System.out.println("hey wrong denominator");
  }
}
}
