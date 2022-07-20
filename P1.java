//program to print n fibonacci numbers
public class P1 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = a, n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}