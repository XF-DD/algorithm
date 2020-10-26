package hashMap;

import entity.User;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: XF-DD
 * @Date: 20/08/31 23:43
 */
public class TreeMapTest {
    public static void main(String[] args) {

    }

    private void test01(){
        TreeMap<User, Integer> treeMap = new TreeMap<>(Comparator.comparingInt(User::getAge));
        treeMap.put(new User(111,"111"),111);
        treeMap.put(new User(2,"222"),222);
        treeMap.put(new User(35,"333"),333);

        System.out.println(treeMap.size());
        User user = treeMap.firstKey();
        System.out.println(treeMap.size());
    }
}
