package programmers;

import java.util.Stack;

public class Problem12909 {
    public static void main(String[] args) {
        //sample case
        String s = "(())()";

        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) == ')') {
            answer = false;
        } else {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                }

                if(s.charAt(i) == ')' && !stack.empty()) {
                    stack.pop();
                }
            }
        }

        if(!stack.empty()) {
            answer = false;
        }

        System.out.println(answer);
    }
}
