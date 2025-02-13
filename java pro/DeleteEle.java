public class DeleteEle {
  public static void main(String[] args) {
    
    int A[] = new int[10];
    A[0] = 5; A[1] = 9; A[2] = 6; A[3] = 10; A[4] = 12; A[5] = 7;A[6]=43;A[7]=13;A[8]=67;A[9]=33;

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

    int index = 2;
    int n = 6;

    for( int i =index; i < A.length-1; i++)
    {
      A[i] = A[i+1];
    }
    A[A.length-1] = 0;

    System.out.println("");

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

  }
}
