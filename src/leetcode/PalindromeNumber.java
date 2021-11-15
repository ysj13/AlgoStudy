package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        // sample case
        int x = 1234321;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        boolean output = true;

        String s = Integer.toString(x);

        int index = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(index) != s.charAt(i)) {
                output = false;
            }

            index++;
        }

        return output;
    }
}
