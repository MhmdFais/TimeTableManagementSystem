/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MHMD
 */
public class Report {
    
    public static void generateTextReport(ResultSet resultSet, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("Schedule\n");
            fileWriter.write("Subject Code\tSubject Name\tSeats\tStart Time\tEnd Time\tClassroom\tFaculty\n");

            while (resultSet.next()) {
                String subCode = resultSet.getString("subid");
                String subName = resultSet.getString("subject");
                String seats = resultSet.getString("classSize");
                String startTime = resultSet.getString("start");
                String endTime = resultSet.getString("end");
                String classroom = resultSet.getString("classname");
                String faculty = resultSet.getString("faculty");

                String line = subCode + "\t" + subName + "\t" + seats + "\t" + startTime + "\t" + endTime + "\t" + classroom + "\t" + faculty + "\n";
                fileWriter.write(line);
            }

            System.out.println("Text report created successfully!");

        } catch (IOException | SQLException e) {
            System.err.println("Error generating text report: " + e.getMessage());
        }
    }
    
}
