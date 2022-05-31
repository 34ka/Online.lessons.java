package lesson6;

public class StaticConstantsVariable {

    public double num;
    public static final int ID = 5;

    public static void main(String[] args) {
        StaticConstantsVariable staticConstants = new StaticConstantsVariable();
        double num = staticConstants.num;
        int value = StaticConstantsVariable.ID;
    }
}
