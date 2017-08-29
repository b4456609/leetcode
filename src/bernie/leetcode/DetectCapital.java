package bernie.leetcode;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean allCapital = false;
        boolean allNotCapital = false;
        boolean onlyFirstCapital = false;
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 && Character.isUpperCase(word.charAt(i))) {
                allCapital = true;
                onlyFirstCapital = true;
            } else if (i == 0 && Character.isLowerCase(word.charAt(i))) {
                allNotCapital = true;
            }

            if (i == 1 && Character.isUpperCase(word.charAt(i))) {
                allCapital = true;
                onlyFirstCapital = false;
            }
            if (i == 1 && Character.isLowerCase(word.charAt(i))) {
                allCapital = false;
                onlyFirstCapital = true;
            }

            if (i > 1 && allCapital && Character.isLowerCase(word.charAt(i))) {
                return false;
            }

            if (i >= 1 && (allNotCapital || onlyFirstCapital) && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
