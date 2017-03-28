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
public class AdminClass extends UserClass {
    
    private int permission;

    public AdminClass(int permission, int id, String nick, String password, String email, int role) {
        super(id, nick, password, email, role);
        this.permission = permission;
    }

    


    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
    
    
    
    
    
}
