package lesson6.anonimusClasses;

public class B implements Action {
    public boolean doAction() {
        return true;
    }

    public static void main(String[] args) {
        A a = new A();
        a.doSmth(new B());

        a.doSmth(new Action() {
            @Override
            public boolean doAction() {
                return false;
            }
        });

        Action act = new Action() {
            @Override
            public boolean doAction() {
                return false;
            }
        };
        a.doSmth(act);
    }
}
