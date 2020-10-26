package leecode.不用if相加64;

public class Solution {
    public int add(int n){
        int result = n;
        boolean flag = n>0&&(result+=add(n-1))>0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().add(6) );
    }
}
