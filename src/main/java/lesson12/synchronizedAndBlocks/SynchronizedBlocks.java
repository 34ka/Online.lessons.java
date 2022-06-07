package lesson12.synchronizedAndBlocks;

public class SynchronizedBlocks {

    int c = 0;
    public static void main(String[] args) {

    }
    public synchronized void inc() {
        synchronized (this) {
            c++;
        }
        System.out.println(c);
    }
}
