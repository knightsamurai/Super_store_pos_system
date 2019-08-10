/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Probosha
 */
public class db {
     
     private static Connection c;
    
    public static void createConnection() throws Exception{
     Class. forName("com.mysql.jdbc.Driver");
     c= DriverManager.getConnection("jdbc:mysql://localhost:3307/supercity","root","123");
    
    
    }
    
    public static Connection con() throws Exception {
        if(c== null){
        createConnection();
        
        }
        return c;
    }
    
    public static void iud(String sql)throws Exception{
        if(c== null){
        createConnection();
        
        }   
        
        c.createStatement().executeUpdate(sql);
    }
    
    public static  ResultSet search(String sql) throws Exception{
        
        if(c== null){
        createConnection();
        
        }
        
        return c.createStatement().executeQuery(sql);
      
    
   
    }
}
