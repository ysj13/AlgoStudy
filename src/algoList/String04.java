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
        System.out.println(solution2(n, str));
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

    public static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s : str) {
            // 직접 뒤집기
            char[] c = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;

            while(lt < rt) {
                char temp = c[lt];
                c[rt] = temp;
                lt++;
                rt--;
            }

            String temp = String.valueOf(c);
            answer.add(temp);
        }

        return answer;
    }


}
