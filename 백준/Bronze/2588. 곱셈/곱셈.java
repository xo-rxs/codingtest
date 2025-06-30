import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, num1, num2;
    num = sc.nextInt();
    num1 = sc.nextInt();

    num2 = num * (num1 % 10);
    System.out.println(num2);
    num2 = num * (num1 % 100 / 10);
    System.out.println(num2);
    num2 = num * (num1 / 100);
    System.out.println(num2);
    num2 = (num * num1);
    System.out.println(num2);
    }
}