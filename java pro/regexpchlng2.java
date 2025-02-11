public class regexpchlng2 {
  public static void main(String[] args) {
    int b = 10001021;
    String str = String.valueOf(b);

    System.out.println(str.matches("[01]+"));

    String str1 = "234AD";
    System.out.println(str1.matches("[0-9A-F]+"));

    String d = "01/12/2000";
    System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
  }
  
}
