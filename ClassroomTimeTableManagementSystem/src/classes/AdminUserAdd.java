
package classes;

/**
 *
 * @author Muhammed
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class AdminUserAdd {
          
          
          
          public boolean addUser( String username, String password, String type, String passwordConfirm ){
                   
                    
                  if ( isFilled (  username, password, passwordConfirm )   ){
                            if (  isPasswordCorrect ( password, passwordConfirm )  ) {
                                      try {
                                                Connection con = DataBaseConnection.getCon();
                                                Statement st = con.createStatement();
                                                
                                                ResultSet rs = st.executeQuery("SELECT * FROM users WHERE username = '" + username + "'");
                                                if (rs.next()) {
                                                          JOptionPane.showMessageDialog(null, "Username already exists");
                                                          return false;
                                                }
                                                
                                                
                                                st.executeUpdate( " INSERT INTO users ( username, password, role ) VALUES ( "+username+", "+password+","+type+")"  );
                                                JOptionPane.showMessageDialog(null, "User added successfully!");
                                                return true;
                                      } catch ( SQLException e ) {
                                                JOptionPane.showMessageDialog(null, "User adding failed!!"); 
                                                return false;
                                      } finally {
                                                DataBaseConnection.closeCon();
                                      }
                            } else {
                                      JOptionPane.showMessageDialog(null, "User adding failed!!"); 
                                      return false;
                            }
                  } else {
                            JOptionPane.showMessageDialog(null, "User adding failed!!"); 
                            return false;
                  }
                  
                  
          }
          
          public boolean isFilled( String username, String password, String passwordConfirm ) {
                    
                    if ( username == null || password == null || passwordConfirm == null  ){
                              return false;
                    }
                    return true;
          }
          
          public boolean isPasswordCorrect (  String password, String passwordConfirm ) {
                    
                    if ( password != passwordConfirm ){
                              return false;
                    }
                    return true;
          }
}
