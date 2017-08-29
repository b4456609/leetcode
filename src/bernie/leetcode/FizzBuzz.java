package bernie.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> strings = new FizzBuzz().fizzBuzz(15);
        System.out.println(strings);
    }

    public List<String> fizzBuzz(int n) {
        List<String> lists = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) lists.add("FizzBuzz");
            else if (i % 3 == 0) lists.add("Fizz");
            else if (i % 5 == 0) lists.add("Buzz");
            else lists.add("" + i);
        }
        return lists;
    }
}
