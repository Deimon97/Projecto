/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

import model.UserClass;

/**
 *
 * @author projecto
 */
public interface BasicADO {
    
    /**
     * delete the register of object in the database
     * @param enty object for delete in DB
     * @return  message of correct delete or incorrect delete
     */
    public String delete (Entity enty);
    
    /**
     * insert the object in the table
     * @param enty object for insert in db
     * @return 
     */
    public String insert (Entity enty);
    
    
    /**
     * update the register of reference object
     * @param enty object for update in db
     * @return 
     */
    public String update(Entity enty);
    
}
