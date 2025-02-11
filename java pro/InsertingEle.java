public class InsertingEle {
  public static void main(String[] args) {
    
    int A[] = new int[10];
    A[0] = 5;
    A[1] = 9;
    A[2] = 6;
    A[3] = 10;
    A[4] = 12;
    A[5] = 7;

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

    int n =6;
    int x =15;
    int index =2;

    // for(int i = n - 1; i >= index; i--)
    for(int i = n; i > index; i--)

    {
       A[i] = A[i-1];
      //  A[i+1] = A[i];
    }
    A[index] = x;

    System.out.println("");

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

  }
  
}
