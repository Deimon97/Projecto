/*
 * ADO for the table user reference clas UserCLass
 */
package model.persist;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.logging.Level;
import model.*;

/**
 *
 * @author Kevin Casanova 
 */
public class UserADO implements BasicADO {
    
    private Properties queries;
    private static String PROPS_FILE;
    private static DataBase dataSource;

    
    //Constructors
    public UserADO(String path) throws IOException, ClassNotFoundException {
        queries = new Properties();
        PROPS_FILE = path+"/files/user_queries.properties";
        queries.load(new FileInputStream(PROPS_FILE));
        dataSource = DataBase.getInstance(path);
    }
    
    /**
     * 
     * @param queryName
     * @return 
     */
    public String getQuery(String queryName) {
        return queries.getProperty(queryName);
    }
    
   /*
    @Override
    public Entity fromResultSet(ResultSet res) {
        String username;
        String password;
        Entity c=null;
        try {
            username = res.getString("username");
            password = res.getString("password");
            c = (Entity) new UserClass(username, password);
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);
  
        }
        return c;
    }
    */

    /*
    public Collection<Entity> fromResultSetList(ResultSet result) {
        Collection<Entity> list = new ArrayList<>();
        try {
            while (result.next()) {
                Entity entity = fromResultSet(result);
                if (entity != null) list.add(entity);
            }
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);
        }
        return list;
    }
    */ 
    
    
    public int findOne(Object entity) {
        UserClass user = (UserClass) entity;
        int count=0;
        
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement st = conn.prepareStatement(getQuery("FIND"));
            st.setString(1, user.getNick());
            st.setString(2, user.getPassword());
            ResultSet res = st.executeQuery();
            while (res.next()) {   
             count++;
            }
                       
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);    
        }    
        return count;
    }
    
    public int find(Object entity) {
        UserClass user = (UserClass) entity;
        int count=0;
        
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement st = conn.prepareStatement(getQuery("FINDMore"));
            st.setString(1, user.getNick());
            st.setString(2, user.getPassword());
            ResultSet res = st.executeQuery();
            UserClass use=new UserClass();
            while (res.next()) {   
                use.setId(res.getInt("id"));
                use.setNick(res.getString("nick"));
                use.setPassword(res.getString("password"));
                use.setEmail(res.getString("email"));
                use.setRole(res.getInt("role"));
             count++;
            }
                       
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);    
        }    
        return count;
    }

    @Override
    public String delete(Entity enty) {
        UserClass user = (UserClass) enty;
        int count=0;
        String result="Error";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement st = conn.prepareStatement(getQuery("DELETEUSER"));
            st.setString(1, user.getNick());
            int res = st.executeUpdate();          
            return result=res+"rows deleted";
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);
            return result;
        }    
    }

    @Override
    public String insert(Entity enty) {
        UserClass user = (UserClass) enty;
        int count=0;
        String result="Error insert";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement st = conn.prepareStatement(getQuery("INSERT"));
            st.setString(1, user.getNick());
            st.setString(2, user.getPassword());
            st.setString(3, user.getEmail());
            st.setInt(4, user.getRole());
            int res = st.executeUpdate();          
            return result=res+"rows inserted";
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);
            return result;
        }
    }

    @Override
    public String update(Entity enty) {
        UserClass user = (UserClass) enty;
        int count=0;
        String result="Error insert";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement st = conn.prepareStatement(getQuery("UPDATE"));
            st.setString(1, user.getPassword());
            st.setInt(2, user.getId());
            int res = st.executeUpdate();          
            return result=res+"rows update";
        } catch (SQLException ex) {
            dataSource.getLogger().log(Level.SEVERE, null, ex);
            return result;
        }
    }
    
    
    
    
}
