package programmers;

import java.util.Arrays;

public class Problem12954 {
    public static void main(String[] args) {
        int x = 10000000;
        int n = 1000;

        System.out.println(Arrays.toString(solution(x, n)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for(int i = 0; i < n; i++) {
            answer[i] = x + (long) i * x;
        }

        return answer;
    }
}
