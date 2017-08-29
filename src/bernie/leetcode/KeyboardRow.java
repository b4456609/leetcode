package bernie.leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] results = new KeyboardRow().findWords(words);
        System.out.println(Arrays.toString(results));
    }

    public String[] findWords(String[] words) {
        return Stream.of(words)
                .filter(word -> {
                    return word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*");
                })
                .toArray(String[]::new);
    }
}
