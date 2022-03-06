package algoList;

/**
 * 문자열 압축
 */
public class String11 {
    public static void main(String[] args) {
        String s = "KKHSSSSSSSE";
        s = s + " ";
        String answer = "";
        int count = 1;

        for(int i = 0 ; i< s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                answer += s.charAt(i);
                if(count > 1) {
                    answer += Integer.toString(count);
                    count = 1;
                }
            }
        }

        System.out.println("answer = " + answer);

    }
}
