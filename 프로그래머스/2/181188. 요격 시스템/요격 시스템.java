import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int temp = 0;
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        for (int[] arr : targets) {
        if(arr[0] >= temp){
            answer++;
            temp = arr[1];
        }
                
            
        }
        return answer;
    }
}