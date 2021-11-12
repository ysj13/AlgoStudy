package programmers;

import java.util.HashMap;

public class Problem42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion =  {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String str : completion) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String str : map.keySet()) {
            if(map.get(str) % 2 != 0) {
                answer = str;
            }
        }

        return answer;
    }
}
