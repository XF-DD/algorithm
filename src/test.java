import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        int[][] a = {{1,2},{1,2},{3,3},{1,6},{1,5}};
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
//        Arrays.sort(a, (o1, o2) -> o1[0]-o2[0]);
        System.out.println(a.length);
        System.out.println(Arrays.deepToString(a));
        System.out.println(a[0][1]+"---"+a[1][0]);
        System.out.println(a[3][0]);
    }
}
