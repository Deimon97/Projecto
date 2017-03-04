/*
 * ADO for the table user reference clas UserCLass
 */
package model.persist;

import model.*;

/**
 *
 * @author Kevin Casanova 
 */
public class UserADO implements BasicADO {
    
    private String conn;

    public UserADO() {
        String sqlLink="LinkdePruebaDBSql";
        this.conn= new DBConnect(sqlLink).getDbase();
    }

    @Override
    public String delete(Entity enty) {
        UserClass user= (UserClass) enty;
        return "delete USer";
    }

    @Override
    public String insert(Entity enty) {
        UserClass user= (UserClass) enty;
        return "insert USer";
    }

    @Override
    public String update(Entity enty) {
        UserClass user= (UserClass) enty;
        return "update USer";
    }
    
    
    
    
}
