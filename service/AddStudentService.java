/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;

public class AddStudentService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean AddStudent(String id, String name, String stream, String collagename, String branch, String passoutyear){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("insert into addstudent values ('"+id+"', '"+name+"', '"+stream+"', '"+collagename+"', +'"+branch+"', '"+passoutyear+"')");
            return true;
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        return false;
    }
}

