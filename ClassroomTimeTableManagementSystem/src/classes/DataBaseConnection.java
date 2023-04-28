/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Muhammed
 */
public class DataBaseConnection {
          
           private static Connection con;
          private static final String url = "jdbc:mysql://localhost::3306/timetable";
          private static final String username = "root";
          private static final String password = "";
          
          static Connection getCon() throws SQLException{
                    
                    try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                    } catch (ClassNotFoundException ex){
                               throw new SQLException("JDBC driver not found", ex);
                    }
                    try {
                              con = DriverManager.getConnection(url,username,password);
                    } catch (SQLException ex){
                              System.out.println("Data Base connection error !!");
                    }
                    return con;
          }
          
          public static void closeCon(){
                    if ( con != null ){
                              try {
                                        con.close();
                              } catch ( SQLException ex ){
                                        System.out.println("SQL Error");
                              }
                    }
          }
          
}
