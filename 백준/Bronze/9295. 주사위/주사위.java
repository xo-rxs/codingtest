import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            int sum =  num+num2;
            System.out.println("Case " + i + ": " + sum);
        }
    }
}