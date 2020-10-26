package leecode.单词替换;

import java.util.*;

//https://leetcode-cn.com/problems/replace-words/
public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] split = sentence.split(" ");
        HashMap<Integer, HashSet<String>> map = new HashMap<>();
        int maxLen = 0;
        for (String s :dict) {
            int len = s.length();
            if(map.containsKey(len)){
                map.get(len).add(s);
            }
            else {
                HashSet<String> set = new HashSet<>();
                set.add(s);
                map.put(len,set);
                maxLen = Math.max(len,maxLen);
            }
        }

        for (int index = 0;index<split.length;index++) {
            for (int i = 0; i <= maxLen; i++) {
                if(!map.containsKey(i) || split[index].length()<=i) continue;
                String root = split[index].substring(0, i);
                if(map.get(i).contains(root)){
                    split[index] = root;
                    break;
                }
            }
        }
        String result = "";
        for (int i = 0; i < split.length - 1; i++) {
            result += split[i] + " ";
        }
        result += split[split.length-1];
        return result;
    }

    public String replaceWordsByBest(List<String> dict, String sentence) {
        HashSet<String> rootset = new HashSet();
        for (String root: dict) rootset.add(root);

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split("\\s+")) {
            String prefix = "";
            for (int i = 1; i <= word.length(); ++i) {
                prefix = word.substring(0, i);
                if (rootset.contains(prefix)) break;
            }
            if (ans.length() > 0) ans.append(" ");
            ans.append(prefix);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"e","k","c","harqp","h","gsafc","vn","lqp","soy","mr","x","iitgm","sb","oo","spj","gwmly","iu","z","f","ha","vds","v","vpx","fir","t","xo","apifm","tlznm","kkv","nxyud","j","qp","omn","zoxp","mutu","i","nxth","dwuer","sadl","pv","w","mding","mubem","xsmwc","vl","farov","twfmq","ljhmr","q","bbzs","kd","kwc","a","buq","sm","yi","nypa","xwz","si","amqx","iy","eb","qvgt","twy","rf","dc","utt","mxjfu","hm","trz","lzh","lref","qbx","fmemr","gil","go","qggh","uud","trnhf","gels","dfdq","qzkx","qxw"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(strs));
        String sentence = "ikkbp dco miszkays wqjferqoxjwvbieyk gvcfldkiavww vhokchxz dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi kddxmckhvqifbuzkhstp wc ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy ifvifheoxqlbosfww mengfdydekwttkhbzenk wjhmmyltmeufqvcpcxg hthcuovils ldipovluo aiprogn nusquzpmnogtjkklfhta klxvvlvyh nxzgnrveghc mpppfhzjkbucv cqcft uwmahhqradjtf iaaasabqqzmbcig zcpvpyypsmodtoiif qjuiqtfhzcpnmtk yzfragcextvx ivnvgkaqs iplazv jurtsyh gzixfeugj rnukjgtjpim hscyhgoru aledyrmzwhsz xbahcwfwm hzd ygelddphxnbh rvjxtlqfnlmwdoezh zawfkko iwhkcddxgpqtdrjrcv bbfj mhs nenrqfkbf spfpazr wrkjiwyf cw dtd cqibzmuuhukwylrnld dtaxhddidfwqs bgnnoxgyynol hg dijhrrpnwjlju muzzrrsypzgwvblf zbugltrnyzbg hktdviastoireyiqf qvufxgcixvhrjqtna ipfzhuvgo daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh qzsaobsghgm ichlpsjlsrwzhbyfhm ksenb bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala qmxixtooxtbrzyorn gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn frotscysdyclrc ckcttaceuuxzcghw pxbd oklwhcppuziixpvihihp";

        String doc = new Solution().replaceWords(list, sentence);
        System.out.println(doc);


    }
}
