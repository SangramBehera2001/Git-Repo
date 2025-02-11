public class SearchElement {
  public static void main(String[] args) {
    
    int key = 6;
    int A[] = {2,5,4,8,9,6,3,1,0};

    for(int i =0; i < A.length; i++)
    {
       if( A[i] == key)
       {
        System.out.println(i);
        System.exit(0);
       }
    }
    System.out.println("Not Found");
  }
  
}
