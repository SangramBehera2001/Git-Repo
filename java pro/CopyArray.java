public class CopyArray {
  public static void main(String[] args) {
    int A[] = {1,2,3,6,5,2,4,8,2};
    int B[] = new int[10];

    for( int i =0; i < A.length; i++)
    {
      B[i] = A[i];
    }

    for(int i = 0; i < B.length - 1; i++)
      {
        System.out.print(B[i] + ",");
      }
  }
}
