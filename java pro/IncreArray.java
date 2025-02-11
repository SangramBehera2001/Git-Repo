public class IncreArray {
  public static void main(String[] args) {
    int A[] = {1,2,3,6};
    int B[] = new int[10];

    for( int i =0; i < A.length; i++)
    {
      B[i] = A[i];
    }
    A = B;
      
        System.out.print("length is " + A.length);
      }
}
