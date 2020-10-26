package nowcoder.棋子翻转;

import com.sun.org.apache.regexp.internal.RE;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/08/08 12:37
 */
public class Flip {
    HashSet<List<Integer>> set = new HashSet<>();
    public int[][] flipChess(int[][] A,int[][] f){

        for (int[] item : f) {
            int x = item[0] - 1 ;
            int y = item[1] - 1 ;
            check(x-1,y);
            check(x+1,y);
            check(x,y-1);
            check(x,y+1);
        }

        Iterator<List<Integer>> iterator = set.iterator();

        while (iterator.hasNext()){
            List<Integer> list = iterator.next();
            int x = list.get(0);
            int y = list.get(1);
            A[x][y] = A[x][y] == 0? 1:0;
        }
        return A;
    }

    public void check(int x , int y){
        if(x<0 || x>3 || y<0 || y>3 ){
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        if(set.contains(list)){
            set.remove(list);
        }else {
            set.add(list);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list2.add(0);
        list2.add(1);
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list1.equals(list2));

    }
}
