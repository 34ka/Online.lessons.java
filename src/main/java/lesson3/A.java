package lesson3;

public class A {
    private int id;
    protected int num;
    int age;
    public int code;
    static public String name;

    public static void main(String[] args) {
        name = "Vasiliy";
        System.out.println(name.length());

        A a = new A();
        System.out.println(a.code);
    }
}
