package lesson6.anonimusClasses;

public interface Action {

    public boolean doAction();

    public class A {
        public void doSmth(Action a) {
            a.doAction();
        }
    }
}
