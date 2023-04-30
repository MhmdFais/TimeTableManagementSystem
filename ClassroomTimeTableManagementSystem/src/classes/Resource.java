/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Muahmmed
 */

import Admin.Resources;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.*;



public class Resource {
    
     public void add( String classes, String faculty, int whiteNo, int projNo ) throws SQLException{
         
        Connection con = DataBaseConnection.getCon();
        Statement st = con.createStatement();
              
        try {
            
            
            ResultSet rowUp = st.executeQuery( " UPDATE classroom SET whiteboards=' "+whiteNo+" ', projectors=' "+projNo+" ' WHERE classname=' "+classes+" ',faculty =' "+faculty+" ' " ); 
            JOptionPane.showMessageDialog(null, "Resource addition successfull!");
            System.out.println("resource add done" + rowUp);
        } catch ( SQLException ex ){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Resource addition not successfull!");
        }
         
        /**int totalResource = whiteNo + projNo;
        
        try {
            
            ResultSet rowUp = st.executeQuery( " UPDATE resorces SET classroom=' "+classes+" ', resname=' "+projNo+" ' " ); 
            JOptionPane.showMessageDialog(null, "Resource addition successfull!");
            System.out.println("resource add done" + rowUp);
        } catch ( SQLException ex ){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Resource addition not successfull!");
        }**/
        
    }
     
    /**public void showResource(){
        
        try {
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT  FROM schedule");
            
            Resources objd = new Resources();
            DefaultTableModel model = (DefaultTableModel) objd.jTable1.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] row = new Object[3];
                row[0] = rs.getInt("subid");
                row[1] = rs.getString("subject");
                row[2] = rs.getString("faculty");
                model.addRow(row);
            }
            
            System.out.println("subject showing success");
        } catch (SQLException e){
            System.out.println("Subjects showing failed "+e);
        }

    }**/
          
}
