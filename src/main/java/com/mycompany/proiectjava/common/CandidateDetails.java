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
public class CandidateDetails implements java.io.Serializable{
    
    private Integer id;
    
    private String name;
    
    private String surname;
    
    private Integer phone;
    
    private String email;
    
    private String birthday;
    
    private String sex;
    
    private String nationality;
    
    private String applied_job;
    
    private String career_level;
    
    private String study_level;
    
    private String native_language;
    
    private String foreign_languages;

    public CandidateDetails(Integer id, String name, String surname, Integer phone, String email, String birthday, String sex, String nationality, String applied_job, String career_level, String study_level, String native_language, String foreign_languages) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.nationality = nationality;
        this.applied_job = applied_job;
        this.career_level = career_level;
        this.study_level = study_level;
        this.native_language = native_language;
        this.foreign_languages = foreign_languages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getApplied_job() {
        return applied_job;
    }

    public void setApplied_job(String applied_job) {
        this.applied_job = applied_job;
    }

    public String getCareer_level() {
        return career_level;
    }

    public void setCareer_level(String career_level) {
        this.career_level = career_level;
    }

    public String getStudy_level() {
        return study_level;
    }

    public void setStudy_level(String study_level) {
        this.study_level = study_level;
    }

    public String getNative_language() {
        return native_language;
    }

    public void setNative_language(String native_language) {
        this.native_language = native_language;
    }

    public String getForeign_languages() {
        return foreign_languages;
    }

    public void setForeign_languages(String foreign_languages) {
        this.foreign_languages = foreign_languages;
    }
    
    
}
