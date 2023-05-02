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
public class User {
          
    public boolean login( String username, String password) throws SQLException{
        
        try {
            
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM admin");
            
            while(rs.next())
            {
                if(username.equals(rs.getString(2)) && password.equals(rs.getString(3)))
                {
                    return true;
                }
                else
                {
                    //JOptionPane.showMessageDialog(null, "Incorrect USERNAME or PASSWORD");
                    return false;
                }
            }
            
            
        } catch ( SQLException e ){
            System.out.println("e");
            return false;
        }
        return false;
        
    }
                         
}
