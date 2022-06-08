package lesson15.jdbc.loadDriver;

public class LoadDriver {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.mysql.Driver");
    }
}
