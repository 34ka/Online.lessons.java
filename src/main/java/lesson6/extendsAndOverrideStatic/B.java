package lesson6.extendsAndOverrideStatic;

public class B extends A {

    public static int getId() {
        return 2;
    }

    @Override
    public boolean isGood() {
        return false;
    }

    public static void main(String[] args) {
        B b = new B();
        b.isGood();
        B.getId();
        A.getId();

        A a = new B();
        a.isGood();
        A.getId();
    }
}
