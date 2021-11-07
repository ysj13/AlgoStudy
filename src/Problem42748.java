import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        List<int[]> list = new ArrayList<>();
        int[] answer = new int[commands.length];

        int start = 0;
        int end = 0;
        int length = 0;

        for(int i =0; i < commands.length; i++) {
            start = commands[i][0] - 1;
            end = commands[i][1] - 1;
            length = Math.abs(end - start + 1);

            int k = 0;
            int[] tempArr = new int[length];
            for(int j = start; j < start + length; j++) {
                tempArr[k] = array[j];
                k++;
            }

            Arrays.sort(tempArr);
            list.add(tempArr);
        }

        for(int i = 0; i < list.size(); i++) {
            int tempIndex = commands[i][2];
            int[] temp2 = list.get(i);
            answer[i] = temp2[tempIndex - 1];
        }

        return answer;
    }
}
