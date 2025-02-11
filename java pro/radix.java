import java.util.*;
public class radix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    String num = sc.nextLine();

    if(num.matches("[01]+"))
    {
      System.out.println("Binary radix=2");
    }

    else if (num.matches("[0-7]+"))
    {
      System.out.println("Octal radix=8");
    }

    else if (num.matches("[0-9A-F]+"))
    {
      System.out.println("hexadecimal radix=16");
    }

    else if (num.matches("[0-9]+"))
    {
      System.out.println("Decimal radix=10");
    }
    else
    System.out.println("Not a Number");

  }

}
