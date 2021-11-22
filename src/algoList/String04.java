package algoList;

import java.util.ArrayList;

/**
 *  단어 뒤집기 StringBuider 이용 or 직접 뒤집기
 */
public class String04 {
    public static void main(String[] args) {
        // sample case
        int n = 3;
        String[] str = {"good", "Time", "Big"};

        System.out.println(solution(n, str));
    }

    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s : str) {
            // StringBuilder 사용
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }
}
