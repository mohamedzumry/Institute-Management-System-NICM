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
@Table(name = "result_tlb")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rid")
    private int resultId;

    @Column(name = "stud_id")
    private int studentId;

    @Column(name = "eno")
    private int examNo;

    @Column(name = "pass")
    private String resultPass;

    @Column(name = "gpa")
    private double resultGpa;

    @Column(name = "note")
    private String resultNote;

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getExamNo() {
        return examNo;
    }

    public void setExamNo(int examNo) {
        this.examNo = examNo;
    }

    public String getResultPass() {
        return resultPass;
    }

    public void setResultPass(String resultPass) {
        this.resultPass = resultPass;
    }

    public double getResultGpa() {
        return resultGpa;
    }

    public void setResultGpa(double resultGpa) {
        this.resultGpa = resultGpa;
    }

    public String getResultNote() {
        return resultNote;
    }

    public void setResultNote(String resultNote) {
        this.resultNote = resultNote;
    }

}
