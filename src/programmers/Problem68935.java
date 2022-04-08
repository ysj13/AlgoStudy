package programmers;

import java.util.ArrayList;

public class Problem68935 {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(n > 0) {
            list.add(n % 3);
            n = n / 3;
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * (int) Math.pow(3, list.size() -1 - i);
        }

        return answer;
    }

}
