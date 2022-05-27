package lesson5.constructors;

public class Hello2 {

    public Hello2() {
        this(5);
    }

    public Hello2(int num) {
        this.num = num;
    }
    private int num;

    public static void main(String[] args) {
        Hello2 hello2 = new Hello2();
        System.out.println(hello2.num);
    }
}
