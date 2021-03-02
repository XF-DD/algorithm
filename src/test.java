import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        test01();
    }

    private static void test01(){
        BigDecimal b1 = new BigDecimal("7");
        BigDecimal b2 = new BigDecimal("7");
        b2 = b2.subtract(b1);
        int i = b2.compareTo(BigDecimal.ZERO);
        System.out.println(i);
    }
}
