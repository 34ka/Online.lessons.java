package lesson2;

public class Types {

    public void fun1() {
        int a = 5;
        a += 3;
        a = a + 3;// тоже самое
    }

    public void compare() {
        int a = 5;
        boolean b = a < 5; // false
        boolean c = a <= 5; // true
        boolean d = a != 5; // false
        boolean f = a >= 5; // true
        if ( a < 6) {
        }

        //&& || ==
        b = (a < 5) && (a > 30);
        b = (a < 5) || (a > 30);
        if (a == 6) {
        }
    }

    public void blocks() {
        //Blocks
        if (2 > 1) {
            int a = 5;
        }
    }

    public void controlStructures() {
        if (2 > 1) {
            //actions
        } else {
            //actions
        }


        if (2 > 1) {
            //actions
        } else if (3 > 1){
            //actions
        } else if (5 > 1){
            //actions
        } else {
            //actions
        }


        int a = 1;
        switch (a) {
            case 0:
                a++;
                break;
            case 1:
                a--;
                break;
            default:
                a = a + 5;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] arr = {0, 1, 2, 5, 10};
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            System.out.println(arr[i]);
            if (elem == 4) {
                break;
            }
        }

        for (int elem: arr) {
            int i = 0;
            System.out.println(arr[i]);
        }



        int[] arr2 = {4, 5, 6};

        int i = 0;
        while (i < arr2.length) {
            System.out.println(arr2[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        int i = 0xF; //15
        float firstIndexOfArray = 1.22f;
        char x = 'c';
        byte c;
        double v;
        boolean b = true; //false
        long n;

        //Arrays
        int[] arr = new int[10];
        arr[0] = 1;

        int[] arr2 = {1, 2, 3, 4, 5};
        String[] arr3 = {"aaa", "bb"};

        int a;
        int m;
        int s;

        //a++;// а прибавляет 1 к а
        //++m;// тоже самое
        a = 2;
        m = 3;
        s = ++a - m++;
        //2(a) + 1(+1) = 3,
        //3(a) - 3(m) = 0
        //3(m) + 1(+1) = 4

    }
}
