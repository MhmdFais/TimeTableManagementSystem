/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Muhammed
 */

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Schedule {
    
    public boolean is_time_available ( int startTime , int endTime ){
        
        try {
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            
            // to check the availability of the time slot 
            String query = ( " SELECT start, end FROM schedule WHERE start="+startTime+", end="+endTime+" " );
            ResultSet rs = st.executeQuery(query);
            // If the count is greater than 0, then there are conflicting bookings and the time slot is not available
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    JOptionPane.showMessageDialog(null,"Time slot is not available!!");
                    return false;
                }
            }
            
            // If the time slot is available, add the booking to the database
            String insertQuery = "INSERT INTO schedule (start, end) VALUES (" + startTime + ", " + endTime + ")";
            st.executeUpdate(insertQuery);
            return true;
        } catch ( SQLException e ){
            return false;
        }
        
    }
    
    public boolean is_class_available ( String clasroom , String faculty ) {
        
        try {
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            
            // Check if the classroom is available for the given faculty
             
        } catch ( SQLException e) {
            System.out.println(e);
            return false;
        }
        
        return true;
    } 
    
    public void createSchedule ( String subCode, String subName, int seat ) {
        
        
    }
}
