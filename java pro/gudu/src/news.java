public class news {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C;
        System.out.println("Before exchange: A = " + A + ", B = " + B);
        C = A;
        A = B;
        B = C;
        System.out.println("After exchange: A = " + A + ", B = " + B);
    }
}
