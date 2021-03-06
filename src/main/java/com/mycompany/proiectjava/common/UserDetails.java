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
public class UserDetails implements java.io.Serializable {

    private Integer id;

    private String username;

    private String email;

    private String password;

    private String position;

    public UserDetails(Integer id, String username, String email, String password, String position) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
