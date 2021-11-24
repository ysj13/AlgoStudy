package algoList;

/**
 * 특정문자 뒤집기 toCharArray()
 */
public class String05 {
    public static void main(String[] args) {
        //sample case
        // 알파뱃만 뒤집힌 문자열만 출력
        String str = "a#b!GE*T@S";
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(charArr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])) {
                rt--;
            } else {
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }
}
