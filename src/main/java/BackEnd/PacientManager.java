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
public class PacientManager {
    private Pacient[] pacient = new Pacient[10000];
    private int size = 0; 
    private int playerId =0;
    
    public PacientManager() throws SQLException{
        String query = "SELECT * FROM bepacient.userinformation;";
        ResultSet rs = DB.query(query);
        while(rs.next()){
            String name = rs.getString("Name");
            String surname = rs.getString("Surname");
            String gender = rs.getString("gender");
            String email = rs.getString("Email address");
            String location = rs.getString("Location");
            String pastCondition = rs.getString("previos conditions");
            int cardNumber = rs.getInt("Card Number");
            double weight = rs.getDouble("Weight");
            playerId++;
            Pacient p = new Pacient(playerId, name, surname, cardNumber, gender, cardNumber, email, weight, location, pastCondition);
            size++;
        }
        
                
    }
    public String[] getPacientNames(){
        String[] names = new String[size];
         for (int i = 0; i < names.length; i++) {
            String name = names[i];
            
        }
        return names;
    }
    
}
