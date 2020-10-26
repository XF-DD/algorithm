package leecode.盛水最多的容器;

public class Solution {
    public int maxArea(int[] height) {
        if(height.length <2)
            return 0;
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left<right){
            int temp = (right-left) * Math.min(height[left],height[right]);
            max = Math.max(max,temp);
            if(height[left]>height[right])
                right--;
            else
                left++;
        }
        return max;
    }
    public static void main(String[] args) {
        int i = new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
    }
}
