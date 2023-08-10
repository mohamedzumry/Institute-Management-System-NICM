/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.controller;

import com.example.courseservice.entity.Course;
import com.example.courseservice.entity.Module;
import com.example.courseservice.service.CourseService;
import java.util.List;
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
 * @author sanug
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    /*--------ALL Rest End Points for Courses-----------*/
    @GetMapping(path = "/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    
    @GetMapping(path = "/courses/{courseId}")
    public Course getCourseById(@PathVariable int courseId) {
        return courseService.getCourseById(courseId);
    }
    
    @GetMapping(path = "/courses/name={courseName}")
    public List<Course> getCourseByName(@PathVariable String courseName){
        return courseService.getCourseByName(courseName);
    }
    
    @PostMapping(path = "/courses")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }
    
    @PutMapping(path = "/courses")
    public Course updateCourseById(@RequestBody Course course) {
        return courseService.updateCourseById(course);
    }
    
    @DeleteMapping(path = "/courses/{courseId}")
    public void deleteCourseById(@PathVariable int courseId) {
        courseService.deleteCourseById(courseId);
    }

    /*--------ALL Rest End Points for Modules-----------*/
    @GetMapping(path = "/courses/{courseId}/modules")
    public List<Module> getAllModulesByCourseId(@PathVariable int courseId) {
        return courseService.getAllModulesByCourseId(courseId);
    }

    @PostMapping(path = "/courses/{courseId}/modules")
    public Module createModule(@RequestBody Module moduleData){
        return courseService.createModule(moduleData);
    }
    
//    @GetMapping(path = "/courses/{courseId}/modules/{moduleId}")
//    public Module getGivenModuleByCourseId(@PathVariable int courseId, @PathVariable int moduleId) {
//        return courseService.getGivenModuleByCourseId(courseId, moduleId);
//    }

//    @PutMapping(path = "/courses/{courseId}/modules")
//    public Module updateGivenModuleByCourseId(@PathVariable int courseId, @RequestBody Module module) {
//        return courseService.updateModule(module);
//    }
    
}
