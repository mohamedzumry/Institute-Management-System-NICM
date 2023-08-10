/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "course_student_tlb")
public class courseStudent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseStudentId;
    
    @Column(name = "student_id")
    private int studentId;
    
    @Column(name = "course_id")
    private int courseId;

    public int getCourseStudentId() {
        return courseStudentId;
    }

    public void setCourseStudentId(int courseStudentId) {
        this.courseStudentId = courseStudentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
    
    
}
