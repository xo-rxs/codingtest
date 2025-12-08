import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for(int i = N - 1 ; i >= 0 ; i--){
            count += K / a[i];
            K %= a[i];
        }
        System.out.println(count);
    }
}

