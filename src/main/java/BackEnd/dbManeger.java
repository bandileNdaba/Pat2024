/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bandi
 */
public class dbManeger {

    public static final int PRACTISENUMBERCOLUM = 0;

    public static void updateFeild(
            String doctorName, String location, int rate, int phoneNumber) {

    }

    public static String getConsults( int practiseNumber) {
        String chat = "";
        try {
            ResultSet rs = DB.query("SELECT * FROM bepacient.consults where practiseNumber like " + practiseNumber + ";");
             chat = rs.getString(3);
            
        } catch (SQLException ex) {
            Logger.getLogger(dbManeger.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return chat;
        

    }

    public static void MakeConsults(
            String practiseNumber,
            String consult,
            String pacientID) {
        try {
            DB.update(consult + "INSERT INTO `bepacient.consults` (`practiseNumber`, `patientID`, `Chat`) VALUES ('" + practiseNumber + "', '" + pacientID + "', '" + "'");
        } catch (SQLException ex) {
            Logger.getLogger(dbManeger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//Pacient Inserter
    public static void createPacient(
            String pacientConditions,
            int pacientCardNumber,
            String pacientLocation,
            String pacientEmail,
            String pacientGender,
            String pacientName,
            int pacientPhoneNumber,
            String pacientSurname,
            double pacientWeight) {

        try {
            DB.update("INSERT INTO `bepacient`.`userinformation` ('Name', `Surname`, `Card Number`, `gender`, `Phone number`, `Email address`, `Weight`, `Location`, `previos conditions`) VALUES ( '" + pacientName + "', '" + pacientSurname + "', '" + pacientCardNumber + "', '" + pacientGender + "', '" + pacientPhoneNumber + "', '" + pacientEmail + "', '" + pacientWeight + "', '" + pacientLocation + "', '" + pacientConditions + "');");
        } catch (SQLException ex) {
            Logger.getLogger(dbManeger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Doctor Inserter
    public static void createDoctor(
            int rate,
            int practicenumber,
            String doctorName,
            String doctorLocation,
            String doctorEmail,
            String doctorGender,
            String doctorDOB,
            int doctorPhoneNumber,
            String doctorSurname,
            int doctorIDNumber,
            String Speciality) {
        try {

            
            DB.update("INSERT INTO `bepacient`.`doctorinfomation` (`practise number`, `Name`, `surname`, `Province`, `phone number`, `idNumber`, `Email`, `DOB`, `Speciality`, `Rate/Hour`) VALUES (`" + practicenumber + "`, `" + doctorName + "`, `" + doctorSurname + "`, `" + doctorLocation + "`, `" + doctorPhoneNumber + "`, `" + doctorIDNumber + "`, `" + doctorEmail + "`, `" + doctorDOB + "`, `" + doctorGender + "`, `" + rate + "`");;
        } catch (SQLException ex) {
            Logger.getLogger(dbManeger.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public static DefaultTableModel paicnetConsultTable() throws SQLException {
        String query = "SELECT * FROM bepacient.consults;";
        DefaultTableModel defaultTable2 = null;

        try (
                ResultSet rs = DB.query(query);) {
            String[] columnNames = {"PracticeNumber", "Name", "Location",};

            // Initialize the table model
            defaultTable2 = new DefaultTableModel(columnNames, 0);

            // Iterate through the ResultSet and populate the table model
            while (rs.next()) {
                int fetchedPracticeNumber = rs.getInt(1);
                String fetchedName = rs.getString(2);
                String fetchedLocation = rs.getString(3);

                // Add each row to the table model
                Object[] row = {fetchedPracticeNumber, fetchedName, fetchedLocation};
                defaultTable2.addRow(row);
            }

            // Close the ResultSet
            rs.close();
        }

        // Return the table model
        return defaultTable2;

    }

    public static DefaultTableModel AccountTable() throws SQLException {
        String query = "SELECT * FROM bepacient.userinformation;";
        DefaultTableModel tableMode3;
        try (ResultSet rs = DB.query(query);) {
            String[] columnNames = {"Name", "Surname", "Pasword", "Gmail", "weight"};
            tableMode3 = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                String fetchName = rs.getString(2);
                String fetchSurname = rs.getString(3);
                String fetchpassword = rs.getString(11);
                String fetchGmail = rs.getString(7);
                double fetchWeight = rs.getDouble(8);
                Object[] row = {fetchName, fetchSurname, fetchpassword, fetchGmail, fetchWeight};
                tableMode3.addRow(row);

            }
            rs.close();

        }
        return tableMode3;

    }

    public static DefaultTableModel mainMenuTable() throws SQLException {

        String query = "SELECT * FROM bepacient.doctorinfomation;";

        DefaultTableModel tableModel;

        try (
                // Execute the query
                ResultSet rs = DB.query(query);) {
            // Define column names for the table model
            String[] columnNames = {"PracticeNumber", "Name", "Location", "Rate/Hour", "Speciality"};

            // Initialize the table model
            tableModel = new DefaultTableModel(columnNames, 0);

            // Iterate through the ResultSet and populate the table model
            while (rs.next()) {
                int fetchedPracticeNumber = rs.getInt(1);
                String fetchedName = rs.getString(2);
                String fetchedLocation = rs.getString(3);
                double fetchedRateHour = rs.getDouble(10);
                String fetchedSpeciality = rs.getString(9);

                // Add each row to the table model
                Object[] row = {fetchedPracticeNumber, fetchedName, fetchedLocation, fetchedRateHour, fetchedSpeciality};
                tableModel.addRow(row);
            }

            // Close the ResultSet
            rs.close();
        }

        // Return the table model
        return tableModel;
    }
}
