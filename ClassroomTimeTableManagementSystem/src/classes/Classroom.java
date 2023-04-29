/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author nimthaka
 */
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Classroom {
   private String faculty;
   private String classroom;
   private int capacity;

    public Classroom(String faculty, String classroom, String capacity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public void sub(){
                    
                    try {
                              Connection con = DataBaseConnection.getCon();
                              Statement st = con.createStatement();
                              st.executeUpdate( " INSERT INTO classroom (faculty, classroom, capacity)  VALUES ( ' "+faculty+" ', ' "+classroom+" ', ' "+capacity+" '  )"  );
                              JOptionPane.showMessageDialog(null, "Successfull info addition!");
                              System.out.println("Successfull info addition");
                    } catch ( SQLException e ) {
                              JOptionPane.showMessageDialog(null, "Info addition failed !");
                              System.out.println(e);
                    }
                    DataBaseConnection.closeCon();
          }

    public void del() {
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
                    DataBaseConnection.closeCon();   
    }
    
     public void upd() {
                      
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
                    DataBaseConnection.closeCon();   
    }
    
    
}
