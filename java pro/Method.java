

class Method {
  int max(int x, int y){//Formal parameters   
    // x++;
    if(x > y)
        return x;
        else 
        return y;
       
  }

public static void main(String args[]){
  int a = 15, b = 10, c;

  Method m = new Method();
  c = m.max(a,b);//Actual Parameters
  System.out.println(c);
}

}