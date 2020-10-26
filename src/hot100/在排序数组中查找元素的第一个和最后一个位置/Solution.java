package hot100.在排序数组中查找元素的第一个和最后一个位置;

/**
 * @Author: XF-DD
 * @Date: 20/06/21 11:26
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int len = nums.length;
        if (len < 1 || target < nums[0] || target > nums[len - 1]) {
            return result;
        }

        int left = 0;
        int right = len - 1;
        int mid = 0;

        while (left < right){
            mid = (left + right)/2;
            if(nums[mid] == target){
                break;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
        }

        if(nums[mid] != target){
            return result;
        }

        left = mid-1;
        right = mid+1;

        while (left>=0 && nums[left] == target){
            left--;
        }
        while (right<len && nums[right] == target){
            right++;
        }

        return new int[]{left+1,right-1};
    }
}
