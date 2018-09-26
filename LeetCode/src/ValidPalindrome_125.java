/**
 * @author zsq
 * @version 1.0
 * @date 2018/09/26
 */
public class ValidPalindrome_125 {

  public static void main(String args[]) {
    System.out.println(isPalindrome("race a car"));
  }
  public static boolean isPalindrome(String s) {
    if (s == null) {
      return false;
    }
    if (s.isEmpty()) {
      return true;
    }
    char[] array = s.toLowerCase().toCharArray();
    int i = 0, j = s.length() - 1;
    char head, tail;
    while (i < j) {
      head = array[i];
      tail = array[j];
      while (i < j && !Character.isLetterOrDigit(head)) {
        i++;
        head = array[i];
      }
      if (i >= j) break;
      while (i < j && !Character.isLetterOrDigit(tail)) {
        j --;
        tail = array[j];
      }
      if (i >= j) break;
      if (head != tail) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

}
