package Models;
import Database.ProjectManager;
import java.util.LinkedHashMap;
/**
 * Created by Beto on 5/11/16.
 */

public class Project extends MPOObject {

        LinkedHashMap <String, Object> elements = new LinkedHashMap <String, Object>();
        public Project (String name,
                     String limitFrom,
                     String limitTo,
                     String scopeofWork,
                     String remarks,
                     String fundedProjectType,
                     Long federalFiscalYear,
                     Long networkYear,
                     String dotDistrict,
                     String county,
                     String city,
                     String area,
                     String stateSystemRoad,
                     String capacityProject,
                     Long numberofExistingLanes,
                     Long numberofProjectedLanes,
                     Long numberofMiles,
                     String highwayName,
                     String projectType,
                     String transitInformation,
                     String airVOCAnalysisVOC,
                     String airVOCAnalysisNOC,
                     String airVOCAnalysisCO)
        {
            this.elements.put("Project_Name",name);
            this.elements.put("Limit_From ",limitFrom);
            this.elements.put("Limit_To",limitTo);
            this.elements.put("Scope_of_Work",scopeofWork);
            this.elements.put("Remarks",remarks);
            this.elements.put("Funded_Project_Type",fundedProjectType);
            this.elements.put("Federal_Fiscal_Year",federalFiscalYear);
            this.elements.put("Network_Year",networkYear);
            this.elements.put("DOT_District",dotDistrict);
            this.elements.put("County",county);
            this.elements.put("City",city);
            this.elements.put("Area",area);
            this.elements.put("State_System_Road",stateSystemRoad);
            this.elements.put("Capacity_Project",capacityProject);
            this.elements.put("Number_of_Existing_Lanes",numberofExistingLanes);
            this.elements.put("Number_of_Projected_Lanes",numberofProjectedLanes);
            this.elements.put("Number_of_Miles",numberofMiles   );
            this.elements.put("Highway_Name",highwayName);
            this.elements.put("Project_Type",projectType);
            this.elements.put("Transit_Information",transitInformation);
            this.elements.put("Air_VOC_Analysis_VOC",airVOCAnalysisVOC);
            this.elements.put("Air_VOC_Analysis_NOC",airVOCAnalysisNOC);
            this.elements.put("Air_VOC_Analysis_CO",airVOCAnalysisCO);
        }

        public boolean createProject(String name,
                                     String limitFrom,
                                     String limitTo,
                                     String scopeofWork,
                                     String remarks,
                                     String fundedProjectType,
                                     Long federalFiscalYear,
                                     Long networkYear,
                                     String dotDistrict,
                                     String county,
                                     String city,
                                     String area,
                                     String stateSystemRoad,
                                     String capacityProject,
                                     Long numberofExistingLanes,
                                     Long numberofProjectedLanes,
                                     Long numberofMiles,
                                     String highwayName,
                                     String projectType,
                                     String transitInformation,
                                     String airVOCAnalysisVOC,
                                     String airVOCAnalysisNOC,
                                     String airVOCAnalysisCO
                                     )
        {

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

            ProjectManager db = new ProjectManager();
            return db.createProject(newProject);
        }

        public boolean updateProject(Long id,
                                     String name,
                                     String limitFrom,
                                     String limitTo,
                                     String scopeofWork,
                                     String remarks,
                                     String fundedProjectType,
                                     Long federalFiscalYear,
                                     Long networkYear,
                                     String dotDistrict,
                                     String county,
                                     String city,
                                     String area,
                                     String stateSystemRoad,
                                     String capacityProject,
                                     Long numberofExistingLanes,
                                     Long numberofProjectedLanes,
                                     Long numberofMiles,
                                     String highwayName,
                                     String projectType,
                                     String transitInformation,
                                     String airVOCAnalysisVOC,
                                     String airVOCAnalysisNOC,
                                     String airVOCAnalysisCO
                                     )
        {

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

            ProjectManager db = new ProjectManager();
            return db.updateProject(newProject, id);
        }

        public boolean deleteProject(Long id) {
            ProjectManager db = new ProjectManager();
            return db.deleteProject(id);
        }

}
