import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];   // 크기 지정
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            int temp = 0;
            while( !stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                temp = stack.pop();
                answer[temp] = i - temp;
            }
            stack.add(i);
        }

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            answer[temp] = prices.length - temp - 1;
        }
        return answer;
    }
}