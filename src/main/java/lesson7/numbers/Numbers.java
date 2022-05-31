package lesson7.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Numbers {

    public Integer a = 10;


    public static void main(String[] args) {
        Integer.valueOf(5);
        Integer.parseInt("4");//в строке ищет цифры
        Integer.compare(5, 1);


        BigInteger a;
        BigDecimal b;//деньги в этом классе используются и после точки очень много цифр вмещается

        //математика
        Math.acos(2.15);

        System.out.println(50);
        System.out.println(String.format("Int: %d, Double: %.3f", 10, 5.2));

        Character.isLetter('a');//проверяет символ на букву
        Character.isDigit('1');//проверяет символ на число
        Character.isWhitespace(' ');//проверяет на пробел или таб
        Character.isUpperCase('D');//проверяет на символ в верхнем регистре
        Character.isLowerCase('d');//проверяет на символ в нижнем регистре


        String c = "abcd";//Строка immutable - не изменяется внутреннее содержимое строки. Все методы этого класса будут
        //возвращать новый объект этого класса String
        c.substring(1, 2);
        c.indexOf('a');
        c.startsWith("ab");
        c.endsWith("22");
        c.compareTo("brth");// возвращает 0, если строки одинаковые либо меньше 0,
        // если одна строка меньше другой либо больше нуля если одна строка больше другой
        c.compareToIgnoreCase("ergwerg");//игнорирование регистра

        String d = "abc";
        d = d + "sd";//выведет abcsd


        StringBuilder stringBuilder = new StringBuilder();//StringBuilder изменяет содержимое строки. StringBuilder mutable
        stringBuilder.append(5).append("ss").append(10.2);
        System.out.println(stringBuilder.toString());

    }
}
