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
public class ProjectManager extends DBManager {

    //User queries
    public boolean createProject(Project newProject)
    {
        String table = "Project";
        return this.createObject(table, newProject);
    }

    public boolean deleteProject(Long id)
    {
        String table = "Project";
        String condition = "id_Project = "+id;
        return this.deleteObject(table,condition);
    }

    public boolean updateProject(Project project)
    {
        String table = "Project";
        String condition = "id_Project = "+id;
        return this.updateObject(table, condition, project);
    }

    public Project getProject(Long id)
    {
        String query = "Select TOP 1 * from Project where id_Project=\""+id+"\"";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(db_name, db_username, db_password);
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
              String name=resultSet.getString("name");
              String limitFrom=resultSet.getString("limitFrom");
              String limitTo=resultSet.getString("limitTo");
              String scopeofWork=resultSet.getString("scopeofWork");
              String remarks=resultSet.getString("remarks");
              String fundedProjectType=resultSet.getString("fundedProjectType");
              Long federalFiscalYear=resultSet.getInt("federalFiscalYear");
              Long networkYear=resultSet.getInt("networkYear");
              String dotDistrict=resultSet.getString("dotDistrict");
              String county=resultSet.getString("county");
              String city=resultSet.getString("city");
              String area=resultSet.getString("area");
              String stateSystemRoad=resultSet.getString("stateSystemRoad");
              String capacityProject=resultSet.getString("capacityProject");
              Long numberofExistingLanes=resultSet.getInt("numberofExistingLanes");
              Long numberofProjectedLanes=resultSet.getInt("numberofProjectedLanes");
              Long numberofMiles=resultSet.getInt("numberofMiles");
              String highwayName=resultSet.getString("highwayName");
              String projectType=resultSet.getString("projectType");
              String transitInformation=resultSet.getString("transitInformation");
              String airVOCAnalysisVOC=resultSet.getString("airVOCAnalysisVOC");
              String airVOCAnalysisNOC=resultSet.getString("airVOCAnalysisNOC");
              String airVOCAnalysisCO=resultSet.getString("airVOCAnalysisCO");

              Project newProject = new Project(name,
                                              limitFrom,
                                              limitTo,
                                              scopeofWork,
                                              remarks,
                                              fundedProjectType,
                                              federalFiscalYear,
                                              networkYear,
                                              dotDistrict,
                                              county,
                                              city,
                                              area,
                                              stateSystemRoad,
                                              capacityProject,
                                              numberofExistingLanes,
                                              numberofProjectedLanes,
                                              numberofMiles,
                                              highwayName,
                                              projectType,
                                              transitInformation,
                                              airVOCAnalysisVOC,
                                              airVOCAnalysisNOC,
                                              airVOCAnalysisCO
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
