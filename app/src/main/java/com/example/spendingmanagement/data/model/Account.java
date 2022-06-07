package com.example.spendingmanagement.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class Account {

    private String id;
    private String displayName;
    private String password;

    public Account(String id, String displayName, String password) {
        this.id = id;
        this.displayName = displayName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
