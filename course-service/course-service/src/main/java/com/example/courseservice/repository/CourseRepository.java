/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.courseservice.repository;

import com.example.courseservice.entity.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanug
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    
    @Query("Select c from Course c where c.courseName LIKE %?1% ")
    public List<Course> getCoursesByName(String courseName);

}
