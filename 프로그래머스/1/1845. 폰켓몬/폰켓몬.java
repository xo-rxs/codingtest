import java.util.*;
class Solution {
            public int solution(int[] nums) {
                Map<Integer, Integer> map = new HashMap<>();

                for(int number:nums){
                    map.put(number, map.getOrDefault(number, 0)+1);
                }

                int max_choose_ponketmon = nums.length/2;

                int type = map.size();

                return Math.min(type, max_choose_ponketmon);
            }
        }
