package lesson10.generics;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T o) {
        item = o;
    }

    public static void main(String[] args) {
        Box<Integer> b = new Box<Integer>();
        Box<String> s = new Box<String>();
        b.setItem(5);
        //b.setItem("aaa"); //ошибка компиляции
        s.setItem("aaaa");
    }
}
