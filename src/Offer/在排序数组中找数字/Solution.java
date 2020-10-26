package Offer.在排序数组中找数字;

/**
 * @Author: XF-DD
 * @Date: 20/09/04 9:35
 */
public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length<1){
            return 0;
        }
        int res = search(nums, target, 0, nums.length - 1);
        if(res == -1){
            return 0;
        }
        int index = res;
        int vo = 1;
        while(--index>=0&&nums[index] == target){
            vo++;
        }
        index = res;
        while (++index<nums.length && nums[index] == target){
            vo++;
        }
        return vo;
    }

    public int search(int[] nums, int target,int left,int right){
        if(left == right){
            if(nums[left] == target){
                return left;
            }
            return -1;
        }
        int mid = (left+right)/2;
        if(nums[mid] == target){
            return mid;
        }
        int leftRes = search(nums, target, left, mid);
        int rightRes = search(nums, target, mid + 1, right);
        if(leftRes !=-1){
            return leftRes;
        }
        if(rightRes != -1){
            return rightRes;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {0, 0, 1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 10};
        Solution solution = new Solution();
        int search = solution.search(data, 4);
        System.out.println(search);

    }
}
