import java.util.*;
public class switchcase2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("MENU");
    System.out.println("ADD");
    System.out.println("SUB");
    System.out.println("MUL");
    System.out.println("DIV");

    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter options in words");
    String option = sc.nextLine();
    option = option.toUpperCase();

    switch(option)
    {
      case "ADD": System.out.println("Sum is " + (a + b));
      break;
      case "SUB": System.out.println("Difference is " + (a - b));
      break;
      case "MUL": System.out.println("product is " + (a * b));
      break;
      case "DIV": System.out.println("Ratio is " + (a / b));
      break;
      default : System.out.println("Invalid Optoin");
      
    }
  }
  
}
