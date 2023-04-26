/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;


import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;


/**
 *
 * @author Muhammed
 */
public class LoginValidate {
          
         
          public boolean loginValidation(String username, String password) {
                    
           boolean valid = false;
           boolean isFilled = false;
           
          // check if the username and password are empty
          if ( username.isEmpty() || password.isEmpty() ){
                    //JOptionPane.showMessageDialog(null, "Please enter your name and password");
                    isFilled = true;
          }
          
          //validate the user
          Connection conn = null;
          PreparedStatement stmt = null;
          ResultSet rs = null;

          if (!isFilled){
                              try {
                                        conn = DataBaseConnection.getCon();
                                        stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
                                        stmt.setString(1, username);
                                        stmt.setString(2, password);
                                        rs = stmt.executeQuery();

                                        if ( rs.next() ){
                                                  valid = true;
                                        }

                              }catch ( SQLException e ){
                                        System.out.println("Error executing query!!");           
                              } finally {
                              try {
                                if (rs != null) {
                                    rs.close();
                                }
                                if (stmt != null) {
                                    stmt.close();
                                }
                                if (conn != null) {
                                    conn.close();
                                }
                              } catch (SQLException e) {
                                System.out.println("Error closing resources: " + e.getMessage());
                            }
                        }

                        if (!valid) {
                          //JOptionPane.showMessageDialog(null, "Invalid username or password.");
                        }
          }
    return valid;
}

          
}
