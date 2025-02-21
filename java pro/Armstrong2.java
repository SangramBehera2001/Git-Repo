import java.util.Scanner;
public class Armstrong2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int m =n;
    int count=0;
    while (n > 0) {
      n /= 10;
      count++;
    }
    int digits = count;
    int sum = 0,r;
    int num=m;
    while(m > 0){
       r= m %10;
       sum += Math.pow(r, digits);
       m/=10;
    }
    if(sum == num){
      System.out.println("It is an Armstrong Number");
    }
    else{
      System.out.println("It is not an Armstrong Number");
    }

  }
}
