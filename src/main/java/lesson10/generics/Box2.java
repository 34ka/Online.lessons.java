package lesson10.generics;

public class Box2<T extends Number> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T o) {
        item = o;
    }

//     Number sum(Box2<? extends Number -> Box2 b1, Box2 b2) {
//        return b1.getItem() + b2.getitem();
//    }

    public static void main(String[] args) {
        Box2<Integer> b1 = new Box2<Integer>();
        Box2<Float> b2 = new Box2<Float>();
        Box2<Number> b3 = new Box2<Number>();
        //Box2<String> b4 = new Box2<String>();//ошибка компиляции String от Number не наследуется

//        sum(b1);
    }

}
