/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

import model.*;

/**
 *
 * @author projecto
 */
public class UserADO {
    
    private String conn;

    public UserADO() {
        String sqlLink="LinkdePruebaDBSql";
        this.conn= new DBConnect(sqlLink).getDbase();
    }
    
    
    
    /**
     * delete the user in the database
     * @param id
     * @return 
     */
    public String delete (int id){
        
        return "delete the register for id:"+id;
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    public String insert (UserClass user){
        return "inserting the user:"+user.toString();
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    public String update(UserClass user){
        return "update the user:"+user.toString();
    }
}
