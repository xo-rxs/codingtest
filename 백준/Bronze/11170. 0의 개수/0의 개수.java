import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int cnt = 0;

            for(int j=n;j<=m;j++){
                for(int k = 0; k < String.valueOf(j).length(); k++){
                    if(String.valueOf(j).charAt(k) == '0'){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}