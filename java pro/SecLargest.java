public class SecLargest {
  public static void main(String[] args) {
    
    int A[] = {2,3,1,5,6,4,9,8,7};
    int max1, max2;
    max1 = max2 = A[0];

    for( int i =0; i < A.length; i++)
    {
      if (A[i] > max1)
      {
        max2 = max1;
        max1 = A[i];
      }
      else if (A[i] > max2)
      {
        max2 = A[i];
      }
    }
    System.out.println(max2);
  } 
}

