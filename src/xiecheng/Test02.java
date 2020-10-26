package xiecheng;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/10/13 10:44
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // 存A的，比较两地差值，小根堆
        PriorityQueue<int[]> queueA = new PriorityQueue<>(Comparator.comparingInt(o -> (o[0] - o[1])));
        PriorityQueue<int[]> queueB = new PriorityQueue<>(Comparator.comparingInt(o -> (o[1] - o[0])));

        int res = 0;
        while (cin.hasNextInt()) {
            int incomeOfA = cin.nextInt();
            int incomeOfB = cin.nextInt();

            //Start coding -- Input Data
            int[] data = {incomeOfA, incomeOfB};
            if(incomeOfA>=incomeOfB){
                res+=incomeOfA;
                queueA.add(data);
            }else {
                res += incomeOfB;
                queueB.add(data);
            }

        }
        if(queueA.size()>queueB.size()){
            int n = (queueA.size() - queueB.size())/2;
            while (n>0){
                int[] poll = queueA.poll();
                int i = poll[0] - poll[1];
                res -= i;
                n --;
            }
        }else {
            int n = (queueB.size() - queueA.size())/2;
            while (n>0){
                int[] poll = queueB.poll();
                int i = poll[1] - poll[0];
                res -= i;
                n --;
            }
        }

        //Start coding
        System.out.println(res);
    }
}
