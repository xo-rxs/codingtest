import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            time[i][0] = in.nextInt(); //시작 시간
            time[i][1] = in.nextInt(); //종료 시간
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0]; // 끝 시간이 같으면 시작 시간 오름차순
                }
                return o1[1] - o2[1]; 
            }
        });


        int count = 0;
        int end = 0;

        for(int i = 0; i < N; i++) {
            
            if(end <= time[i][0]) {
                end = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
