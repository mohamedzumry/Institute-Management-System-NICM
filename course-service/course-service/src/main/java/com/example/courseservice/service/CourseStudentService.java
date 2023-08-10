/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.service;

import com.example.courseservice.entity.courseStudent;
import com.example.courseservice.repository.CourseStudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class CourseStudentService {
    
    @Autowired
    private CourseStudentRepository courseStudentRepo;
    
    public List<courseStudent> getAllCourseStudents(){
        return courseStudentRepo.findAll();
    }
    
    public List<Object> getCourseStudentIdsByCourseId(int courseId){
        return courseStudentRepo.getCourseStudentIdsByCourseId(courseId);
    }
    
    public List<Object> getCourseIdsForUserId(int userId){
      return courseStudentRepo.getCourseIdsForUserId(userId);
    }
    
    public courseStudent registerStudentForCourse(courseStudent courseStudentData){
        return courseStudentRepo.save(courseStudentData);
    }
    
    public void deleteCourseStudent(int courseId, int userId){
        courseStudentRepo.removeStudentFromCourse(courseId, userId);
    }
    
}
