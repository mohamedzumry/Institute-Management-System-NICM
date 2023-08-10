/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examservice.service;

import com.example.examservice.entity.Result;
import com.example.examservice.repository.ResultRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanug
 */
@Service
public class ResultService {
    
    @Autowired
    private ResultRepository resultRepository;
    
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }
    
    public List<Result> getResultsByUserId(int userId) {
        return resultRepository.getResultsByUserId(userId);
    }
    
    public List<Result> getAllResultsByExamId(int examId) {
        return resultRepository.getAllResultsByExamId(examId);
    }
    
    public Result getGivenResultByExamId(int examId, int resultId) {
        return resultRepository.getGivenResultByExamId(examId, resultId);
    }
    
    public Result addResult(Result resultData){
        return resultRepository.save(resultData);
    }
    
    public Result createResultByExamId(int examId, Result result) {
        result.setExamNo(examId);
        return resultRepository.save(result);
    }

    public Result updateGivenResultByExamId(int examId, int resultId, Result result) {
        Optional<Result> obj = resultRepository.findById(resultId);
        if (obj.isPresent()) {
            Result previousResult = obj.get();
            if (result.getStudentId() != 0) {
                previousResult.setStudentId(result.getStudentId());
            }
            if (result.getResultPass() != null) {
                previousResult.setResultPass(result.getResultPass());
            }
            if (result.getResultGpa() != 0.0) {
                previousResult.setResultGpa(result.getResultGpa());
            }
            if (result.getResultNote() != null) {
                previousResult.setResultNote(result.getResultNote());
            }
            previousResult.setResultId(resultId);
            previousResult.setExamNo(examId);
            return resultRepository.save(previousResult);
        } else {
            return null;
        }
    }

    public void deleteGivenResultByExamId(int examId, int resultId) {
        resultRepository.deleteGivenResultByExamId(examId, resultId);
    }
}
