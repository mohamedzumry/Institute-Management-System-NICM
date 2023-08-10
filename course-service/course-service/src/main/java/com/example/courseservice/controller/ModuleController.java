/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.controller;

import com.example.courseservice.entity.Module;
import com.example.courseservice.service.ModuleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sanug
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping(path = "/modules")
    public List<Module> getAllCourses() {
        return moduleService.getAllModules();
    }
    
    @GetMapping(path = "/modules/user/{userId}")
    public List<Module> getAllModulesByUserId(@PathVariable int userId){
        return moduleService.getAllModulesByUserId(userId);
    }
    
    @GetMapping(path = "/modules/{moduleId}")
    public Module getModuleById(@PathVariable int moduleId){
        return moduleService.getModuleById(moduleId);
    }
    
    @GetMapping(path = "/modules/name={courseName}")
    public List<Module> getModulesByName(@PathVariable String courseName){
        return moduleService.getModulesByName(courseName);
    }
    
    @PutMapping(path = "/modules")
    public Module updateModule(@RequestBody Module module) {
        return moduleService.updateModule(module);
    }
    
    @DeleteMapping(path = "/modules/{moduleId}")
    public void deleteGivenModuleByCourseId(@PathVariable int courseId, @PathVariable int moduleId) {
        moduleService.deleteModuleById(moduleId);
    }
     
}
