public class NoOfRotation {
  public static void main(String[] args) {
    
  int A[] = {1,2,3,4,5,6};
  int n =3;
  for(int i=0; i < n; i++){
    int last = A[A.length-1];

    for(int j= A.length-1; j >0; j-- ){
      A[j] = A[j-1];
    }
    A[0] = last;
  }
  for(int i =0; i<A.length; i++ ){
       System.out.print(A[i]);
  }
  }
}


