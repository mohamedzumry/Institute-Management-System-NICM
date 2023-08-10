/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examservice.entity;

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
@Table(name = "exam_tlb")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int examId;

    @Column(name = "emodule")
    private String examModule;

    @Column(name = "etype")
    private String examType;

    @Column(name = "edate", columnDefinition = "date")
    private String examDate;

    @Column(name = "estart_time", columnDefinition = "time")
    private String examStartTime;
    
    @Column(name = "eend_time", columnDefinition = "time")
    private String examEndTime;

    @Column(name = "ehall") 
    private int examHall;

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamModule() {
        return examModule;
    }

    public void setExamModule(String examModule) {
        this.examModule = examModule;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getExamStartTime() {
        return examStartTime;
    }

    public void setExamStartTime(String examStartTime) {
        this.examStartTime = examStartTime;
    }

    public String getExamEndTime() {
        return examEndTime;
    }

    public void setExamEndTime(String examEndTime) {
        this.examEndTime = examEndTime;
    }

    public int getExamHall() {
        return examHall;
    }

    public void setExamHall(int examHall) {
        this.examHall = examHall;
    }

    
}
