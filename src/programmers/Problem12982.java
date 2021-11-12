package programmers;

import java.util.Arrays;

public class Problem12982 {

    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;
            int sum = 0;

            Arrays.sort(d);

            if(d.length > 1) {
                for(int i = 0; i < d.length; i++) {
                    if(budget >= sum) {
                        sum += d[i];
                        answer++;
                    }

                    if(sum > budget) {
                        sum = sum - d[i-1];
                        answer--;
                        break;
                    }
                }
            }

            if(d.length == 1) {
                if(d[0] > budget) {
                    answer = 0;
                } else {
                    answer = 1;
                }
            }

            return answer;
        }
    }
}
