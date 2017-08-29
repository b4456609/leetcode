package bernie.leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1};
        int maxConsecutiveOnes = new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] != nums[i + 1] && nums[i + 1] == 1) {
                temp = 0;
            }
            if (nums[i] == 1) temp++;
            if (i + 1 < nums.length && nums[i] != nums[i + 1] && nums[i + 1] == 0) {
                result = Math.max(result, temp);
            }
        }
        result = Math.max(result, temp);
        return result;
    }
}
