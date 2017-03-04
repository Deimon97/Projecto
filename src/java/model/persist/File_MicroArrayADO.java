/*
 * Ado of conect class File_MicroArray of table file_microarray
 */
package model.persist;

import model.File_MicroArray;

/**
 *
 * @author projecto
 */
public class File_MicroArrayADO implements BasicADO {
   private String conn;

    public File_MicroArrayADO() {
        String sqlLink="LinkdePruebaDBSql";
        this.conn= new DBConnect(sqlLink).getDbase();
    }

    @Override
    public String delete(Entity enty) {
        File_MicroArray file= (File_MicroArray) enty;
        return "delete file";
    }

    @Override
    public String insert(Entity enty) {
        File_MicroArray file= (File_MicroArray) enty;
        return "insert file";
    }

    @Override
    public String update(Entity enty) {
        File_MicroArray file= (File_MicroArray) enty;
        return "insert file";
    }
    
    
    
     
}
