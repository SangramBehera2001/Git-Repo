
class Test{
  static{
    System.out.println("First Static");
  }
  static{
    System.out.println("Second Static");
  }
}

public class StaticBlock2 {
  public static void main(String[] args) {
    System.out.println("main");
    Test t = new Test();
  }
}

