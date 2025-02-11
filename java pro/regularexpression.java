public class regularexpression {
  public static void main(String[] args) {
    String str = "av";

    System.out.println(str.matches("."));

    System.out.println(str.matches("[abc]"));

    System.out.println(str.matches("[^abc]"));

    System.out.println(str.matches("[abc][vz]"));



  }
  
}
