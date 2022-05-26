package lesson4;

public class Sum {

    public int sum1(int a, int b) {
        return a + b;
    }

    public int sum2( int a, Integer b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 5;
        Sum s = new Sum();
        System.out.println(s.sum1(1, 2));
        System.out.println(s.sum1(a, 5));

        System.out.println(s.sum2(1, 2));
        System.out.println(s.sum2(a, 5));
    }
}
