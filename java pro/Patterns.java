public class Patterns {
  public static void main(String[] args) {
   
    //  for(int i =5; i >=1; i--)
    for(int i =1; i <= 5; i++)
     {
      //  for(int j =1; j <= i; j++)
       for(int j =1; j <=  5-i+1; j++)
       {
       System.out.print( j + " ");
       }
       System.out.println("");

     }
    }
}
