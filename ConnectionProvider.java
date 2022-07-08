package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin <your.name at your.org>
 */
import java.sql.*;


public class ConnectionProvider {
    // create a function to connect with mysql database
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projectdb", "root", "Utkarsh@20");
            return con;
        } 
        catch (Exception ex) {
            return null;
        }
        
    }
}
