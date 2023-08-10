/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.courseservice.repository;

import com.example.courseservice.entity.Module;
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
public interface ModuleRepository extends JpaRepository<Module, Integer> {

    @Query("Select me from Module me where me.courseNo=?1")
    public List<Module> getALLModulesByCourseId(int courseId);

    @Query("Select m from Module m where m.moduleAuthorId=?1 ")
    public List<Module> getAllModulesByUserId(int userId);
    
    @Query("Select m from Module m where m.moduleName LIKE %?1% ")
    public List<Module> getModulesByName(String moduleName);

    @Query("Select me from Module me where me.courseNo=?1 and me.moduleId=?2")
    public Module getGivenModuleByCourseId(int courseId, int moduleId);

    @Modifying
    @Query("Delete from Module me where me.courseNo= :courseId and me.moduleId= :moduleId")
    public void deleteGivenModuleByCourseId(int courseId, int moduleId);
}
