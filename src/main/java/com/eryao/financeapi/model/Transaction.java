package com.eryao.financeapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;



public class Transaction {

    private long id;
    private BigDecimal amount;

    String description;
    LocalDate date;
    String merchant;
    String location;
    Category category;
    User user;

    
    public Transaction(long id, String description, BigDecimal amount, LocalDate date, String merchant, String location, Category category, User user){
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.merchant = merchant;
        this.location = location;
        this.category = category;
        this.user = user;

    }

    public long getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }


    public String getMerchant(){
        return merchant;
    }

    public void setMerchant(String merchant){
        this.merchant = merchant;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }


}
