package programmers;

public class Problem86051 {
    public static void main(String[] args) {
        //sample case
        int[] numbers = {1, 2, 3, 4, 6, 7, 8 ,0};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers) {
            answer -= i;
        }

        return answer;
    }
}
