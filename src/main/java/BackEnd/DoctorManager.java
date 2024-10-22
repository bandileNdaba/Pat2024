/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bandi
 */
public class DoctorManager {
    private Doctor[] doctors = new Doctor[1000];
    private int size = 0;
    
    public DoctorManager() throws SQLException{
        String query = "SELECT * FROM bepacient.doctorinfomation;";
        ResultSet rs = DB.query(query);
        
        while(rs.next()){
            String rateStr = rs.getString("Rate/Hour");
            String name = rs.getString("Name");
            String surname = rs.getString("surname");
            String idNumberStr = rs.getString("idNumber");
            String email = rs.getString("Email");
            String dob = rs.getString("DOB");
            String practiseNumberStr = rs.getString("practise number");
            String province = rs.getString("Province");
            String phoneStr = rs.getString("phone number");
            String speciality = rs.getString("");
            
            Doctor d = new Doctor(rateStr, name, surname, idNumberStr, email, dob, practiseNumberStr, province, phoneStr, speciality);
            doctors[size] = d;
            size ++;
        }
        
        
    }
    
    public String[] getDoctorNames(){
        String [] names = new String[size];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            
        }
        return names;
    }
}
