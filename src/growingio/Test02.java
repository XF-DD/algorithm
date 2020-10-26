package growingio;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 15:44
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution ans = new Solution();
        while (scanner.hasNext()){
            String[] targetLine = scanner.nextLine().split(" ");
            int[] nums = new int[targetLine.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(targetLine[i]);
            }
            int target = Integer.parseInt(scanner.nextLine());
            int out = ans.search(nums, target);
            System.out.println(out);
        }
    }
}

class Solution{
    public int search(int[] nums, int target){
        // 这里补充代码
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}
