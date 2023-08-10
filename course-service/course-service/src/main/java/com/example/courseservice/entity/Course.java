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
 * @author sanug
 */
@Entity
@Table(name = "course_tlb")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int courseId;

    @Column(name = "cname")
    private String courseName;
    
    @Column(name = "cbatch")
    private String courseBatch;

    @Column(name = "duration")
    private int courseDuration;

    @Column(name = "medium")
    private String courseMedium;

    @Column(name = "director")
    private String courseDirector;

    @Column(name = "description")
    private String courseDes;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseBatch() {
        return courseBatch;
    }

    public void setCourseBatch(String courseBatch) {
        this.courseBatch = courseBatch;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseMedium() {
        return courseMedium;
    }

    public void setCourseMedium(String courseMedium) {
        this.courseMedium = courseMedium;
    }

    public String getCourseDirector() {
        return courseDirector;
    }

    public void setCourseDirector(String courseDirector) {
        this.courseDirector = courseDirector;
    }

    public String getCourseDes() {
        return courseDes;
    }

    public void setCourseDes(String courseDes) {
        this.courseDes = courseDes;
    }
}
