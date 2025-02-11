import java.util.Scanner;

public class Armstrong {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    
    int m = n;
    int r;
    int sum = 0;
    while(n > 0)
    {
      r = n % 10;
      sum = sum + r*r*r;
      n = n / 10;
      // System.out.println(sum);
    }

    if (m == sum)
    {
      System.out.println("It is an Armstrong Number");
    }
    else 
    System.out.println("Not an Armstrong Number");

   }
}

