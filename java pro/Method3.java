public class Method3 {

  static void change(int A[],int index,int value)
  {
      A[index]=value;
  }
  
  static int change2(int x,int value)
  {
      x=value;
      return x;
  }
  
  public static void main(String[] args) {
      int A[]={2,4,6,8,10};
      
      change(A,2,20);
      
      for(int x:A)
      {
          System.out.print(x + ",");
      }
      System.out.println("");
      int x=10;
      
      x = change2(x,20);
      
      System.out.println("Value of primitive "+ x);
  }
  
}
