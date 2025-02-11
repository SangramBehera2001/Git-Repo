public class regexpchlng {
  public static void main(String[] args) {
    
    String str = "sangrambehera2001@gmail.com";

    int i = str.indexOf("@");

    String uname = str.substring(0,i);
    String domain = str.substring(i+1,str.length());

    System.out.println(uname );
    System.out.println(domain);

    int j = domain.indexOf(".");
    String name = domain.substring(0,j);

    System.out.println(name.equals("gmail"));

    System.out.println(str);

  }
}
