package entity;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 9:53
 */
public class Employee {
    private Integer age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        float f = 45.00f;
        double d = 0;
        Double dd = 0D;
        System.out.println(dd);
    }
}
