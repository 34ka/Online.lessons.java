package lesson12.threads;

public class AnonimClassAndThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //actions
            }
        }).start();
    }
}
