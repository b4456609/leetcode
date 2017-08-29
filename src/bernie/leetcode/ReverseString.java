package bernie.leetcode;

public class ReverseString {
    public static void main(String[] args) {
        String hello = new ReverseString().reverseString("hello");
        System.out.println(hello);
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
