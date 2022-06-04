package lesson10.collections;

import java.util.*;

public class Example {

    List<String> a = new ArrayList<>();//Всегда использовать через интерфейс,
    // а не строкой ниже т.к. строка ниже ограничивает использование
    ArrayList<String> b = new ArrayList<>();
    Collection<String> c = new ArrayList<>();
    Map<Integer, String> m = new HashMap<>();

    public static void main(String[] args) {
        Example example = new Example();
        example.m.put(5," efwg");
    }
}
