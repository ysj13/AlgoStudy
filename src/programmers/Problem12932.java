package programmers;

public class Problem12932 {
    public static void main(String[] args) {
        // sample case
        long n = 12345;

        System.out.println(solution(n));
    }

    public static int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];

        int j = 0;
        for(int i = num.length() - 1; i >= 0; i--) {
            answer[j] = Character.getNumericValue(num.charAt(i));
            j++;
        }

        return answer;
    }
}
