package entity;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 9:48
 */
public class Address {
    private int id;
    private String home;

    public Address(int id, String home) {
        this.id = id;
        this.home = home;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
