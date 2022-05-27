package lesson5.interfs;

public class ActionsAndRideInterface implements Actions, Ride {
    public void doSomeThink() {
        //actions
    }

    public int getNum(){
        return 0;
    }

    public void stop() {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        ActionsAndRideInterface act = new ActionsAndRideInterface();
        Actions a = act;
        Actions a1 = new ActionsAndRideInterface();
        a.doSomeThink();
        a1.doSomeThink();
    }
}
