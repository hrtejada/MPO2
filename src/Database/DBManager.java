package Database;
import java.sql.Connection;
import Models.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Carolina on 5/12/16.
 * This is the controller for managing Users.
 */
public class DBManager {
    protected  String db_name = "jdbc:mysql://earth.cs.utep.edu/cs4311team2sp16";
    protected  String db_username="cs4311team2sp16";
    protected  String db_password="bostt";


    public boolean createObject(String table, MPOObject mpoObject)
    {
        String query = "Insert into "+ table +" values(NULL,";
        String values ="";
        int i = 0;
        LinkedHashMap<String,Object> objectParams = mpoObject.getElements();
        for (String key : objectParams.keySet()) {
                values+= "\""+objectParams.get(key).toString()+"\"";

            if(i < objectParams.size()-1)
            {
                values +=",";
                i++;
            }
        }
        query += values+")";
        System.out.println(query);
        return this.checkAffectedRows(query);
    }

    public boolean updateObject(String table, String condition, MPOObject mpoObject)
    {
        String query = "update "+ table +" set ";
        String values ="";
        int i = 0;
        LinkedHashMap<String,Object> objectParams = mpoObject.getElements();
        for (String key : objectParams.keySet()) {
                values+= key + "=" +objectParams.get(key).toString()+"\"";

            if(i < objectParams.size()-1)
            {
                values +=",";
                i++;
            }
        }
        query += values+";";
        System.out.println(query);
        return this.checkAffectedRows(query);
    }

    public boolean deleteObject(String table, String condition)
    {
        String query = "Delete from "+table+" where " + condition;
        return this.checkAffectedRows(query);
    }

    private boolean checkAffectedRows(String query)
    {
        int rowsAffected = -1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(db_name, db_username, db_password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            rowsAffected = pstmt.executeUpdate(query);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(rowsAffected<=0)
            return false;
        return true;
    }


}
