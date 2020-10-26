package leecode.数组中的逆序对;
//https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/
public class Solution {
    int result;
    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        result = 0;
        count(nums,temp,0,nums.length-1);
        return result;
    }

    public void count(int[] nums,int[] temp,int left,int right){
        if(left >= right)
            return;
        int mid = (left+right)/2;
        count(nums,temp,left,mid);
        count(nums,temp,mid+1,right);

        for (int i = left; i <=right ; i++) {
            temp[i] = nums[i];
        }

        int index = left;
        int l = left;
        int r = mid+1;
        while (l<=mid&&r<=right){
            if(temp[l]>temp[r]){
                nums[index] = temp[l];
                l++;
                result += right-r;
            }
            else {
                nums[index] = temp[r];
                r++;
                result += mid-l+1;
            }
            index++;
        }

        while (l<= mid){
            nums[index] = temp[l];
            l++;
            index++;
        }

        while (r<=right){
            nums[index] = temp[r];
            r++;
            index++;
        }
    }
}
