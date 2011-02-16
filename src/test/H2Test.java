package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class H2Test {

    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:/home/mhh91/Desktop/test.db", "sa", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("create table test(name varchar(20),age int)");
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(H2Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(H2Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
