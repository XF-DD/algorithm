package wuba.test03;

/**
 * @Author: XF-DD
 * @Date: 20/08/31 20:50
 */
public class Solution {
    public int translateNum (int num) {
        // write code here
        int size = 1;
        int recod = num;
        while (recod/10 != 0){
            recod/=10;
            size++;
        }
        return translateNum(num,size);
    }

    // length : 几位数  : 10->2
    private int translateNum (int now,int length){
        if(length <= 1){
            return 1;
        }
        int first = now/(int)(Math.pow(10,length-1));
        if(first == 1){
            int newNow01 = now % (int)(Math.pow(10,length-1));
            int newNow02 = now % (int) (Math.pow(10, length - 2));
            return translateNum(newNow01,length-1) + translateNum(newNow02,length-2);
        }

        if(first == 2){
            int newNow01 = now % (int)(Math.pow(10,length-1));
            int test = newNow01 / (int) (Math.pow(10, length - 2));
            if(test<=5){
                int newNow02 = now % (int) (Math.pow(10, length - 2));
                return translateNum(newNow01,length-1) + translateNum(newNow02,length-2);
            }else {
                return translateNum(newNow01,length-1);
            }
        }

        int newNow01 = now % (int)(Math.pow(10,length-1));
        return translateNum(newNow01,length-1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.translateNum(12158);
        System.out.println(i);
    }
}
