/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;
public class ConnectionDB {
    public static Connection cn = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/jtmanagement" ,"root" ,"root");
        }
        catch(Exception ee){
            ee.printStackTrace();
        }
        finally {
            return cn;
        }
    }
}
