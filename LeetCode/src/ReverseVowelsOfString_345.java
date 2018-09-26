import java.util.Arrays;
import java.util.HashSet;

/**
 * 使用双指针，指向待反转的两个元音字符，一个指针从头向尾遍历，一个指针从尾到头遍历。
 */
public class ReverseVowelsOfString_345 {

    public static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public String reverse(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while(i <= j) {
            if(!vowels.contains(s.charAt(i))) {
                result[i] = s.charAt(i);
                i++;
            } else if(!vowels.contains(s.charAt(j))) {
                result[j] = s.charAt(j);
                j--;
            } else {
                result[i] = s.charAt(j);
                result[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        return new String(result);
    }
}
