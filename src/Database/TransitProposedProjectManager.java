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
 * This is the controller for managing Projects.
 */
public class TransitProposedProjectManager extends DBManager {

    //User queries
    public boolean createProject(TransitProposedProject newProject)
    {
        String table = "Transit_Proposed_Project";
        return this.createObject(table, newProject);
    }

    public boolean deleteProject(Long id)
    {
        String table = "Transit_Proposed_Project";
        String condition = "id_Proposed_Project = "+id;
        return this.deleteObject(table,condition);
    }

    public boolean updateProject(TransitProposedProject project, Long id)
    {
        String table = "Transit_Proposed_Project";
        String condition = "id_Proposed_Project = "+id;
        return this.updateObject(table, condition, project);
    }

    public TransitProposedProject getProject(Long id)
    {
        String query = "Select TOP 1 * from Transit_Proposed_Project where id_TPP=\""+id+"\"";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(db_name, db_username, db_password);
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
              Long idTPP=resultSet.getInt("id_TPP");
              Long appointmentYear=resultSet.getInt("Appointment_Year");
              String tcdAmountRequested=resultSet.getString("TCD_Amount_Requested");
              String transitProjectType=resultSet.getString("Transit_Project_Type");

              TransitProposedProject newProject = new TransitProposedProject(submissionType,
                                      appointmentYear,
                                      tdcAmountRequested,
                                      transitProjectType
                                              );

                return newProject;
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

}
