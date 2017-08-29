package bernie.leetcode;

import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 3};
        int result = new DistributeCandies().distributeCandies(candies);
        System.out.println(result);
    }

    public int distributeCandies(int[] candies) {
        long count = Arrays.stream(candies).boxed().distinct().count();
        int i = Long.valueOf(count).intValue();
        return Math.min(i, candies.length / 2);
    }
}
