package webank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/27 19:46
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        in.nextLine();

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i+1; j < data.length; j++) {
                if(data[i]<=data[j]){
                    list.add(j);
                }
            }
            map.put(i,list);
        }

        int size = 0;
        for (int i = 0; i < data.length; i++) {
            ArrayList<Integer> list = map.get(i);
            size += list.stream().map(map::get).mapToInt(ArrayList::size).sum();
        }
        System.out.println(size);
    }
}
