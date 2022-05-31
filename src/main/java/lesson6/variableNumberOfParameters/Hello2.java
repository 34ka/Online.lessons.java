package lesson6.variableNumberOfParameters;

public class Hello2 {

    //public void doSmth2(int... n, double rock){} //В начале нельзя указывать параметризированный параметр, только в конце

    public void doSmth(int a, String b, double ... num){

    }

    public static void main(String[] args) {
        Hello2 hello2 = new Hello2();
        hello2.doSmth(1, "22gergerg", 1.5, 1.8, 2.0);
        hello2.doSmth(1, "gtegw");
    }
}
