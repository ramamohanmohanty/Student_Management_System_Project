/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class LoginService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean validUser(String name, String password){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            ResultSet rs =st.executeQuery("Select * from user where name='"+name+"' and password='"+password+"'");
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        return false;
    }
}
