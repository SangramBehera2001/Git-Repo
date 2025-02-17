public class StaticBlock {

  static{
    System.out.println("First Static");
  }
  public static void main(String[] args) {
    System.out.println("main");
  }

  static{
    System.out.println("Second Static");
  }
}
