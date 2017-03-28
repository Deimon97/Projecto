/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.persist;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import model.GeneClass;

/**
 *
 * @author projecto
 */
public class GeneADO implements BasicADO {
    private Properties queries;
    private static String PROPS_FILE;
    private static DataBase dataSource;

    
    //Constructors
    public GeneADO(String path) throws IOException, ClassNotFoundException {
        queries = new Properties();
        PROPS_FILE = path+"/files/user_queries.properties";
        queries.load(new FileInputStream(PROPS_FILE));
        dataSource = DataBase.getInstance(path);
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
