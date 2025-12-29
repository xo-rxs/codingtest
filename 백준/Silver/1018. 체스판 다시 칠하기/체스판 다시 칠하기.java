import java.util.*;
import java.io.*;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minCount = Integer.MAX_VALUE;

        for(int i = 0; i <= n - 8; i++) {
            for(int j = 0; j <= m - 8; j++) {

                int WCount = 0;
                int BCount = 0;

                for(int r = 0; r < 8; r++) {
                    for(int c = 0; c < 8; c++) {
                        char now = board[i + r][j + c];

                        if ((r + c) % 2 == 0) {
                            if(now != 'W') WCount++;
                            if(now != 'B') BCount++;
                        } else {
                            if(now != 'B') WCount++;
                            if(now != 'W') BCount++;
                        }
                    }
                }

                int currentMin = min(WCount, BCount);
                minCount = min(currentMin, minCount);
            }
        }

        System.out.println(minCount);
    }
}
