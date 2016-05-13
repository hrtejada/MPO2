package Models;
import Database.ProposedProjectManager;
import java.util.LinkedHashMap;
/**
 * Created by Beto on 5/11/16.
 */

public class ProposedProject extends MPOObject {

        public ProposedProject (Long submissionType,
                        String workflowStatus,
                        String submissionStatus,
                        Timestamp creationDate,
                        Timestamp amendmentDate,
                        String projectReadinessElements,
                        String projectSelectionInformation,
                        String tbpApproval,
                        String stateApproval,
                        String federalApproval)
        {
          this.elements.put("Submission_Type",submissionType);
          this.elements.put("Workflow_Status",workflowStatus);
          this.elements.put("Submission_Status",submissionStatus);
          this.elements.put("Creation_Date",creationDate);
          this.elements.put("Amendment_Date",amendmentDate);
          this.elements.put("Project_Readiness_elements",projectReadinesselements);
          this.elements.put("Project_Selection_Information",projectSelectionInformation);
          this.elements.put("TBP_Approval",tbpApproval);
          this.elements.put("State_Approval",stateApproval);
          this.elements.put("Federal_Approval",federalApproval);
        }

        public boolean createProject(Long submissionType,
                        String workflowStatus,
                        String submissionStatus,
                        Timestamp creationDate,
                        Timestamp amendmentDate,
                        String projectReadinessElements,
                        String projectSelectionInformation,
                        String tbpApproval,
                        String stateApproval,
                        String federalApproval)
        {

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

            ProposedProjectManager db = new ProposedProjectManager();
            return db.createProject(newProject);
        }

        public boolean createProject(Long submissionType,
                        String workflowStatus,
                        String submissionStatus,
                        Timestamp creationDate,
                        Timestamp amendmentDate,
                        String projectReadinessElements,
                        String projectSelectionInformation,
                        String tbpApproval,
                        String stateApproval,
                        String federalApproval
                                     )
        {

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

            ProposedProjectManager db = new ProposedProjectManager();
            return db.updateProject(newProject);
        }

        public boolean deleteProject(Long id) {
            ProposedProjectManager db = new ProposedProjectManager();
            return db.deleteProject(id);
        }

        public boolean updateProject() {
            /*Code for Update goes here */
            return false;
        }


}
