/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examservice.controller;

import com.example.examservice.entity.Result;
import com.example.examservice.service.ResultService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sanug
 */
@RestController
@CrossOrigin
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping(path = "/results")
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }
    
    @GetMapping(path = "/results/{userId}")
    public List<Result> getResultsByUserId(@PathVariable int userId){
        return resultService.getResultsByUserId(userId);
    }
    
    @PostMapping(path = "/results")
    public Result addResult(@RequestBody Result resultData){
        return resultService.addResult(resultData);
    }
}
