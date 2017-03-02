/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author projecto
 */
public class UserClass {
    
    private int id;
    private String nick;
    private String special_password;
    private Date date_created;
    private  Date dateActivated;

    public UserClass(int id, String nick, String special_password, Date date_created, Date dateActivated) {
        this.id = id;
        this.nick = nick;
        this.special_password = special_password;
        this.date_created = date_created;
        this.dateActivated = dateActivated;
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

    public String getSpecial_password() {
        return special_password;
    }

    public void setSpecial_password(String special_password) {
        this.special_password = special_password;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDateActivated() {
        return dateActivated;
    }

    public void setDateActivated(Date dateActivated) {
        this.dateActivated = dateActivated;
    }

    @Override
    public String toString() {
        return "UserClass{" + "id=" + id + ", nick=" + nick + ", special_password=" + special_password + ", date_created=" + date_created + ", dateActivated=" + dateActivated + '}';
    }
    
    
    
    
}
