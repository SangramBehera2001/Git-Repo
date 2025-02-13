public class Doubt {
  static int i;
  int j;
  public static void main(String[] args) {

    int i=50;
    Doubt d1 = new Doubt();
    Doubt d2 = new Doubt();

    d1.j = 10;
    d2.j = 20;

    System.out.println(d1.j);
    System.out.println(d2.j);

    d1.i = 30;
    d2.i = 40;

    System.out.println(d1.i);
    System.out.println(d2.i);
  }
}
