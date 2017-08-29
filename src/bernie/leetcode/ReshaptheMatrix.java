package bernie.leetcode;

import java.util.Arrays;

public class ReshaptheMatrix {
    public static void main(String[] args) {
        int[][] test1 = {{1, 2}, {3, 4}};
        int[][] ints = new ReshaptheMatrix().matrixReshape(test1, 4, 1);
        System.out.println(Arrays.toString(ints[0]));
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) return nums;
        int[] tempNums = new int[nums.length * nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                tempNums[i * nums[0].length + j] = nums[i][j];
            }
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = tempNums[i * c + j];
            }
        }
        return result;
    }
}
