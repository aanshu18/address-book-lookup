package com.ashutosh.project.Entity;

import java.io.Serializable;

public class Users implements Serializable {
   private String name;
   private int age;
   private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    private String emailId;
   private String mobileNo;

    public Users(String name, int age, String address, String emailId, String mobileNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

}
