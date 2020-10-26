package hot100.颜色分类;

/**
 * @Author: XF-DD
 * @Date: 20/08/15 22:57
 */
public class Solution {
    public void sortColors(int[] nums) {
        int index0 = 0;
        int index2 = nums.length-1;
        for (int i = 0; i < index2; ) {
            if(nums[i] == 0){
                nums[i] = nums[index0];
                nums[index0++] = 0;
                i++;
                continue;
            }
            if(nums[i] == 2){
                nums[i] = nums[index2];
                nums[index2--] = 2;
                continue;
            }
            i++;
        }
    }
}
