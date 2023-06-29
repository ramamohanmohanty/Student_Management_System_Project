/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
public class ForgotService {
        public static Connection cn = null;
    public static Statement st = null;
    public static boolean forgotstudent(String name, String new_password, String conform_password){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("UPDATE user SET password = '"+new_password+"', resetpassword = '"+conform_password+"'");
            return true;
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        return false;
    }
}
