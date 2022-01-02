package programmers;

public class Problem82612 {
    public static void main(String[] args) {
        // sample case
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(solution(price, money, count));
    }

    public static long solution(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i ++) {
            answer += (long) price * i;
        }

        if(answer <= money) {
            answer = 0;
        } else {
            answer = Math.abs(answer - money);
        }

        return answer;
    }
}
