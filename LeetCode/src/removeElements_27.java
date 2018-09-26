/**
 * @author zsq
 * @version 1.0
 * @date 2018/09/26
 */
public class removeElements_27 {

  public int removeElement(int[] nums, int target) {
    int n = nums.length;
    int i = 0;
    while(i < n) {
      if (nums[i] == target) {
        nums[i] = nums[n - 1];
        n--;
      } else {
        i++;
      }
    }
    return n;
  }

  public int removeElementsII(int[] nums, int val) {
    int numDups = 0;
    for(int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        numDups++;

      } else {
        nums[i - numDups] = nums[i];
      }
    }
    return nums.length - numDups;
  }

  public int removeElementsIII(int[] nums, int val) {
    int i = 0, j = 0;
    for(; j < nums.length;j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }
}
