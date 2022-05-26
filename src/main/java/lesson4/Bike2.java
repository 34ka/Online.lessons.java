package lesson4;

public class Bike2 {

    private int num;

    public Bike2(int n) {
        num = n;
    }
    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike2 bike2 = (Bike2) o;
        return num == bike2.num;
    }


    public static void main(String[] args) {
        Bike2 bike1 = new Bike2(3);
        Bike2 bike3 = bike1;
        Bike2 bike2 = new Bike2(5);
        System.out.println(bike1 == bike2);
        System.out.println(bike1 == bike3);
        System.out.println(bike1.equals(bike2));
        System.out.println(bike1.equals(bike3));

        String a1 = "aa";
        String a2 = new String("aa");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

    }
}
