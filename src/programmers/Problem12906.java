package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 1;

        list.add(arr[0]);
        while(j < arr.length) {
            if(arr[i] != arr[j]) {
                list.add(arr[j]);
            }

            i++;
            j++;
        }

        int[] answer = new int[list.size()];

        int k = 0;
        for(int x : list) {
            answer[k++] = x;
        }

        return answer;
    }
}
