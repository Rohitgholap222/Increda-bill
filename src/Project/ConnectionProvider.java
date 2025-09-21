
package Project;

import java.sql.*;


public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","rohit172");
//            System.out.println("Connection Successful");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }

    }
}
