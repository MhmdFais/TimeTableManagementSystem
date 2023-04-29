/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Muahmmed
 */

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;



public class Resource {
    
     public void add( String classes, String faculty, int whiteNo, int projNo ){
    
         try {
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            
            
            ResultSet rowUp = st.executeQuery( " UPDATE classroom SET whiteboards=' "+whiteNo+" ', projectors=' "+projNo+" ' WHERE classname=' "+classes+" ',faculty =' "+faculty+" ' " ); 
            JOptionPane.showMessageDialog(null, "Resource addition successfull!");
            System.out.println("resource add done" + rowUp);
        } catch ( SQLException ex ){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Resource addition not successfull!");
        }
    }
          
}
