/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

import model.GeneClass;
import model.StudyClass;

/**
 *
 * @author projecto
 */
public class StudyADO {
    private String conn;
    
    public StudyADO() {
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
    public String insert (StudyClass study){
        return "inserting the user:"+study.toString();
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    public String update(StudyClass study){
        return "update the user:"+study.toString();
    }
}
