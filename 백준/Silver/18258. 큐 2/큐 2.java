import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] queue = new int[N];
        int front = 0;
        int back = 0;

        while (N-- > 0) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                queue[back++] = x;     // back 위치에 넣고 back 증가
            }

            else if (command.equals("pop")) {
                if (front == back) sb.append(-1).append('\n');
                else sb.append(queue[front++]).append('\n');  // front 값 꺼내고 front 증가
            }

            else if (command.equals("size")) {
                sb.append(back - front).append('\n');
            }

            else if (command.equals("empty")) {
                sb.append(front == back ? 1 : 0).append('\n');
            }

            else if (command.equals("front")) {
                if (front == back) sb.append(-1).append('\n');
                else sb.append(queue[front]).append('\n');
            }

            else if (command.equals("back")) {
                if (front == back) sb.append(-1).append('\n');
                else sb.append(queue[back - 1]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
