package lesson5.abstractClasses;

public class Hello extends Super {
    public void test() {
        //actions
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.test();
        hello.getId();
        Super r = new Hello();
        r.getId();
        r.test();
    }
}
