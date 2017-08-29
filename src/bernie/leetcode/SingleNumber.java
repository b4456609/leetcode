package bernie.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num))
                numSet.remove(num);
            else
                numSet.add(num);
        }
        for (Integer integer : numSet) return integer;
        return 0;
    }
}
