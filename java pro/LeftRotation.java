public class LeftRotation {
  public static void main(String[] args) {
    int A[] = {2,1,5,3,6,4,5,8,9};

    for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }

      int temp = A[0];
       for(int i = 1; i < A.length; i++)
       {
        A[i -1] = A[i];
       }
       A[A.length - 1] = temp;

       System.out.println("");

       for(int i = 0; i < A.length; i++)
      {
        System.out.print(A[i] + ",");
      }
  }
}
