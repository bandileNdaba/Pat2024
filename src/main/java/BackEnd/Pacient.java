/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author bandi
 */
public class Pacient {
    private int playerID;
    private String name;
    private String surname;
    private int cardNumber;
    private String gender;
    private int phoneNumber;
    private String email;
    private double weight;
    private String location;
    private String previousCondition;
    
    public Pacient(int playerID, String name, String surname, int cardNumber, String gender, int phoneNumber, String email, double weight, String location, String previousCondition) {
        this.playerID = playerID;
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.weight = weight;
        this.location = location;
        this.previousCondition = previousCondition;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    

    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getGender() {
        return gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    

    public String getLocation() {
        return location;
    }

    public String getPreviousCondition() {
        return previousCondition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPreviousCondition(String previousCondition) {
        this.previousCondition = previousCondition;
    }
    
  
    
 
}
