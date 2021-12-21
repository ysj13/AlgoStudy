package programmers;

public class Problem12916 {
    public static void main(String[] args) {
        // sample case
        String s = "pPoooyY";

        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        for(char c : s.toCharArray()) {
            if("P".equals(Character.toString(c).toUpperCase())) {
                pCount++;
            }

            if("Y".equals(Character.toString(c).toUpperCase())) {
                yCount++;
            }
        }

        if(pCount != yCount) {
            answer = false;
        }

        return answer;
    }


}
