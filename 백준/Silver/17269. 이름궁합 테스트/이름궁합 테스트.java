import java.util.*;

public class Main {
    static int[] alpha = {
        3,2,1,2,4,3,1,3,1,1,3,1,3,
        2,1,2,2,2,1,2,1,1,1,2,2,1
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        int len = Math.max(N, M);
        int[] arr = new int[N + M];

        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (i < N) arr[idx++] = alpha[A.charAt(i) - 'A'];
            if (i < M) arr[idx++] = alpha[B.charAt(i) - 'A'];
        }

        int size = idx;
        while (size > 2) {
            for (int i = 0; i < size - 1; i++) {
                arr[i] = (arr[i] + arr[i + 1]) % 10;
            }
            size--;
        }

        System.out.printf("%d%%\n", arr[0] * 10 + arr[1]);
    }
}
