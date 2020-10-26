package Tiger;

/**
 * @Author: XF-DD
 * @Date: 20/09/06 16:29
 */
public class Test03 {


    public static void main(String[] args) {
        Test03 test03 = new Test03();
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+"："+ test03.check01(i) + "   " + test03.check02(i));
            System.out.println();
        }
    }

    public int primePalindrome (int N) {
        // write code here
        for (int i = N; i < Integer.MAX_VALUE; i++) {
            if(check01(i)&&check02(i)){
                return i;
            }
        }
        return -1;
    }

    private boolean check01(int num){
        if(num == 1 || num == 2){
            return true;
        }
        // 如果不是 6x+1 或 6x+5，直接排除
        if(num%6 != 1 && num %6 != 5){
            return false;
        }

        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i+=6) {
            if(num%i == 0 || num % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    private boolean check02(int num){
        int right = 0;
        while (num>right){
            right = right*10 + num%10;
            num = num/10;
        }
        return num == right || num == (right/10);
    }
}
