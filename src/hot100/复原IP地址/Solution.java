package hot100.复原IP地址;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/08/09 11:02
 */
public class Solution {
    List<String> list;
    public List<String> restoreIpAddresses(String s) {
        list = new ArrayList<>();
        restoreIpAddresses(s, "",0,0);
        return list;
    }

    /**
     *
     * @param s
     * @param now
     * @param num
     * @param index：下一个开始索引
     */
    public void restoreIpAddresses(String s,String now,int num,int index){

        if(index >= s.length()){
            return;
        }
        if(num == 3){
            if(s.length() - index > 3){
                return;
            }
            if(!check(s.substring(index,s.length()))){
                return;
            }
            now += s.substring(index,s.length());
            list.add(now);
            return;
        }
        for (int i = 1; i < 4; i++) {
            if(index + i > s.length()){break;}
            int record = now.length();
            if(!check(s.substring(index,index+i))){
                continue;
            }
            now += s.substring(index,index+i)+".";
            restoreIpAddresses(s,now,num+1,index+i);
            now = now.substring(0, record);
        }
    }

    public boolean check(String s){

        if(s.length()>1 && "0".equals(s.substring(0,1)) ){
            return false;
        }

        if(s.length()<3){
            return true;
        }
        if(s.compareTo("255")>0){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.restoreIpAddresses("010010");
        System.out.println(list);
/*        System.out.println("255".compareTo("256"));
        System.out.println("255".compareTo("255"));
        System.out.println("255".compareTo("254"));*/
        System.out.println("010".compareTo("0"));
    }
}
