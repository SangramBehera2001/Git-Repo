public class SumArray {
  public static void main(String[] args) {
   
   int A[] = {3,5,4,8,9,6,1,4,1};
    int sum = 0;

    // for(int i =0; i < A.length; i++ )
    // {
    //   sum = sum + A[i];
    // }

    // System.out.println("sum is " + sum);

    for (int x : A)
    {
      sum = sum +x;
    }
    System.out.println(sum);
  }
}
