
package classes;

/**
 *
 * @author MUHAMMED 
 */


import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DataBaseConnection {
       
          private static Connection con;
          private static String url = "jdbc:mysql://localhost::3306/timetable";
          private static String username = "root";
          private static String password = "";
          
          static Connection getCon() throws SQLException{
                    
                    try {
                              Class.forName("com.mysql.jdbc.Driver");
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
