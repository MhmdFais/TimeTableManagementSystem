/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author nimthaka and Muhammed
 */
import Admin.Classrooms;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class Classroom {
   private String faculty;
   private String classroom;
   private int capacity;

    public Classroom(String faculty, String classroom, int capacity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Classroom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public void sub(String faculty, String classroom, int capacity){
                    
                    try {
                              Connection con = DataBaseConnection.getCon();
                              Statement st = con.createStatement();
                              st.executeUpdate( " INSERT INTO classroom (classroom, faculty, capacity)  VALUES ( ' "+classroom+" ',' "+faculty+" ', ' "+capacity+" '  )"  );
                              JOptionPane.showMessageDialog(null, "Successfull info addition!");
                              System.out.println("Successfull info addition");
                    } catch ( SQLException e ) {
                              JOptionPane.showMessageDialog(null, "Info addition failed !");
                              System.out.println(e);
                    }
                    //DataBaseConnection.closeCon();
          }

    public void del(String faculty, String classroom, int capacity) {
          try {
                      Connection con = DataBaseConnection.getCon();
                      Statement st;
                      st = con.createStatement();
                      int deleteQuerry = st.executeUpdate("DELETE FROM classroom VALUES ( ' "+faculty+" ', ' "+classroom+" ', ' "+capacity+" '  )");
                              JOptionPane.showMessageDialog(null, "Successfully deleted");
                              System.out.println("Successfully deleted");
                    } catch ( SQLException ex ) {
                              JOptionPane.showMessageDialog(null, "Action failed !");
                              System.out.println(ex);
                    }
                    //DataBaseConnection.closeCon();   
    }
    
     public void upd(String faculty, String classroom, int capacity) {
                      
          try {      
                      Connection con = DataBaseConnection.getCon();
                      Statement st;
                      st = con.createStatement();
                      int rowsUpdated = st.executeUpdate("UPDATE classroom set capacity = ' "+capacity+" ' WHERE faculty = ' "+faculty+" ', classroom = ' "+classroom+" ' ");
                              JOptionPane.showMessageDialog(null, "Successfully updated");
                              System.out.println(rowsUpdated+"Successfully deleted");
                    } catch ( SQLException ex ) {
                              JOptionPane.showMessageDialog(null, "Action failed !");
                              System.out.println(ex);
                    }
                    //DataBaseConnection.closeCon();   
    }
    
     
    // Muhammed
     
     public void showClassroom(){
         try {
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT faculty,classname,capacity FROM classroom");
            
            Classrooms obja = new Classrooms();
            DefaultTableModel model = (DefaultTableModel) obja.jTable1.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getString("faculty");
                row[1] = rs.getString("classname");
                row[2] = rs.getString("capacity");
                model.addRow(row);
            }
            
            System.out.println("subject showing success");
        } catch (SQLException e){
            System.out.println("Subjects showing failed "+e);
        }
     }
     
}
