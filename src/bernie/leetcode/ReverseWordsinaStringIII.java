package bernie.leetcode;

import java.util.stream.Stream;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String result = new ReverseWordsinaStringIII().reverseWords("Let's take LeetCode contest");
        System.out.printf(result);
        assert (result.equals("s'teL ekat edoCteeL tsetnoc"));
    }

    public String reverseWords(String s) {
        String[] strings = Stream.of(s.split(" "))
                .map(string -> new StringBuilder(string).reverse().toString())
                .toArray(String[]::new);
        return String.join(" ", strings);
    }
}
