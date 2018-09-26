/**
 * @author zsq
 * @version 1.0
 * @date 2018/09/26
 */
public class SearchInsertPosition_35 {


  public int searchInsertPosition(int[] nums, int target) {
    return binarySearch(nums, 0, nums.length -1, target);
  }

  public int binarySearch(int[] nums, int start, int end, int target) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        return target;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  public int searchInsert(int[] nums, int target) {
    int position = 0;
    for (int i = 0; i < nums.length; i++) {
      if (target > nums[i]) {
        ++position;
      }
    }
    return position;
  }

}
