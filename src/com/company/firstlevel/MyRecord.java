package com.company.firstlevel;

/**
 * Created by Studenta on 04.05.2017.
 */
public class MyRecord {

    private String name, surname, phone, postaladdress, email, website;

    public MyRecord(String name, String surname, String phone, String postaladdress, String email, String website){

        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.postaladdress = postaladdress;
        this.email = email;
        this.website = website;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPostaladdress(String postaladdress) {
        this.postaladdress = postaladdress;
    }

    public String getPostaladdress() {
        return postaladdress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

}
