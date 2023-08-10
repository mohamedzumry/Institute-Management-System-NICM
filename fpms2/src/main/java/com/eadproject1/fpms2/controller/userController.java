 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eadproject1.fpms2.controller;

import com.eadproject1.fpms2.entity.User;
import com.eadproject1.fpms2.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class userController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
    
    @PostMapping(path = "/users")
    User createUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    
    @PutMapping("/users")
    void updateUserById(@RequestBody User user){
        userRepository.save(user);
    }
    
    @DeleteMapping(path = "/users/{id}")
    void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }
    
    @GetMapping(path = "/users/email={email}")
    Optional<User> getUserByEmail(@PathVariable String email){
        return userRepository.getUserByEmail(email);
    }
    
    @GetMapping(path = "/users/{id}")
    Optional<User> getUserById(@PathVariable int id){
        return userRepository.findById(id);
    }

}
