import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int sum1 = sc.nextInt();
            int sum2 = sc.nextInt();
            System.out.println(sum1+sum2);
        }
    }
}