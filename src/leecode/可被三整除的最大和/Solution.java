package leecode.可被三整除的最大和;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode-cn.com/problems/greatest-sum-divisible-by-three/
public class Solution {
    public int maxSumDivThreeBest(int[] nums){
        int[] record = new int[3];
        for (int i = 0; i < nums.length; i++) {
            int mod = nums[i]%3;

            //mod_0代表记录中与nums[i]相加后的和可以被3整除，即mod(sum)=0
            int mod_0 = record[(3+0-mod)%3];
            int mod_1 = record[(3+1-mod)%3];
            int mod_2 = record[(3+2-mod)%3];

            //记录当前值更新后3个记录的最大值
            if(mod_0 != 0 || mod == 0) record[0] = Math.max(record[0],mod_0+nums[i]);
            if(mod_1 != 0 || mod == 1) record[1] = Math.max(record[1],mod_1+nums[i]);
            if(mod_2 != 0 || mod == 2) record[2] = Math.max(record[2],mod_2+nums[i]);
        }
        return record[0];
    }
    
    
    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> mod_1 = new ArrayList<>();
        ArrayList<Integer> mod_2 = new ArrayList<>();
        int sum = 0;
        for (int i :nums) {
            sum+=i;
            if(i%3 == 1)
                mod_1.add(i);
            else if(i%3 == 2)
                mod_2.add(i);
        }
        int mod = sum %3;
        if(mod == 0)
            return sum;
        int sum1 = -1;
        int sum2 = -1;
        if(mod == 1){
            if(mod_1.size()<1&&mod_2.size()<2)
                return -1;
            if(mod_1.size()>=1)
                sum1 = sum-mod_1.get(0);
            if(mod_2.size()>=2)
                sum2 = sum - mod_2.get(0)-mod_2.get(1);
            return Math.max(sum1,sum2);
        }
        else {
            if(mod_2.size()<1&&mod_1.size()<2)
                return -1;
            if(mod_2.size()>=1)
                sum2 = sum-mod_2.get(0);
            if(mod_1.size()>=2)
                sum1 = sum - mod_1.get(0)-mod_1.get(1);
            return Math.max(sum1,sum2);
        }
    }
}
