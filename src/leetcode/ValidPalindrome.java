package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        boolean answer = true;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                sb.append(Character.toString(c).toLowerCase());
            } else if(c >= '0' && c <= '9') {
                sb.append(c);
            }
        }

        String temp = sb.toString();
        for(int i = 0; i < sb.length(); i++) {
            if(temp.charAt(i) != temp.charAt(sb.length() - 1 - i)) {
                answer = false;
                break;
            }
        }

        return answer;

    }
}
