import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // (1)

        while (T-- > 0) {
            long a = sc.nextLong(); // (2)
            long b = sc.nextLong(); // (3)
            System.out.println(lcm(a, b));
        }
    }

    private static long gcd(long a, long b) { // (4)
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b) { // (5)
        return (a / gcd(a, b)) * b;
    }
}
