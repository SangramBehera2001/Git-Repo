public class Wrapper {
  public static void main(String[] args) {
    // @SuppressWarnings("removal")
    // Integer i = new Integer(10);

    Integer i = Integer.valueOf(12);

    int j = i;
    Integer m1 = Integer.valueOf("125");
    System.out.println(i);
    System.out.println(m1);

    Integer m2= Integer.valueOf("1011", 2);
    System.out.println(m2);

    System.out.println(Integer.reverse(12));
    System.out.println(Integer.toBinaryString(15));
  }
}
