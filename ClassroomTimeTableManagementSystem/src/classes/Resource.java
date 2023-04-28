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
         
          public void add( String classroom, String res, int num ){
                    
                    try {
                              Connection con = DataBaseConnection.getCon();
                              Statement st = con.createStatement();
                              st.executeUpdate( " INSERT INTO resources (classroom, resname, quantity)  VALUES ( ' "+classroom+" ', ' "+res+" ', ' "+num+" ' )"  );
                              JOptionPane.showMessageDialog(null, "Resource addition successfull !");
                              System.out.println("Resource addition successfull");
                    } catch ( SQLException e ) {
                              JOptionPane.showMessageDialog(null, "Resource addition failed !");
                              System.out.println(e);
                    }
                    DataBaseConnection.closeCon();
          }
}
