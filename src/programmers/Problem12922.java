package programmers;

public class Problem12922 {
    public static void main(String[] args) {
        // sample case
        int n = 3;
        System.out.println(soultion(n));
    }

    public static String soultion(int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < n; i ++) {
            if(i % 2 == 0) {
                answer.append("수");
            }

            if(i % 2 != 0) {
                answer.append("박");
            }
        }

        return answer.toString();
    }
}
