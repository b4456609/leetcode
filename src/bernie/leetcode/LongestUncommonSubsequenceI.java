package bernie.leetcode;

public class LongestUncommonSubsequenceI {
    public static void main(String[] args) {
        int luSlength = new LongestUncommonSubsequenceI().findLUSlength("aba", "cdc");
        System.out.println(luSlength);
    }

    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}