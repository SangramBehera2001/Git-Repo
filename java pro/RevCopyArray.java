public class RevCopyArray {
  public static void main(String[] args) {
    int A[] = {1,2,3,6,5,2,4,8,2,5};
    int B[] = new int[10];

    for( int i = A.length - 1, j = 0; i >= 0; i--, j++)
    {
      
      B[j] = A[i];
      
    }

    for(int i = 0; i < B.length; i++)
      {
        System.out.print(B[i] + ",");
      }
  }
  
}
