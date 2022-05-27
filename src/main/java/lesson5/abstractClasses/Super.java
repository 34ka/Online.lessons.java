package lesson5.abstractClasses;

public abstract class Super {
    protected int id;
    public int getId() {
        return id;
    }

    public abstract void test();

    public static void main(String[] args) {
        //Super s = new Super(); нельзя создать объект
    }
}
