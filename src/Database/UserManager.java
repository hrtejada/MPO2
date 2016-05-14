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
 * Created by Beto on 5/11/16.
 * This is the controller for managing Users.
 */
public class UserManager {
    protected  String db_name = "jdbc:mysql://earth.cs.utep.edu/cs4311team2sp16";
    protected  String db_username="cs4311team2sp16";
    protected  String db_password="bostt";

    //User queries
    public boolean createUser(User newUser)
    {
        String query = "Insert into User values(";
        String values ="";
        int i = 0;
        LinkedHashMap<String,Object> userParams = newUser.getUserElements();

        System.out.println(userParams.keySet());
        for (String key : userParams.keySet()) {

            if(key.equals("isApproved"))
            {
                values+=userParams.get(key).toString().toUpperCase();
                continue;
            }
            else
            {
                System.out.println(userParams.get("firstName"));
                values+= "\""+userParams.get(key).toString()+"\"";
            }
            if(i < userParams.size()-1)
            {
                values +=",";
                i++;
            }
        }
        query += values+")";
        System.out.println(query);
        return checkAffectedRows(query);
    }

    public boolean deleteUser(String email)
    {
        String query = "Delete from User where Username=\""+email+"\"";
        return checkAffectedRows(query);
    }

    public boolean verifyCredentials(String username, String password)
    {
        String query = "Select Password from User where Username=\""+username+"\"";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String passwordRetrieved = "";
        try {
            conn = DriverManager.getConnection(db_name, db_username, db_password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

            while(rs.next())
            {
                passwordRetrieved = rs.getString("password");
                //System.out.println("password: "+passwordRetrieved);
            }
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(passwordRetrieved.equals(password))
            return true;
        return false;
    }

    public User getUser(String username)
    {
        String query = "Select * from User where Username=\""+username+"\"";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(db_name, db_username, db_password);
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                String firstName = resultSet.getString("firstname");
                String middleInitial = resultSet.getString("middleinitial");
                char middleInitialReal = middleInitial.charAt(0);
                String lastName = resultSet.getString("lastName");
                String organizationName = resultSet.getString("organizationName");
                String departmentName = resultSet.getString("departmentName");
                String positionTitle = resultSet.getString("positionTitle");
                String departmentContactName = resultSet.getString("departmentContactName");
                String workContactName = resultSet.getString("workContactName");
                String email = resultSet.getString("email");
                String usernameAc = resultSet.getString("username");
                String password = resultSet.getString("password");
                String userType = resultSet.getString("userType");
                boolean isApproved = resultSet.getBoolean("isApproved");

                User user = new User(firstName,middleInitialReal,lastName,
                        organizationName, departmentName,positionTitle, departmentContactName,
                        workContactName,email,usernameAc,password,userType,isApproved);

                return user;

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
            if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
        }

        return null;
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
        if(rowsAffected==0)
            return false;
        return true;
    }


}
