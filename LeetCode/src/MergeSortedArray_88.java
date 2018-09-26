/**
 * @author zsq
 * @version 1.0
 * @date 2018/09/26
 */
public class MergeSortedArray_88 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int t = nums1.length - 1;
    int pa = m - 1;
    int pb = n - 1;
    while(t >= 0) {
      int a = safe(nums1, pa);
      int b = safe(nums2, pb);
      if(a > b) {
        nums1[t] = a;
        pa--;
      } else {
        nums1[t] = b;
        pb--;
      }
      t--;
    }
  }

  private int safe(int[] X, int i) {
    if (i < 0) {
      return Integer.MIN_VALUE;
    }
    return X[i];
  }

}
