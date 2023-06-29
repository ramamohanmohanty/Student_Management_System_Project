/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
public class DeleteService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean DeleteName(String name){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("delete from addstudent where name = '"+name+"'");
            return true;
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        return false;
    }
}

