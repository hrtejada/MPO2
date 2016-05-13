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
public class ProposedProjectManager extends DBManager {

    //User queries
    public boolean createProject(ProposedProject newProject)
    {
        String table = "Proposed_Project";
        return this.createObject(table, newProject);
    }

    public boolean deleteProject(Long id)
    {
        String table = "Proposed_Project";
        String condition = "id_Proposed_Project = "+id;
        return this.deleteObject(table,condition);
    }

    public boolean updateProject(ProposedProject project, Long id)
    {
        String table = "Proposed_Project";
        String condition = "id_Proposed_Project = "+id;
        return this.updateObject(table, condition, project);
    }

    public ProposedProject getProject(Long id)
    {
        String query = "Select TOP 1 * from Proposed_Project where id_Proposed_Project=\""+id+"\"";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(db_name, db_username, db_password);
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
              Long idProposedProject=resultSet.getInt("id_Proposed_Project",idProposedProject);
              Long submissionType=resultSet.getInt("Submission_Type",submissionType);
              String workflowStatus=resultSet.getString("Workflow_Status",workflowStatus);
              String submissionStatus=resultSet.getString("Submission_Status",submissionStatus);
              String creationDate=resultSet.getString("Creation_Date",creationDate);
              String amendmentDate=resultSet.getString("Amendment_Date",amendmentDate);
              String projectReadinessElements=resultSet.getString("Project_Readiness_elements",projectReadinesselements);
              String projectSelectionInformation=resultSet.getString("Project_Selection_Information",projectSelectionInformation);
              String tbpApproval=resultSet.getString("TBP_Approval",tbpApproval);
              String stateApproval=resultSet.getString("State_Approval",stateApproval);
              String federalApproval=resultSet.getString("Federal_Approval",federalApproval);

              ProposedProject newProject = new ProposedProject(submissionType,
                                              workflowStatus,
                                              submissionStatus,
                                              creationDate,
                                              amendmentDate,
                                              projectReadinessElements,
                                              projectSelectionInformation,
                                              tbpApproval,
                                              stateApproval,
                                              federalApproval
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
