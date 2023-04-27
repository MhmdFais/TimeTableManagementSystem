
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminUserAdd {
          
          
          
          // adding the user
          public boolean addUser( String username, String password, String type, String passwordConfirm ){
                   
                    
                  if ( isFilled (  username, password, passwordConfirm )   ){
                            if (  isPasswordCorrect ( password, passwordConfirm )  ) {
                                      try {
                                                Connection con = DataBaseConnection.getCon();
                                                Statement st = con.createStatement();
                                                
                                                ResultSet rs = st.executeQuery("SELECT * FROM users WHERE username = ' " + username + " ' ");
                                                if (rs.next()) {
                                                          JOptionPane.showMessageDialog(null, "Username already exists");
                                                          return false;
                                                }
                                                
                                                
                                                st.executeUpdate( " INSERT INTO users ( username, password, role ) VALUES ( ' "+username+" ' ,' "+password+" ' ,' "+type+" ' ) "  );
                                                JOptionPane.showMessageDialog(null, "User added successfully!");
                                                return true;
                                      } catch ( SQLException e ) {
                                                JOptionPane.showMessageDialog(null, "User adding failed!! + sql exception" ); 
                                                System.out.println(e);
                                                return false;
                                      } finally {
                                                DataBaseConnection.closeCon();
                                      }
                            } else {
                                      JOptionPane.showMessageDialog(null, "Check whether the passwords are correct"); 
                                      return false;
                            }
                  } else {
                            JOptionPane.showMessageDialog(null, "User adding failed!! + not filled"); 
                            return false;
                  }
                  
                  
          }
          
          
          // deleting the user 
          public void deleteUser( String username ) throws SQLException{
                    
                    Connection con = DataBaseConnection.getCon();
                    Statement st = con.createStatement();
                    
                    try {
                              // checking whether the entered username already there
                              String query = "SELECT * FROM users WHERE username = ' " + username + "' ";
                              ResultSet rs = st.executeQuery(query);
                              
                              if ( !rs.next() ){
                                        JOptionPane.showMessageDialog(null, "User not found!!");
                                        return;
                              }
                              
                              // deleting the user
                              try {
                                        String deleteUser = " DELETE FROM users WHERE username = ' "+username+" '  ";
                                        st.executeUpdate(deleteUser);
                              } catch ( SQLException e ){
                                        JOptionPane.showMessageDialog(null, "Error while deleting !!");
                              }
                              
                    } catch (SQLException ex) {
                              Logger.getLogger(AdminUserAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
          }
          
          public boolean isFilled( String username, String password, String passwordConfirm ) {
                    
                    if ( username == null || password == null || passwordConfirm == null  ){
                              return false;
                    }
                    return true;
          }
          
          public boolean isPasswordCorrect (  String password, String passwordConfirm ) {
                    
                    if ( !password.equals(passwordConfirm) ){
                              return false;
                    }
                    return true;
          }
}
