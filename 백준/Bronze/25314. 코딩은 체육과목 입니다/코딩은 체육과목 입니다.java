import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 4;
        int cnt = 0;
        int N = Integer.parseInt(st.nextToken());
        int sum = N;
        for(int i = 0; i < N; i++){
            sum -= num;
            cnt++;
            if(sum == 0){
                break;
            }
        }
        for(int i = 0; i < cnt; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}