/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Muhammed
 */


import Admin.AddEditSubjects;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

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
            //String insertQuery = "INSERT INTO schedule (start, end) VALUES (" + startTime + ", " + endTime + ")";
            //st.executeUpdate(insertQuery);
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
            String query = ( " SELECT classname, faculty FROM schedule WHERE classname="+clasroom+", faculty="+faculty+" " );
            ResultSet rs = st.executeQuery(query);
            if ( rs.next() ){
               int count = rs.getInt(1);
               if (count > 0) {
                    //JOptionPane.showMessageDialog(null,"Classroom is not available!!");
                    return false;
                }
            }
            
            //String insertQuery = "INSERT INTO schedule (classname, faculty) VALUES (" + clasroom + ", " + faculty + ")";
            //st.executeUpdate(insertQuery);
            return true;
            
        } catch ( SQLException e) {
            System.out.println(e);
            return false; 
        }
        
    } 
    
    public boolean createSchedule ( String subCode, String subName, int seat, int startTime , int endTime,String clasroom , String faculty  ) {
       
        if ( is_class_available( clasroom, faculty ) ){
            
            if ( is_time_available( startTime, endTime ) ) {
                
                try {
                    Connection con = DataBaseConnection.getCon();
                    Statement st = con.createStatement();
                    
                    st.executeLargeUpdate( " INSERT INTO schedule ( classname, subject,"
                            + " faculty, classSize, start, end, subid ) "
                            + " VALUES ("+clasroom+", "+subName+", "+faculty+", "+seat+", "+startTime+", "+endTime+", "+subCode+" ) " );
                    
                    //JOptionPane.showMessageDialog(null, "Schedule added successfully!!");
                    System.out.println("Schedule adding successfull");
                    return true;
                } catch ( SQLException e ){
                    //JOptionPane.showMessageDialog(null,"SQL Connection failed!");
                    return false;
                }
                
            }
            else {
                //JOptionPane.showMessageDialog(null, "Time slot is not available!");
                System.out.println("Time slot is not available!");
                return false;
            }
            
        } 
        else {
            //JOptionPane.showMessageDialog(null,"Classroom is not available!");
            System.out.println("Classroom is not available! "); 
            return false;
        }
        
    }
    
    
    public boolean delete ( String subCode, String subName, int seat, int startTime , int endTime,String clasroom , String faculty ){
        
        if ( is_class_available( clasroom, faculty ) ) {
            
            if ( is_time_available( startTime, endTime ) ) {
                
                if ( show( subCode,subName,seat,startTime ,endTime,clasroom ,faculty ) ){
                    
                    try {
                        Connection con = DataBaseConnection.getCon();
                        Statement st = con.createStatement(); 
                  
                        String delete = " DELETE FROM schedule WHERE classname = ' "+clasroom+" ', faculty = '"+faculty+"', start= '"+startTime+"', end='"+endTime+"' "; 
                        st.executeLargeUpdate(delete);
                        return true;
                    } catch ( SQLException e ) {
                    return false;
                    }
                    
                } else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
          return false;  
        } 
        
    }
    
    public void update ( String subCode, String subName, int seat  ) {
        
        try {
            Connection con = DataBaseConnection.getCon();
            Statement st = con.createStatement();
            
            int rowUpdate = st.executeUpdate( " UPDATE schedule SET subid = '"+subCode+" ', subject = '"+subName+" ', classSize =' "+seat+" ' " );
            System.out.println("Row updated!" + rowUpdate);
            JOptionPane.showMessageDialog(null, "Schedule update successfull!");
        } catch ( SQLException ex ){
            System.out.println("update failed" + ex);
            JOptionPane.showMessageDialog(null, "Schedule is not updated!");
        }
        
    }
    
    public boolean show ( String subCode, String subName, int seat, int startTime , int endTime,String clasroom , String faculty ){
        
        if ( is_class_available( clasroom, faculty ) ) {
            
            if ( is_time_available( startTime, endTime ) ) {
                
                try {
                    Connection con = DataBaseConnection.getCon();
                    Statement st = con.createStatement(); 
                    
                    ResultSet rs = st.executeQuery(" SELECT * FROM schedule ");
                    String sid = rs.getString(8);
                    String sname = rs.getString(3);
                    int seats = rs.getInt(5);
                    
                    AddEditSubjects obja = new AddEditSubjects();
                    
                    obja.display(sid, sname, seats);
                    return true;
                } catch ( SQLException ex){
                    System.out.println("update error"+ ex);
                    return false;
                    //JOptionPane.showMessageDialog(null, "No class is not scheduled for this time");
                }
            }
            return false;
            
        }
        return false;
    }
}
