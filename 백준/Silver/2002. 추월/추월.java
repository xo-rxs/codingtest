import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> inMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            inMap.put(br.readLine(), i);
        }

        int[] outOrder = new int[N];
        for (int i = 0; i < N; i++) {
            String carNumber = br.readLine();
            outOrder[i] = inMap.get(carNumber);
        }

        int answer = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (outOrder[i] > outOrder[j]) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}