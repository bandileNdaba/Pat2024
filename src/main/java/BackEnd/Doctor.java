/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author bandi
 */
public class Doctor {
        private String rateStr;
        private String name;
        private String surname;
        private String idNumberStr;
        private String email;
        private String dob;
        private String practiseNumberStr;
        private String province;
        private String phoneStr;
        private String speciality;
        private String gender;

    public Doctor(String rateStr, String name, String surname, String idNumberStr, String email, String dob, String practiseNumberStr, String province, String phoneStr, String speciality) {
        this.rateStr = rateStr;
        this.name = name;
        this.surname = surname;
        this.idNumberStr = idNumberStr;
        this.email = email;
        this.dob = dob;
        this.practiseNumberStr = practiseNumberStr;
        this.province = province;
        this.phoneStr = phoneStr;
        this.speciality = speciality;
        
    }

    public String getRateStr() {
        return rateStr;
    }

    public void setRateStr(String rateStr) {
        this.rateStr = rateStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNumberStr() {
        return idNumberStr;
    }

    public void setIdNumberStr(String idNumberStr) {
        this.idNumberStr = idNumberStr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPractiseNumberStr() {
        return practiseNumberStr;
    }

    public void setPractiseNumberStr(String practiseNumberStr) {
        this.practiseNumberStr = practiseNumberStr;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneStr() {
        return phoneStr;
    }

    public void setPhoneStr(String phoneStr) {
        this.phoneStr = phoneStr;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
        
        
}
