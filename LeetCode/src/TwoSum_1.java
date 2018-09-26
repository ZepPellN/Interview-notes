import java.util.HashMap;

/**
 * @author zsq
 * @version 1.0
 * @date 2018/09/26
 */
public class TwoSum_1 {

  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

    for (int i = 0; i < nums.length; i++) {
      map.put(target - nums[i], i);
    }

    for (int j = 0; j < nums.length; j++) {
      Integer v = map.get(nums[j]);
      if (v != null && v != j) {
        return new int[]{j, v};
      }
    }
    throw new IllegalArgumentException("No such solutions!");
  }

  public int[] twoSumII(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

    for (int i = 0; i < nums.length; i++) {
      int left = target - nums[i];
      if (map.containsKey(left) && left != nums[i]) {
        return new int[] {map.get(left), i};
      }

      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No such solutions!");
  }

}
