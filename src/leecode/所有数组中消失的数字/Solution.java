package leecode.所有数组中消失的数字;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 20:04
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 找到数组记录的索引，将其变为负数
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0){
                list.add(i+1);
            }
        }
        return list;
    }

}
