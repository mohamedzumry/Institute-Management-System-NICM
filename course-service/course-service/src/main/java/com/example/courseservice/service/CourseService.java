/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.service;

import com.example.courseservice.entity.Course;
import com.example.courseservice.entity.Module;
import com.example.courseservice.repository.CourseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanug
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModuleService moduleService;

    /*--------ALL Services for Only Courses-----------*/
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int id) {
        Optional<Course> myOption = courseRepository.findById(id);
        if (myOption.isPresent()) {
            return myOption.get();
        } else {
            return null;
        }
    }
    
    public List<Course> getCourseByName(String courseName){
        return courseRepository.getCoursesByName(courseName);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourseById(Course course) {        
            return courseRepository.save(course);        
    }

    public void deleteCourseById(int courseId) {
        courseRepository.deleteById(courseId);
    }

    /*--------ALL Services for Only Modules-----------*/
    public List<Module> getAllModulesByCourseId(int courseId) {
        Optional<Course> myOption = courseRepository.findById(courseId);
        if (myOption.isPresent()) {
            return moduleService.getALLModulesByCourseId(courseId);
        } else {
            return null;
        }
    }
    
    public Module createModule(Module moduleData){
        return moduleService.createModule(moduleData);
    } 

//    public Module getGivenModuleByCourseId(int courseId, int moduleId) {
//        Optional<Course> myOption = courseRepository.findById(courseId);
//        if (myOption.isPresent()) {
//            return moduleService.getGivenModuleByCourseId(courseId, moduleId);
//        } else {
//            return null;
//        }
//    }

//    public Module updateGivenModuleByCourseId(int courseId, int moduleId, Module module) {
//        Optional<Course> myOption = courseRepository.findById(courseId);
//        if (myOption.isPresent()) {
//            return moduleService.updateGivenModuleByCourseId(courseId, moduleId, module);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteGivenModuleByCourseId(int courseId, int moduleId) {
//        moduleService.deleteGivenModuleByCourseId(courseId, moduleId);
//    }
}
