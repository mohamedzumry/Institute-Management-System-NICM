/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sanug
 */
@Entity
@Table(name = "user_tlb")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;;
    
    @Column(name = "email", unique=true, nullable = false, columnDefinition = "varchar(75)")
    private String userEmail;;
    
    @Column(name = "password", nullable = false, columnDefinition = "varchar(15)")
    private String userPassword;
    
    @Column(name = "first_name", nullable = false, columnDefinition = "varchar(20)")
    private String userFirstName;
    
    @Column(name = "last_name", nullable = false, columnDefinition = "varchar(20)")
    private String userLastName;
    
    @Column(name = "address", columnDefinition = "varchar(100)", nullable = false)
    private String userAddress;
    
    @Column(name = "mobile", columnDefinition = "varchar(12)", nullable = false)
    private String userMobile;
    
    @Column(name = "gender", columnDefinition = "varchar(10)", nullable = false)
    private String userGender;
    
    @Column(name = "nic", columnDefinition = "varchar(12)")
    private String userNic;
    
    @Column(name = "spec", columnDefinition = "varchar(75)")
    private String userSpec;
    
    @Column(name = "user_role", columnDefinition = "varchar(1)", nullable = false)
    private String userRole;
    
    public User() {
    }

    public User(int userId, String userEmail, String userPassword, String userFirstName, String userLastName, String userAddress, String userMobile, String userGender, String userNic, String userSpec, String userRole) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userAddress = userAddress;
        this.userMobile = userMobile;
        this.userGender = userGender;
        this.userNic = userNic;
        this.userSpec = userSpec;
        this.userRole = userRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserNic() {
        return userNic;
    }

    public void setUserNic(String userNic) {
        this.userNic = userNic;
    }

    public String getUserSpec() {
        return userSpec;
    }

    public void setUserSpec(String userSpec) {
        this.userSpec = userSpec;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
