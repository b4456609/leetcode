package bernie.leetcode;

import java.util.Arrays;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {1, 2, 3, 4};
        int[] i = new NextGreaterElementI().nextGreaterElement(a, b);
        System.out.println(Arrays.toString(i));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            int temp = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) found = true;
                if (found && nums1[i] < nums2[j]) {
                    temp = nums2[j];
                    break;
                }
            }
            result[i] = temp;
        }
        return result;
    }
}
