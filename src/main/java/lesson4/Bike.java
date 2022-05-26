package lesson4;

public class Bike {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int newValue) {
        num = newValue;
    }
    public void ride() {
        num = 5;
    }

    //overloading
    public void drive() {
    }

    public void drive(int a) {
    }

    public void drive(int a, double b) {
    }

    public void drive(String a) {
    }
}

