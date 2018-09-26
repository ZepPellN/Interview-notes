/**
 * 题目描述：可以删除一个字符，判断是否能构成回文字符串。
 */
public class ValidPalindromes_680 {

    private boolean isPalindrome(String s, int i ,int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = -1, j = s.length();
        while(++i < --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }
}
