package lesson12.threads;

public class MyThreadAndSleep1 implements Runnable {

    public void run() {
        //actions
        try{
            Thread.sleep(1000);//sleep 1 sec
        } catch(InterruptedException i) {
            //actions
        }
    }

    static Thread t = new Thread(new MyThreadAndSleep1());

    public static void main(String[] args) {
        t.start();
        System.out.println("Start thread");
    }
}
