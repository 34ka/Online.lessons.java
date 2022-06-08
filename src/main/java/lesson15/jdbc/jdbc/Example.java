package lesson15.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example {
    public static void main(String[] args) {
        String user = "aa";
        String pass = "bb";
        String url = "jdbs:mySQL://localhost:3306/mydb";
        String driver = "org.mysql.Driver";
        try {
            Class.forName(driver);
        } catch(Exception e) {
            System.out.println("fail");;
        }
        try {
            Connection c = DriverManager.getConnection(url, user, pass);

            //Вместо Statement, может быть обычный Statement, Prepared Statement или CallableStatement
            Statement st = c.createStatement(/* сюда подставить sql запрос*/ /*пример "Select * from User"*/);

//            ResultSet rs = st.execute(c.nativeSQL(sql));
//            while (rs.next()) {
//                System.out.println(rs.getString("name"));
//            }
            //Перед Connection поставить try и
            // в конце сделать закрытие Connection
            //finally{
            //if (c ! = null) {
            // c.close();
            // }

        } catch(Exception e) {
            System.out.println("fail");
            e.printStackTrace();//Причина ошибки от базы данных
        }
    }
}
