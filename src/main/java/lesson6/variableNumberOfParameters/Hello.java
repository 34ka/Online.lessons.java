package lesson6.variableNumberOfParameters;

public class Hello {

    public int sum(int ... num) {
        int []num2 = num;
        int summa = 0;
        for (int i : num) {
            summa += i;
        }
        return summa;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sum(5, 20, -200);
    }
}
