package algoList;

public class String08 {
    public static void main(String[] args) {
        String s = "found7, time: study; Yduts; emit, 7Dnuof";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "NO";

        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(s).reverse().toString();
        if(s.equals(temp)) {
            answer = "YES";
        }

        return answer;
    }
}
