/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hope;
import java.sql.*;

/**
 *
 * @author Rida Fatima
 */
public class HopeDb {
      public static Connection getConnection() throws Exception{
    try{
        String driver = "com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/connectiondb";
        String username="root";
        String password="debacle";
        Class.forName(driver);
        
        Connection conn=DriverManager.getConnection(url,username,password);
        System.out.println("connected");
        return conn;
    }catch(Exception e){
        System.out.println(e);
        
    }



    


    

