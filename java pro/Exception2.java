public class Exception2 {
  public static void main(String[] args) {
    
  int A[] = {40,30,50,20,0};
    try{
  int c = A[0]/A[3];
  System.out.println(c);

  System.out.println(A[5]);
    }

    catch(ArithmeticException e){
      System.out.println("Wrong Denominator");
    }

    catch(ArrayIndexOutOfBoundsException c){
      System.out.println("Invalid Index");
    }
    System.out.println("bye");
}
}
