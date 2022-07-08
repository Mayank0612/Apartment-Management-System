/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Admin <your.name at your.org>
 */
public class tables {
    public static void main(String[] args){
        Connection con = null;
        Statement st = null;
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table entryData(name varchar(200),email varchar(200),phone varchar(10),address varchar(200),username varchar(200),password varchar(200),ques varchar(200),ans varchar(200))");
            JOptionPane.showMessageDialog(null,"Table created");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){
                
            }
        }
    }
}
