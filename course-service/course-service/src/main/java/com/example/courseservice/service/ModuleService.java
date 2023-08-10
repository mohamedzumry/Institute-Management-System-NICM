/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.courseservice.service;

import com.example.courseservice.entity.Module;
import com.example.courseservice.repository.ModuleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanug
 */
@Service
public class ModuleService {
    
    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }

    public List<Module> getALLModulesByCourseId(int courseId) {
        return moduleRepository.getALLModulesByCourseId(courseId);
    }

    public Module getModuleById(int moduleId) {
        Optional<Module> result= moduleRepository.findById(moduleId);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    
    public List<Module> getAllModulesByUserId(int userId) {
        return moduleRepository.getAllModulesByUserId(userId);
    }
    
    public List<Module> getModulesByName(String moduleName){
        return moduleRepository.getModulesByName(moduleName);
    }
    
    public Module createModule(Module moduleData){
        return moduleRepository.save(moduleData);
    }
    
    public Module updateModule(Module moduleData){
        return moduleRepository.save(moduleData);
    }
    
    public void deleteModuleById(int moduleId){
        moduleRepository.deleteById(moduleId);
    }

//    public Module createModuleByCourseId(int courseId, Module module) {
//        module.setCourseNo(courseId);
//        return moduleRepository.save(module);
//    }

//    public void deleteGivenModuleByCourseId(int courseId, int moduleId) {
//        moduleRepository.deleteGivenModuleByCourseId(courseId, moduleId);
//    }
//
//    public Module updateGivenModuleByCourseId(int courseId, int moduleId, Module module) {
//        Optional<Module> myOption = moduleRepository.findById(moduleId);
//        if (myOption.isPresent()) {
//            Module previousModule = myOption.get();
//            if (module.getModuleName() != null) {
//                previousModule.setModuleName(module.getModuleName());
//            }
//            if (module.getModuleDes() != null) {
//                previousModule.setModuleDes(module.getModuleDes());
//            }
//            return moduleRepository.save(previousModule);
//        } else {
//            return null;
//        }
//    }
}
