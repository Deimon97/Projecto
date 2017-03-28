/*
 * Ado of conect class File_MicroArray of table file_microarray
 */
package model.persist;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import model.File_MicroArray;

/**
 *
 * @author projecto
 */
public class File_MicroArrayADO implements BasicADO {
   private Properties queries;
    private static String PROPS_FILE;
    private static DataBase dataSource;

    
    //Constructors
    public File_MicroArrayADO(String path) throws IOException, ClassNotFoundException {
        queries = new Properties();
        PROPS_FILE = path+"/files/user_queries.properties";
        queries.load(new FileInputStream(PROPS_FILE));
        dataSource = DataBase.getInstance(path);
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
