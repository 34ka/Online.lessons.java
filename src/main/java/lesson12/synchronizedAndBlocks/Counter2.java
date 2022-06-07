package lesson12.synchronizedAndBlocks;

public class Counter2 {
    int c1;
    int c2;
    Object lock1 = new Object();
    Object lock2 = new Object();

    public void inc1() {
        synchronized (lock1) {
            c1++;
        }
    }

    public void inc2() {
        synchronized (lock2) {
            c2++;
        }
    }
    //Парательно будет в двух потоках происходить работа в двух счётчиках. Потоки не будут пересекаться
}
