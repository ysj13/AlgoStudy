package programmers;

public class Problem12903 {
    public static void main(String[] args) {
        // sample case
        String s = "abcde";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];

        int i = 0;
        for(char c : s.toCharArray()) {
            arr[i++] = Character.toString(c);
        }

        if(s.length() % 2 != 0) {
            answer = arr[s.length()/2];
        } else {
            int a = (s.length() - 1)/2;
            int b = a + 1;
            answer += arr[a];
            answer += arr[b];
        }

        return answer;

    }
}
