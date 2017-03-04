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
public class GeneADO implements BasicADO {
    private String conn;

    public GeneADO() {
        String sqlLink="LinkdePruebaDBSql";
        this.conn= new DBConnect(sqlLink).getDbase();
    }

    @Override
    public String delete(Entity enty) {
        GeneClass gene= (GeneClass) enty;
        return "delete gene";
    }

    @Override
    public String insert(Entity enty) {
        GeneClass gene= (GeneClass) enty;
        return "insert gene";
    }

    @Override
    public String update(Entity enty) {
        GeneClass gene= (GeneClass) enty;
        return "update gene";
    }
    
    
}
