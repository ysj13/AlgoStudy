package programmers;

public class Problem81301 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] num = {"zero", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "ten"};

            for(int i = 0; i < num.length; i++) {
                s = s.replace(num[i], Integer.toString(i));
            }

            answer = Integer.parseInt(s);

            return answer;
        }
    }
}
