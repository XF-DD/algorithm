package test01;

import entity.Employee;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: XF-DD
 * @Date: 20/08/23 15:42
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());
        Employee zs1 = new Employee(12, "zs");
        Employee zs2 = new Employee(12, "zs");
        Employee zs3 = new Employee(13, "zs3");
        Employee zs4 = new Employee(15, "zs4");
        Employee zs5 = new Employee(17, "zs5");
        set.addAll(Arrays.asList(zs1,zs2,zs3,zs4,zs5));


        Employee test = new Employee(14, "w无");
        System.out.println(set.size());
        Employee ceiling = set.ceiling(test);
        Employee floor = set.floor(test);
        System.out.println(ceiling);
        System.out.println(floor);

        Iterator<Employee> iterator = set.iterator();
        for (int i = 0; i < 3; i++) {
            Employee next = iterator.next();
            System.out.println(next);
        }
        System.out.println(set.size());

    }
}
