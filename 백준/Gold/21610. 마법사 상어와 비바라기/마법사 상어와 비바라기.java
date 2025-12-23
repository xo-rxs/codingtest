import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static ArrayList<Point> clouds;

    static int[] dr = {0, 0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dc = {0, -1, -1, 0, 1, 1, 1, 0, -1};

    static class Point {
        int r, c;
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clouds = new ArrayList<>();
        clouds.add(new Point(N - 1, 0));
        clouds.add(new Point(N - 1, 1));
        clouds.add(new Point(N - 2, 0));
        clouds.add(new Point(N - 2, 1));

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            simulation(d, s);
        }

        int totalWater = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                totalWater += map[i][j];
            }
        }
        System.out.println(totalWater);
    }

    static void simulation(int d, int s) {
        boolean[][] visited = new boolean[N][N];

        for (Point cloud : clouds) {
            cloud.r = (cloud.r + dr[d] * (s % N) + N) % N;
            cloud.c = (cloud.c + dc[d] * (s % N) + N) % N;

            map[cloud.r][cloud.c]++;
        }


        int[] diagD = {2, 4, 6, 8};

        for (Point cloud : clouds) {
            visited[cloud.r][cloud.c] = true;

            int count = 0;
            for (int dir : diagD) {
                int nr = cloud.r + dr[dir];
                int nc = cloud.c + dc[dir];

                if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                    if (map[nr][nc] > 0) {
                        count++;
                    }
                }
            }
            map[cloud.r][cloud.c] += count;
        }

        clouds.clear();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] >= 2 && !visited[i][j]) {
                    map[i][j] -= 2;
                    clouds.add(new Point(i, j));
                }
            }
        }
    }
}