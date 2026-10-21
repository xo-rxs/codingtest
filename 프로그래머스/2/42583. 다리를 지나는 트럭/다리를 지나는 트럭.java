import java.util.LinkedList;
import java.util.Queue;

class Solution {
public int solution(int bridge_length, int weight, int[] truck_weights) {
            int i = 0;
            int answer = 0;
            Queue<Integer> q = new LinkedList<>();
            while(i < truck_weights.length){
                answer++;

                if(q.size() >= bridge_length){
                    q.poll();
                }
                
                if((q.stream().mapToInt(Integer::intValue).sum() + truck_weights[i]) <= weight){
                    q.add(truck_weights[i]);
                    i++;
                }else{
                    q.add(0);
                }
                
            }
            answer += bridge_length;

            return answer;
        }
}