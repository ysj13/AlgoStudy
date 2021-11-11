package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == target - nums[j]) {
                    numList.add(nums[i]);
                    numList.add(nums[j]);
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(numList.contains(nums[i])) {
                tempList.add(i);
            }
        }

        int[] output = new int[tempList.size()];

        for(int i = 0; i < output.length; i++) {
            output[i] = tempList.get(i).intValue();
        }

        return output;
    }
}
