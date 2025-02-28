import java.util.*;
public class Arraylist {
  public static void main(String[] args) {
    ArrayList <Integer> a1 = new ArrayList<>(20);

    ArrayList <Integer> a2 = new ArrayList<>(List.of(30,40,50,60,70));

    a1.add(10);
    a1.add(0, 20);
    a1.addAll( a2);

    System.out.println(a1);
  }
}
