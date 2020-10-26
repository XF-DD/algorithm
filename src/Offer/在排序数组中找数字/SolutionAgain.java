package Offer.在排序数组中找数字;

/**
 * @Author: XF-DD
 * @Date: 20/09/04 9:51
 */
public class SolutionAgain {
    private int record = 0;
    public int search(int[] nums, int target) {
        record = 0;
        search(nums,target,0,nums.length-1);
        return record;
    }

    private void search(int[] nums, int target,int left,int right){
        if (left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                record++;
                search(nums,target,left,mid-1);
                search(nums,target,mid+1,right);
            }else if(nums[mid] > target){
                search(nums,target,left,mid-1);
            }else {
                search(nums,target,mid+1,right);
            }
        }
    }




}
