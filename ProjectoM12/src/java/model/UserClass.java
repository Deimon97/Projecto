/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 * Josep 
 * @author projecto
 */
public class UserClass {
    
    private int id;
    private String nick;
    private String password;
    private String email;
    private int role;

    public UserClass() {
    }
    
    public UserClass(int id, String nick, String password, String email, int role) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    
    
    
    
    
}
