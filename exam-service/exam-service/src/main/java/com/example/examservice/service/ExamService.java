/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examservice.service;

import com.example.examservice.entity.Exam;
import com.example.examservice.entity.Result;
import com.example.examservice.repository.ExamRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanug
 */
@Service
public class ExamService {
    
    @Autowired
    private ExamRepository examRepository;
    
    @Autowired
    private ResultService resultService;

    /*-----------------------------------All Services For Exams------------------------------------*/
    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }
    
    public Exam getExamById(int examId) {
        Optional<Exam> obj = examRepository.findById(examId);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            return null;
        }
    }
    
    public List<Exam> getExamsByName(String examName){
        return examRepository.getExamsByName(examName);
    }
    
    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }
    
    public Exam updateExam(Exam examData){
        return examRepository.save(examData);
    }
    
    public void deleteExamById(int examId) {
        examRepository.deleteById(examId);
    }

    /*-----------------------------------All Services For Results------------------------------------*/
    public List<Result> getAllResultsByExamId(int examId) {
        Optional<Exam> obj = examRepository.findById(examId);
        if (obj.isPresent()) {
            return resultService.getAllResultsByExamId(examId);
        } else {
            return null;
        }
    }

    public Result getGivenResultByExamId(int examId, int resultId) {
        Optional<Exam> obj = examRepository.findById(examId);
        if (obj.isPresent()) {
            return resultService.getGivenResultByExamId(examId, resultId);
        } else {
            return null;
        }
    }

    public Result createResultByExamId(int examId, Result result) {
        Optional<Exam> obj = examRepository.findById(examId);
        if (obj.isPresent()) {
            return resultService.createResultByExamId(examId, result);
        } else {
            return null;
        }
    }

    public Result updateGivenResultByExamId(int examId, int resultId, Result result) {
        Optional<Exam> obj = examRepository.findById(examId);
        if (obj.isPresent()) {
            return resultService.updateGivenResultByExamId(examId, resultId, result);
        } else {
            return null;
        }
        
    }
    
    public void deleteGivenResultByExamId(int examId, int resultId) {
        resultService.deleteGivenResultByExamId(examId, resultId);
    }
}
