/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examservice.repository;

import com.example.examservice.entity.Exam;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanug
 */
@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {
    
    @Query("Select e from Exam e where e.examModule LIKE %?1% ")
    public List<Exam> getExamsByName(String examModule);

}
