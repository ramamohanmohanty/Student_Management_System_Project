/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ramamohan Mohanty
 */
public class SignUpService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean insertUser(String name, String email, String mobile, String password, String resetpassword){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("insert into user values ('"+name+"' , '"+email+"' , '"+mobile+"' ,'"+password+"' ,'"+resetpassword+"')");
            return true;
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        return false;
    
    }
}
