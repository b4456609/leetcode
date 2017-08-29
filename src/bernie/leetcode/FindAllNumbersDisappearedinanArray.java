package bernie.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            sets.add(num);
        }
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!sets.contains(i)) integers.add(i);
        }
        return integers;
    }
}
