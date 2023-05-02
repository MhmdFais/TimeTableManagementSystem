/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

//import java.util.logging.Level;
//import java.util.logging.Logger;


/**
 *
 * @author Muhammed
 */
public class DataBaseConnection {
        static com.mysql.jdbc.Connection getCon(){
            
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
              
}
