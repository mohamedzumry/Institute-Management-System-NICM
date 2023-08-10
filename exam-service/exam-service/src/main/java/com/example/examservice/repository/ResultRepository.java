/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examservice.repository;

import com.example.examservice.entity.Result;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanug
 */
@Repository
@Transactional
public interface ResultRepository extends JpaRepository<Result, Integer> {
    
    @Query("Select re from Result re where re.studentId=?1")
    public List<Result> getResultsByUserId(int userId);

    @Query("Select re from Result re where re.examNo=?1")
    public List<Result> getAllResultsByExamId(int examId);

    @Query("Select re from Result re where re.examNo=?1 and re.resultId=?2")
    public Result getGivenResultByExamId(int examId, int resultId);

    @Modifying
    @Query("Delete from Result re where re.examNo= :examId and re.resultId= :resultId")
    public void deleteGivenResultByExamId(int examId, int resultId);
}
