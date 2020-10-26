package entity;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 9:48
 */
public class User {
    private Address address;
    private int age;
    private String name;

    public User(Address address, int age, String name) {
        this.address = address;
        this.age = age;
        this.name = name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address bj = new Address(1, "bj");
        User zs = new User(bj, 20, "zs");
        User clone = (User)zs.clone();
        System.out.println(clone.getAddress());
        System.out.println(zs.getAddress());
        System.out.println(clone.getAddress() == zs.getAddress());
    }
}
