import java.io.*;
public class FileExample2 {
  public static void main(String[] args) throws IOException {
    try    (FileInputStream fis = new FileInputStream("C:/MyJava/Test.txt"))
    {
      byte b[] = new byte[fis.available()];
      fis.read(b);

      String str = new String(b);
      System.out.println(str);
  }
  catch(FileNotFoundException e){
    System.out.println(e);
  }
}
}
