import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B = 0;
        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();

            if (A == 0 && B == 0) {
                sc.nextLine();
                break;
            }

            System.out.println(A+B);
        }
    }
}