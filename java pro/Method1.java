

class Method1 {
  static int inc(int x){//Formal parameters   
    x++;
    return x;
    // System.out.println(x);
  }

public static void main(String args[]){
  int a = 15, b = 10;

  a = inc(a);
  System.out.println(a);
}

}
