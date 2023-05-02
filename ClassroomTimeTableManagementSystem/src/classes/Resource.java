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
    
     public void add( String classes, String faculty, String type, int projNo ) throws SQLException{
         
        Connection con = DataBaseConnection.getCon();
        Statement st = con.createStatement();
              
        try {
            st.executeUpdate(" INSERT INTO resources (faculty, classroom, type, quantity) VALUES ('"+faculty+"','"+classes+"','"+type+"','"+projNo+"')");
            JOptionPane.showMessageDialog(null, "Resource addition successfull!");
            //System.out.println("resource add done" + rowUp);
        } catch ( SQLException ex ){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Resource addition not successfull!");
        } 
    }
     
    public void showResource( String classSelected){
        
         switch (classSelected) {
             case "cls1" -> {
                 try { 
                     Connection con = DataBaseConnection.getCon();
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery("SELECT type, quantity FROM resources WHERE classroom = '"+classSelected+"' ");
                     
                     Resources objd = new Resources();
                     DefaultTableModel model = (DefaultTableModel) objd.jTable1.getModel();
                     model.setRowCount(0);
                     
                     while (rs.next()) {
                         Object[] row = new Object[3];
                         row[0] = rs.getString("type");
                         row[1] = rs.getInt("quantity");
                         model.addRow(row);
                     }
                     
                     System.out.println("subject showing success");
                 } catch (SQLException e){
                     System.out.println("Subjects showing failed "+e);
                 }
             }
             case "cls2" -> {
                 try {
                     Connection con = DataBaseConnection.getCon();
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery("SELECT type, quantity FROM resources WHERE classroom = '"+classSelected+"' ");
                     
                     Resources objd = new Resources();
                     DefaultTableModel model = (DefaultTableModel) objd.jTable1.getModel();
                     model.setRowCount(0);
                     
                     while (rs.next()) {
                         Object[] row = new Object[3];
                         row[0] = rs.getString("type");
                         row[1] = rs.getInt("quantity");
                         model.addRow(row);
                     }
                     
                     System.out.println("subject showing success");
                 } catch (SQLException e){
                     System.out.println("Subjects showing failed "+e);
                 }
             }
             default -> {
                 try {
                     Connection con = DataBaseConnection.getCon();
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery("SELECT type, quantity FROM resources WHERE classroom = '"+classSelected+"' ");
                     
                     
                     //view.setModel(DbUtils.resultSetToTableModel(re))
                     
                     Resources objd = new Resources();
                     DefaultTableModel model = (DefaultTableModel) objd.jTable1.getModel();
                     model.setRowCount(0);
                     
                     while (rs.next()) {
                         Object[] row = new Object[3];
                         row[0] = rs.getString("type");
                         row[1] = rs.getInt("quantity");
                         model.addRow(row);
                     }
                     
                     System.out.println("subject showing success");
                 } catch (SQLException e){
                     System.out.println("Subjects showing failed "+e);
                 }
             }
         }
        
    }
          
}
