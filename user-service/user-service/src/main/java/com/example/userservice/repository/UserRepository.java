/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.userservice.repository;

import com.example.userservice.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanug
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    @Query("select u from User u where u.userEmail=?1")
    public Optional<User> getUserByEmail(String email);

}
