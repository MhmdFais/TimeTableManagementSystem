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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Classroom extends JFrame{
   private String faculty;
   private String classroom;
   private int capacity;

    
    
    public void sub(String faculty, String classroom, int capacity) throws SQLException{
                    
        
                     Connection con = DataBaseConnection.getCon();
                     Statement st = con.createStatement();
                    try {
                             
                              st.executeUpdate( " INSERT INTO classroom (classroom, faculty, capacity) VALUES (' "+classroom+" ',' "+faculty+" ',' "+capacity+" ')  "  );
                              //JOptionPane.showMessageDialog(null, "Successfull info addition!");
                              System.out.println("Successfull info addition");
                              JOptionPane.showMessageDialog(null, "Info addition successful !");
                    } catch ( SQLException e ) {
                              JOptionPane.showMessageDialog(null, "Info addition failed !");
                              System.out.println("error " + e);
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
                      int rowsUpdated = st.executeUpdate("INSERT INTO classroom (classroom, faculty, capacity) VALUES ('"+classroom+"','"+faculty+"','"+capacity+"')");
                              JOptionPane.showMessageDialog(null, "Successfully updated");
                              System.out.println(rowsUpdated+"Successfully deleted");
                    } catch ( SQLException ex ) {
                              JOptionPane.showMessageDialog(null, "Action failed !");
                              System.out.println(ex);
                    }
                    //DataBaseConnection.closeCon();   
    }
    
     
    // Muhammed
     
    /**public void showClassroom(){
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
    }**/
     
    /**public void showClassroom(){
        
        //JTable table;
        //DefaultTableModel tableModel;
        
        
        //super("Classrooms");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(500, 500);

        // Create a JTable and set its model
        //tableModel = new DefaultTableModel();
        //table = new JTable(tableModel);
        //JScrollPane scrollPane = new JScrollPane(table);
        //getContentPane().add(scrollPane);

        // Connect to the database
        try {
            //String url = // (this is an example give the database location here) “jdbc:mysql://localhost:3306/school”;
                    //String user = // give the User name ;
                    //String password = // give the Password;
                    //Connection conn = DriverManager.getConnection(url, user, password);

            // Execute a query to retrieve the data
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            String sql = "SELECT classroom,faulty,capacity FROM classrooms";
            ResultSet rs = st.executeQuery(sql);
            
             DefaultTableModel tableModel = new DefaultTableModel();
             jTableClass.setModel(tableModel);

            // Add the data to the table model
            tableModel.addColumn("Classroom ID");
            tableModel.addColumn("Faculty");
            
            
            tableModel.addColumn("Class Name");
            tableModel.addColumn("Capacity");

            while (rs.next()) {
                Object[] row = new Object[4];
                row[0] = rs.getInt("classroom_id");
                row[1] = rs.getString("faculty");
                row[2] = rs.getString("class_name");
                row[3] = rs.getInt("capacity");
                tableModel.addRow(row);
            }

            // Close the database connection
            //rs.close();
            //stmt.close();
            //con.close();
        } catch (SQLException ex) {
            System.out.println("Database connection failed");
        }
        
    }**/
    
    
     
}
