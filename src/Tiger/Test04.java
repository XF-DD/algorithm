package Tiger;

/**
 * @Author: XF-DD
 * @Date: 20/09/06 16:57
 */
public class Test04 {

    public static void main(String[] args) {
        String s = "a:12:67AAbD";
        System.out.println(s.toLowerCase());
        System.out.println((int)'a');
        System.out.println((int)'A');
        char a = 'A';
        char c = (char) (a+32);
        System.out.println(c);
    }

    public boolean isPalindrome (String str) {
        // write code here
        String s = deal(str);
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private String deal(String s){
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if('0'<=c && c<= '9'){
                builder.append(c);
                continue;
            }
            if('a'<=c && c<= 'z'){
                builder.append(c);
                continue;
            }
            if('A'<=c && c<= 'Z'){
                char small = (char) (c+32);
                builder.append(small);
            }
        }
        return builder.toString();
    }
}
