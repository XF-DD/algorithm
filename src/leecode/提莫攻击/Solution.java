package leecode.提莫攻击;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0 || duration<1)
            return 0;
        int sum = 0;
        int temp = 0;
        for (int time : timeSeries) {
            if (time >= temp) {
                //此时没有中毒
                sum += duration;
            } else {
                //本身中着毒
                sum +=duration + (time- temp );
            }
            temp = time + duration;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        System.out.println(new Solution().findPoisonedDuration(data,5));
    }
}
