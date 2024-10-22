/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.sql.SQLException;

/**
 *
 * @author bandi
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        DoctorManager dm = new DoctorManager();
        
        String[] names = dm.getDoctorNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            
        }
    }
}
