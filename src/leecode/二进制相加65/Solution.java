package leecode.二进制相加65;

public class Solution {
    public int add(int a,int b) {
        // 无进位和、进位值
        int sum, carry;
        while (b != 0) {
            // 异或操作得无进位和
            sum = a ^ b;
            // 与操作后移位得进位值
            carry = (a & b) << 1;
            // 循环，直到进位为0
            a = sum;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        int add = new Solution().add(-1, -1);
        System.out.println(add);
    }
}
