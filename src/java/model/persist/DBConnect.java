/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

/**
 *
 * @author projecto
 */
public class DBConnect {

    private String Dbase;

    DBConnect(String sqlLink) {
        this.Dbase=sqlLink;
    }

    public String getDbase() {
        return Dbase;
    }

    public void setDbase(String Dbase) {
        this.Dbase = Dbase;
    }
    
    

    
    
}
