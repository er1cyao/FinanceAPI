package com.eryao.financeapi.model;

import java.time.LocalDateTime;

public class User {
    
    private long id;
    private String username;
    private String passwordHash;
    private String email;
    private LocalDateTime createdAt;

    public User(long id, String username, String passwordHash, String email, LocalDateTime createdAt){
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.createdAt = createdAt;
    }

    public long getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPasswordHash(){
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash){
        this.passwordHash = passwordHash;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }


}
