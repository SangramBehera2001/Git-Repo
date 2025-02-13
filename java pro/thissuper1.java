class Rectanglex{
    int length;
    int breadth;
    Rectanglex(int length, int b){
      this.length=length;
      breadth=b;
    }
    void display(){
      System.out.println("Length is " + length);
      System.out.println("Breadth is " + breadth);
    }
}
public class thissuper1 {
  public static void main(String[] args) {
    Rectanglex r = new Rectanglex(10,20);
    r.display();

  }
}
