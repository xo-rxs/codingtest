import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 박스 개수
        int m = sc.nextInt(); // 책 개수

        int[] box = new int[n];
        int[] book = new int[m];

        for (int i = 0; i < n; i++) {
            box[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            book[i] = sc.nextInt();
        }

        int x = 0; // 현재 박스 index

        for (int i = 0; i < m; i++) {

            // 박스를 전부 사용했으면 끝
            if (x >= n) break;

            // 현재 박스에 책이 들어갈 때까지 이동
            while (x < n && box[x] < book[i]) {
                x++;
            }

            // 책을 넣을 수 있는 박스가 없으면 종료
            if (x >= n) break;

            // 책 넣기
            box[x] -= book[i];
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += box[i];
        }

        System.out.println(result);
    }
}
