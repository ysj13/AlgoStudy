package algoList;

/**
 * 회문문자열
 */
public class String07 {
    public static void main(String[] args) {
        //sample case
        String str = "abcBA";
        System.out.println(solution(str));
        System.out.println(solution2(str));
    }

    public static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int length = str.length();
        for(int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }

    public static String solution2(String str) {
        String answer = "NO";
        String temp = new StringBuilder(str).reverse().toString();
        //equals는 대소문자 구분함
        // 대소문자 구분 하지않고 비교함
        if(str.equalsIgnoreCase(temp)) {
            answer = "YES";
        }

        return answer;
    }
}
