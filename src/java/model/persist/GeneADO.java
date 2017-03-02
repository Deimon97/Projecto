/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

import model.GeneClass;

/**
 *
 * @author projecto
 */
public class GeneADO {
    private String conn;

    public GeneADO() {
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
    public String insert (GeneClass gene){
        return "inserting the user:"+gene.toString();
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    public String update(GeneClass gene){
        return "update the user:"+gene.toString();
    }
}
