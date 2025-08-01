import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int sum = factorial(n);
        System.out.println(sum);
    }

    public  static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }
}