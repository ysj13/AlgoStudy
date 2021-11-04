import java.util.HashMap;
import java.util.Map;

public class Problem62950 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        solution(clothes);
    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> counts = new HashMap<>();

        for(String[] c : clothes) {
            String type = c[1];
            counts.put(type, counts.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for(Integer i : counts.values()) {
            answer *= i + 1;
        }

        answer -= 1;

        return answer;
    }
}
