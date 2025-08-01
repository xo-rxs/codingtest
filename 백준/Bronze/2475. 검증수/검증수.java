import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception  {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int temp = sc.nextInt();
            sum += temp * temp;
        }
        int result = sum % 10;
        System.out.println(result);
    }
}