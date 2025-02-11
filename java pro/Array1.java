public class Array1 {
  public static void main(String[] args) {
    
    int A[] = new int[10];

    int B[] = {2,4,5,3,7};

    int C[];
    C = new int[10];

    B[2] = 15;

    for(int i = 0; i < B.length; i++)
    {
      System.out.println(B[i]++);
    }

    // for(int x : B)
    // {
    //   System.out.println(++x);
    // }

    for(int x : B)
    {
      System.out.println(x);//after increasing the values of x that is elements of B as done in the previous for loop still it is not increasing here in this loop.
    }
   
  }
  
}
