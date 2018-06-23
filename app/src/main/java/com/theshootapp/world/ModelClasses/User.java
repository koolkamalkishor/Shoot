package com.theshootapp.world.ModelClasses;

/**
 * Created by hamza on 23-Jun-18.
 */

public class User {
    String userId;
    String phoneNumber;
    String name;

    public User(String userId, String phoneNumber, String name) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}