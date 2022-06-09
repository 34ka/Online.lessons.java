package lesson17.librarySpring.example;

public class Impl implements Hello {
    private String s;

    public Impl(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public void sayHi() {
        System.out.println(s);
    }



    public static void main(String[] args) {
        Hello h = new Impl("a");
        h.sayHi();
    }
}
