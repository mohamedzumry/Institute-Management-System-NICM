/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.courseservice.repository;

import com.example.courseservice.entity.courseStudent;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Asus
 */
@Repository
@Transactional
public interface CourseStudentRepository extends JpaRepository<courseStudent, Integer> {

    @Query("Select courseId from courseStudent cs where cs.studentId=?1 ")
    public List<Object> getCourseIdsForUserId(int studentId);

    @Query("Select studentId from courseStudent cs where cs.courseId=?1 ")
    public List<Object> getCourseStudentIdsByCourseId(int courseId);
    
    @Modifying
    @Query("Delete from courseStudent cs where cs.courseId=?1 and cs.studentId=?2")
    public void removeStudentFromCourse(int courseId, int userId);

}
