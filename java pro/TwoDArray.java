public class TwoDArray {
  public static void main(String[] args) {
    
    int B[][] = {{2,3,6}, {5,2,9}, {3,6,9}};
     
   for(int i =0; i < B.length; i++)
   {
      for(int j = 0; j < B[0].length; j++)
      {
        System.out.print(B[i][j] + ",");
      }
      System.out.println("");
   }
   
   for(int x[]: B)
   {
    for(int y: x)
    {
      System.out.print(y + ",");
    }
    System.out.println("");
   }
  }
  
}
