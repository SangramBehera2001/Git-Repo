abstract class Super{
 public Super(){
   System.out.println("Super Constructor");
 }
 public void method1(){
  System.out.println("Method1 of super");
 }
 abstract public void method2();
}

class sub extends Super{
  public void method2(){
    System.out.println("Method2 of Sub");
  }
}

public class AbstractPrac {
  public static void main(String[] args) {
    
   Super s = new sub();
    s.method1();
    s.method2();
  }
}
