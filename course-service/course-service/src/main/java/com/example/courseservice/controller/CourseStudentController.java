/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.controller;

import com.example.courseservice.entity.courseStudent;
import com.example.courseservice.service.CourseStudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class CourseStudentController {
    
    @Autowired
    private CourseStudentService courseStudentService;
    
    @GetMapping(path = "/course-students")
    public List<courseStudent> getAllCourseStudents(){
        return courseStudentService.getAllCourseStudents();
    }
    
    @GetMapping(path = "/course-students/{userId}/courses")
    public List<Object> getCourseIdsForUserId(@PathVariable int userId){
        return courseStudentService.getCourseIdsForUserId(userId);
    }
    
    @GetMapping(path = "/course-students/courses/{courseId}/students")
    public List<Object> getCourseStudentIdsByCourseId(@PathVariable int courseId){
        return courseStudentService.getCourseStudentIdsByCourseId(courseId);
    }
    
    @PostMapping(path = "/course-students")
    public courseStudent registerStudentForCourse(@RequestBody courseStudent courseStudentData){
        return courseStudentService.registerStudentForCourse(courseStudentData);
    }
    
    @DeleteMapping(path = "/course-students/courses/{courseId}/students/{userId}")
    public void deleteCourseStudent(@PathVariable int courseId, @PathVariable int userId){
        courseStudentService.deleteCourseStudent(courseId, userId);
    }
    
}
