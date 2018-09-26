/**
 * 判断一个数是否为两个数的平方和，例如 5 = 12 + 22。
 */
public class SumOfSquareNumber_635 {

    public boolean judgeSquareSum(int target) {
        int i = 1,j = (int) Math.sqrt(target);
        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == target) {
                return true;
            }else if (sum < target) {
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
