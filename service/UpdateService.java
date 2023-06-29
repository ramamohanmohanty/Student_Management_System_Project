/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

public class UpdateService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean updatesstudent(String id, String name, String stream, String branch, String collagename, String passoutyear){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("Update addstudent set name = '"+name+"', id = '"+id+"' , stream = '"+stream+"' ,branch = '"+branch+"' ,collagename = '"+collagename+"', passoutyear = '"+passoutyear+"')");
            return true;
        }
        catch(SQLException ee){
            ee.printStackTrace();
        }
        return false;
    
    }
}
