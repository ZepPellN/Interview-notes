/**
 * @author zsq
 * @version 1.0
 * @date 2018/09/26
 */
public class removeDuplicatesInSortedArray_26 {

  public int removeDuplicates(int[] nums) {
    int i = 0;
    for(int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]){
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }

  public int removeDuplicatesII(int[] nums) {
    int numDups = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        numDups++;
      } else {
        nums[i - numDups] = nums[i];
      }
    }
    return nums.length - numDups;
  }

}
