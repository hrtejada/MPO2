package Models;
import Database.TransitProposedProjectManager;
import java.util.LinkedHashMap;
/**
 * Created by Beto on 5/11/16.
 */

public class TransitProposedProject extends MPOObject {

        public TransitProposedProject (Long appointmentYear,
                                Long tdcAmountRequested,
                                String transitProjectType)
        {
          this.elements.put("Appointment_Year",appointmentYear);
          this.elements.put("TDC_Amount_Requested",tdcAmountRequested);
          this.elements.put("Transit_Project_Type",transitProjectType);
        }

        public boolean createProject(Long appointmentYear,
                                Long tdcAmountRequested,
                                String transitProjectType)
        {

            TransitProposedProject newProject = new TransitProposedProject(
                                appointmentYear,
                                tdcAmountRequested,
                                transitProjectType
                                            );

            TransitProposedProjectManager db = new TransitProposedProjectManager();
            return db.createProject(newProject);
        }

        public boolean updateProject(Long id,
                                Long tdcAmountRequested,
                                String transitProjectType
                                     )
        {

            TransitProposedProject newProject = new TransitProposedProject(
                                ppointmentYear,
                                tdcAmountRequested,
                                transitProjectType
                                            );

            TransitProposedProjectManager db = new TransitProposedProjectManager();
            return db.updateProject(newProject, id);
        }

        public boolean deleteProject(Long id) {
            TransitProposedProjectManager db = new TransitProposedProjectManager();
            return db.deleteProject(id);
        }



}
