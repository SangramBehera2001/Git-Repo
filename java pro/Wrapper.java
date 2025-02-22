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

    Integer num1 = 100;
    Integer num2 = 100;
    System.out.println(num1 == num2); // true (Because of Integer caching)
    System.out.println(num1.equals(num2)); // true (Same value)

    Integer num3 = 200;
    Integer num4 = 200;
    System.out.println(num3 == num4); // false (Different memory locations)
    System.out.println(num3.equals(num4)); // true (Same value)

  }
}
