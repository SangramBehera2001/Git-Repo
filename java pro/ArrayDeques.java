import java.util.*;
public class ArrayDeques {
  public static void main(String[] args) {
    ArrayDeque<Integer> dq= new ArrayDeque<>();

    dq.offerFirst(10);
    dq.offerFirst(20);

    dq.offerLast(30);
    dq.offerLast(40);

    // System.out.println(dq);

    dq.forEach(n-> System.out.println(n));
    
  }
}
