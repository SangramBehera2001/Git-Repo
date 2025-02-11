import java.util.*;
public class stack{

    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        while(!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }


    }
}
