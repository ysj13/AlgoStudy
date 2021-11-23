package algoList;
/**
 * 중복문자 제거
 */
public class String06 {
    public static void main(String[] args) {
        //sample case
        String str = "ksekkset";

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
