public class MaxElement {
  public static void main(String[] args) {
    
    int A[] = {2,3,1,5,6,4,9,8,7};
    int max = A[0];

    for( int i =0; i < A.length; i++)
    {
      if (A[i] > max)
      {
        max = A[i];
      }
    }
    System.out.println(max);
  }
  
}
