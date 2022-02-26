package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String t = "anagram";
        String s = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        boolean answer = false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String t1 = new String(arr2);

        if(s1.equals(t1)) {
            answer = true;
        }

        return answer;
    }

}
