import java.util.Scanner;

public class sum {

    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println(c);
   }
}

