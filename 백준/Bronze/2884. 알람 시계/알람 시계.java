import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        if(hours == 0 && minutes < 45){
            hours = 24 - 1;
            minutes = minutes + 60 - 45;
        }else if(minutes < 45){
            hours -= 1;
            minutes = minutes + 60 - 45;
        }else{
            minutes = minutes - 45;
        }
        System.out.println(hours +" "+ minutes);
    }
}