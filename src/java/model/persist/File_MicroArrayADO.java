/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

import model.File_MicroArray;

/**
 *
 * @author projecto
 */
public class File_MicroArrayADO {
   private String conn;

    public File_MicroArrayADO() {
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
    public String insert (File_MicroArray file){
        return "inserting the user:"+file.toString();
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    public String update(File_MicroArray file){
        return "update the user:"+file.toString();
    } 
}
