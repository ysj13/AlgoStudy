package algoList;

/**
 * 문장 속 단어
 * 한 개의 문장속에서 가장 긴 단어 찾기
 */
public class String03 {
    public static void main(String[] args) {
        //sample case
        String str = "it is time to study";

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        int n = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String temp = str.substring(0, pos);
            int length = temp.length();
            if(length > n) {
                n = length;
                answer = temp;
            }

            str = str.substring(pos + 1);
        }

        if(str.length() > n) {
            answer = str;
        }

        return answer;
    }
}
