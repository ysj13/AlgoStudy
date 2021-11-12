package programmers;

import java.util.Arrays;

public class Problem12901 {
    public static void main(String[] args) {
        // sample case
        int a = 5;
        int b = 24;

        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        String answer = "";
        int monthSum = 0;
        int result = 0;

        if(a != 1) {
            for(int i = 1; i < a; i++) {
                monthSum += month[i];
            }
        }

        if(a == 1) {
            monthSum = b;
        }

        monthSum = monthSum + b;

        for(String x : day) {
            if(Arrays.asList(day).indexOf(x) == monthSum%7) {
                answer = x;
            }
        }

        return answer;
    }
}
