interface Tests{
    int X =10;
    public void method1();
    public void method2();
    // private void method5(){
    //   System.out.println("Hey private");
    // }
    default public void  method3(){
      System.out.println("hello method3");
    }
}
interface Test2 extends Tests{
  void method4();
}

class My implements Test2{
  public void method1(){}
  public void method2(){}
   public void method3(){};
  public void method4(){}
  // public void method5(){};


}
public class interface2 {
  public static void main(String[] args) {
    System.out.println(Tests.X);
    My m = new My();
    m.method1();
    m.method2();
    m.method4();
    // m.method3(); 
    // m.method5();
    m.method3();

  }
}
