package programmers;

import java.util.HashMap;
import java.util.Map;

public class Problem42577 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        boolean answer = true;

        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
