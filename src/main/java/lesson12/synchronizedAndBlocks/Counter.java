package lesson12.synchronizedAndBlocks;

public class Counter {
    int c = 0;

    public synchronized void inc() {
        c++;
    }

    public synchronized void dec() {
        c--;
    }

    public synchronized int getC() {
        return c;
    }

    public static void main(String[] args) {
        // Если в программе сделать 2 потока. При synchronized если выполнять 1 поток c.inc().
        // 2-й c.dec() поток будет ждать(спать),
        // когда закончится первый и 2-й стартанёт с методом c.dec();
      Counter c = new Counter();
      c.inc();
      c.dec();
    }
}
