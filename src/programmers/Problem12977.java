package programmers;

public class Problem12977 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(nums);
    }

    boolean isPrime(int num) {
        boolean tf = true;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                tf = false;
                break;
            }
        }

        return tf;
    }

    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
