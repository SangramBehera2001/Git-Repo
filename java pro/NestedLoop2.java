public class NestedLoop2 {
  public static void main(String[] args) {
   
   int count = 0;
    for(int i =1; i <=5; i++)
    {
      for(int j =1; j <=5; j++)
      {
        count++;
        // System.out.print( count + " ");

        System.out.format( "%02d " , count ); //2 means takes two spaces between every number & 0 means it fills the blank spaces of one digit numbers

      }
      System.out.println("");
    }
  }
}

