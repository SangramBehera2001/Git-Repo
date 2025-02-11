public class method2 {
  
  static void update(int B[]){
    B[0] = 23;
  }
  
  public static void main(String[] args) {
    int A[] = {5,6,8,7,9};
    update(A);
    System.out.println(A[0]);
  }
  
}
