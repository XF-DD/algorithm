package 跳跃游戏;

//https://leetcode-cn.com/problems/jump-game/
public class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<1)
            return false;
        int far = 0;
        for (int i = 0; i < nums.length; i++) {
            if(far<i)
                return false;
            far = Math.max(far,i+nums[i]);
        }
        return true;
    }
}
