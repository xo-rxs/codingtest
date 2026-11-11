import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        // 숫자를 문자열로 변환
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 이어 붙였을 때 더 큰 수가 되는 순서로 정렬
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 모든 숫자가 0인 경우
        if (arr[0].equals("0")) {
            return "0";
        }

        return String.join("", arr);
    }
}