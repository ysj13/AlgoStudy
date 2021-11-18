package algoList;
/**
 * 대소문자 변환
 */
public class String02 {
    public static void main(String[] args) {
        //sample case
        String str = "StuDy";

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
            // 영어 소문자 : 97~122
            if(c >= 97 && c <= 122) {
                answer += (char)(c - 32);
            } else {
                answer += (char)(c + 32);
            }
        }

        return answer;
    }
}
