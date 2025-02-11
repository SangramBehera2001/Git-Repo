public class DeleteEle {
  public static void main(String[] args) {
    
    int A[] = new int[10];
    A[0] = 5; A[1] = 9; A[2] = 6; A[3] = 10; A[4] = 12; A[5] = 7;

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

    int index = 2;
    int n = 6;

    for( int i =index; i < n - 2; i++)
    {
      A[i] = A[i+1];
    }

    System.out.println("");

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

  }
}
