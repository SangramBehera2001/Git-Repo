class NegativeValueException extends Exception{
  public String toString(){
    return "Dimension can't be negative";
  }
}
  
public class ThrowThrows3 {
  public static int area(int l, int b) throws NegativeValueException{
    if(l < 0 || b < 0)
       throw new NegativeValueException();
    return l*b;
  }

  static void meth1() throws NegativeValueException{
    System.out.println(area(-10,5));
  }

  public static void main(String[] args) {
    try{ 
      meth1();
    }
    catch(NegativeValueException e){
      System.out.println(e);
    }
  }
}

