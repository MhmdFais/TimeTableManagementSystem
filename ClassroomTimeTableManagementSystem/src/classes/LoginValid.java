package classes;


import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Muahmmed
 */
public class LoginValid {
          
         public boolean loginValidation(String username, String password){
                   
                   // check if the blocks are empty
                   if ( username.isEmpty() || password.isEmpty() ){
                             JOptionPane.showMessageDialog(null, "Please enter ypur username and password");
                             return false;
                   }
                   
                   // validate the user inputs
                   Connection conn = null;
                   PreparedStatement stmt = null;
                   ResultSet rs = null;
                   boolean valid = false;
                   
                   try {
                             conn = DataBaseConnection.getCon();
                             stmt = conn.prepareStatement("SELECT * FROM signin WHERE username = ? AND password = ?");
                             stmt.setString(1, username);
                             stmt.setString(2, password);
                             rs = stmt.executeQuery();

                             if ( rs.next() ){
                                       valid = true ;
                             }
                   } catch ( SQLException e ) {
                             System.out.println("Error executing query: " + e.getMessage());
                   } finally {
                             try {
                                       if (  rs != null ){
                                                 rs.close();
                                       }
                                       if ( stmt != null ){
                                                 stmt.close();
                                       }
                                       if ( conn != null ){
                                                 conn.close();
                                       }
                             } catch ( SQLException e ) {
                                       System.out.println("Error closing resources: " + e.getMessage());
                             }
                   }
                   
                   if (  !valid ){
                              JOptionPane.showMessageDialog(null, "Invalid username or password.");
                   }
                   
                   return valid;
         }
}
