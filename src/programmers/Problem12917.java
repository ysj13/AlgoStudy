package programmers;

import java.util.Arrays;

public class Problem12917 {
    public static void main(String[] args) {
        // sample case
        String str = "Zbcdefg";
        System.out.println(solution(str));
    }

    public static String solution(String s) {
        char charArr[] = s.toCharArray();
        Arrays.sort(charArr);

        return new StringBuilder(new String(charArr)).reverse().toString();
    }
}
