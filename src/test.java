import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {

    }

    private static void test01(){
        BigDecimal b1 = new BigDecimal("10");
        BigDecimal b2 = new BigDecimal("7");
        b1 = b1.subtract(b2);
        System.out.println(b1);
    }
}
