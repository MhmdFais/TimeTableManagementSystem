
package classes;

/**
 *
 * @author Muhammed
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminUserAdd {
          
          
          
          public boolean addUser( String username, String password, String type, String passwordConfirm ){
                   
                  boolean retValue = false; 
                  
                  if ( !isFilled (  username, password, passwordConfirm )   ){
                            if (  isPasswordCorrect ( password, passwordConfirm )  ) {
                                      try {
                                                Connection con = DataBaseConnection.getCon();
                                                Statement st = con.createStatement();
                                                st.executeUpdate( " INSERT INTO users ( username, password, role ) VALUES ( "+username+", "+password+","+type+")"  );
                                                return (retValue == true) ;
                                      } catch ( SQLException e ) {
                                                return retValue;
                                      } finally {
                                                DataBaseConnection.closeCon();
                                      }
                            } else {
                                      return retValue; // password checking
                            }
                  } else {
                            return retValue ; // isFilled checking 
                  }
                  
          }
          
          public boolean isFilled( String username, String password, String passwordConfirm ) {
                    
                    if ( username == null || password == null || passwordConfirm == null  ){
                              return true;
                    }
                    return false;
          }
          
          public boolean isPasswordCorrect (  String password, String passwordConfirm ) {
                    
                    if ( password != passwordConfirm ){
                              return false;
                    }
                    return true;
          }
}
