package lesson10.generics;

public class Hello {

    public <T extends String, K extends Number, M extends Number> T sum(K item1, M item2) {

        return null;
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        String a = h.sum(new Integer(5), new Float(5));
    }
}
