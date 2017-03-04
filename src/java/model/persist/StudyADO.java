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
public class StudyADO implements BasicADO {
    private String conn;
    
    public StudyADO() {
        String sqlLink="LinkdePruebaDBSql";
        this.conn= new DBConnect(sqlLink).getDbase();
    }

    @Override
    public String delete(Entity enty) {
        StudyClass study= (StudyClass) enty;
        return "delete study";
    }

    @Override
    public String insert(Entity enty) {
        StudyClass study= (StudyClass) enty;
        return "insert study";
    }

    @Override
    public String update(Entity enty) {
        StudyClass study= (StudyClass) enty;
        return "update study";
    }
    
    
    
    
}
