package test01;

/**
 * @Author: XF-DD
 * @Date: 20/06/16 18:34
 */
public class test {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Son();
        father.doIt();
    }
}

class Father {
    public Father() {
        System.out.println("I am Father");
    }

    public void doIt(){
        System.out.println("Father do");
    }
}

class Son extends Father {
    public Son() {
        System.out.println("I am Son");
    }

    @Override
    public void doIt(){
        System.out.println("Son do");
    }
}
