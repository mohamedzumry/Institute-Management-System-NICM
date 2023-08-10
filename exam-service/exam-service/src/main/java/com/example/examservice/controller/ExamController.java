/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examservice.controller;

import com.example.examservice.entity.Exam;
import com.example.examservice.entity.Result;
import com.example.examservice.service.ExamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sanug
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class ExamController {

    @Autowired
    private ExamService examService;

    /*-----------------------------------All Rest End Points For Exams------------------------------------*/
    @GetMapping(path = "/exams")
    public List<Exam> getAllExams() {
        return examService.getAllExams();
    }

    @GetMapping(path = "/exams/{examId}")
    public Exam getExamById(@PathVariable int examId) {
        return examService.getExamById(examId);
    }
    
    @GetMapping(path = "/exams/name={examName}")
    public List<Exam> getExamsByName(@PathVariable String examName){
        return examService.getExamsByName(examName);
    }

    @PostMapping(path = "/exams")
    public Exam createExam(@RequestBody Exam exam) {
        return examService.createExam(exam);
    }

    @PutMapping(path = "/exams")
    public Exam updateExamById(@RequestBody Exam exam) {
        return examService.updateExam(exam);
    }
    
    @DeleteMapping(path = "/exams/{examId}")
    public void deleteExamById(@PathVariable int examId) {
        examService.deleteExamById(examId);
    }

    /*-----------------------------------All Rest End Points For Results------------------------------------*/
    @GetMapping(path = "/exams/{examId}/results")
    public List<Result> getAllResultsByExamId(@PathVariable int examId) {
        return examService.getAllResultsByExamId(examId);
    }

    @GetMapping(path = "/exams/{examId}/results/{resultId}")
    public Result getGivenResultByExamId(@PathVariable int examId, @PathVariable int resultId) {
        return examService.getGivenResultByExamId(examId, resultId);
    }

    @PostMapping(path = "/exams/{examId}/results")
    public Result createResultByExamId(@PathVariable int examId, @RequestBody Result result) {
        return examService.createResultByExamId(examId, result);
    }
    
    @PutMapping(path = "/exams/{examId}/results/{resultId}")
    public Result updateGivenResultByExamId(@PathVariable int examId, @PathVariable int resultId, @RequestBody Result result) {
        return examService.updateGivenResultByExamId(examId, resultId, result);
    }
    
    @DeleteMapping(path = "/exams/{examId}/results/{resultId}")
    public void deleteGivenResultByExamId(@PathVariable int examId, @PathVariable int resultId) {
        examService.deleteGivenResultByExamId(examId, resultId);
    }
}
