public class string3 {
  public static void main(String args[]){
    String str1 = "Mr. Sangram Behera"; 
    System.out.println(str1.startsWith("Mr."));
    System.out.println(str1.startsWith("Sa"));

    System.out.println(str1.startsWith("Sang", 4));

    System.out.println(str1.charAt(5));

    System.out.println(str1.indexOf('a'));

    System.out.println(str1.indexOf('a', 6));
    
    System.out.println(str1.lastIndexOf('a'));
    

  }
  
}
