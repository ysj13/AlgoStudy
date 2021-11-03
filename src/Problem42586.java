import java.util.*;

public class Problem42586 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] dayCount = new int[progresses.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < progresses.length; i++) {
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                dayCount[i] += 1;
            }
        }

        int min = Integer.MIN_VALUE;
        for(int i = 0; i < dayCount.length; i++) {
            if(dayCount[i] >= min) {
                min = dayCount[i];
            }

            int key = min;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Map<String, Integer> sortMap = new LinkedHashMap();
        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        Map<Integer, Integer> resultMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry : entries) {
            resultMap.put(entry.getKey(), entry.getValue());
        }

        int index = 0;
        int[] answer = new int[resultMap.size()];
        for(Integer i : resultMap.values()) {
            answer[index] = i;
            index++;
        }

        System.out.println(answer);
    }
}
