public class ExceptionDemo {
  public static void main(String[] args) {
    int a=8, b=0, c;

    try{
      c = a/b;
      System.out.println(c);
    }
    catch(ArithmeticException e){
      System.out.println("Denominator should not be zero, Try again");

      System.out.println(e);

    }
    System.out.println("bye");
  }
}
