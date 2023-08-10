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
@Table(name = "module_tlb")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mid")
    private int moduleId;

    @Column(name = "mname")
    private String moduleName;

    @Column(name = "description")
    private String moduleDes;

    @Column(name = "cno")
    private int courseNo;
    
    @Column(name = "mauthor_id")
    private int moduleAuthorId;
    
    @Column(name = "mcontent")
    private String moduleContent;

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleDes() {
        return moduleDes;
    }

    public void setModuleDes(String moduleDes) {
        this.moduleDes = moduleDes;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public int getModuleAuthorId() {
        return moduleAuthorId;
    }

    public void setModuleAuthorId(int moduleAuthorId) {
        this.moduleAuthorId = moduleAuthorId;
    }

    public String getModuleContent() {
        return moduleContent;
    }

    public void setModuleContent(String moduleContent) {
        this.moduleContent = moduleContent;
    }

    
    
}
