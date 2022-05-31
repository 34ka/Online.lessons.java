package lesson6;

public class Verification {

    int id;
    private Verification() {
        id = 5;
    }

    public static Verification getInstance() {
        return new Verification();
    }
}
