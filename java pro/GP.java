import java.util.Scanner;

public class GP {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a, r, n");
    int a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();

    int temp = a;

    for ( int i = 0; i < n; i ++){
         System.out.print(temp + ",");
         temp = temp * r;
    }
   }
  }
