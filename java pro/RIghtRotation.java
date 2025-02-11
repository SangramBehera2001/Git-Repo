public class RIghtRotation {
  public static void main(String[] args) {
    int A[] = {2,1,5,3,6,4,5,8,9};

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

      int temp = A[A.length-1];
       for(int i = A.length-2; i >= 0; i--)
       {
        A[i + 1] = A[i];
       }
       A[0] = temp;

       System.out.println("");

       for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }
  }
}

