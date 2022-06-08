package lesson15.jdbc.jdbc;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcClasses {
    public static void main(String[] args) throws SQLException {
        DriverManager.getConnection("yandex.ru");

    }
}
