package programmers;

public class Problem12949 {
    public static void main(String[] args) {
        // sample case
        int arr1[][] = {{1, 4}, {3, 2}, {4, 1}};
        int arr2[][] = {{3, 3}, {3, 3}};

        System.out.println(solution(arr1, arr2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1[0].length][arr2[0].length];

        int n = 0;
        for(int i = 0; i < arr1[0].length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                for(int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[n][k] * arr2[k][j];
                }
            }

            n++;
        }

        return answer;
    }
}
