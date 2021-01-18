/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proiectjava.common;

/**
 *
 * @author neagoe
 */
public class JobDetails implements java.io.Serializable {

    private Integer id;

    private String job_name;

    private String type;

    private String study_level;

    private String career_level;

    public JobDetails(Integer id, String job_name, String type, String study_level, String career_level) {
        this.id = id;
        this.job_name = job_name;
        this.type = type;
        this.study_level = study_level;
        this.career_level = career_level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStudy_level() {
        return study_level;
    }

    public void setStudy_level(String study_level) {
        this.study_level = study_level;
    }

    public String getCareer_level() {
        return career_level;
    }

    public void setCareer_level(String career_level) {
        this.career_level = career_level;
    }

}
