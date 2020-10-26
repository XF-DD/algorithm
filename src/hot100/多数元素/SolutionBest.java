package hot100.多数元素;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 17:09
 */
public class SolutionBest {
    public int majorityElement(int[] nums) {
        Integer temp = null;
        int count = 0;
        for (int item : nums) {
            if(count == 0){
                temp = item;
            }
            count += (temp == item) ? 1 : -1;
        }
        return temp;
    }
}
