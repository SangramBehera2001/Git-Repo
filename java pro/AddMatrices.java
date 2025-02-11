public class AddMatrices {
  public static void main(String[] args) 
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,3,0},{8,1,2},{5,1 ,1}};
        
        int C[][]=new int[3][3];
    
        for(int i=0; i< A.length ;i++)
        {
            for(int j=0;j< A[0].length;j++)
            {
                
               C[i][j] = A[i][j] + B[i][j];
                
            }
        }
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    
    }
}
