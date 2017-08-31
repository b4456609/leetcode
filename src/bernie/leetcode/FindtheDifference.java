package bernie.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {
    public static void main(String[] args) {
        char theDifference = new FindtheDifference().findTheDifference("qfqqqqpweofpwqoiefjopi", "qfqqqqqpweofpwqoiefjopi");
        System.out.println(theDifference);
    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> cMap = charTimes(s);
        Map<Character, Integer> tMap = charTimes(t);

        for (Character c : tMap.keySet()) {
            if (!tMap.get(c).equals(cMap.get(c))) return c;
        }

        return 'a';
    }

    private Map<Character, Integer> charTimes(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (result.containsKey(c)) {
                Integer integer = result.get(c) + 1;
                result.put(c, integer);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
