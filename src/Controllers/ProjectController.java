package Controllers;
import Models.Project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Carolina on 5/13/16.
 */
@WebServlet("/ProjectController")
public class ProjectController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String projectType = request.getParameter("projectType");
        String mpoIDReSubmission = request.getParameter("mpoIDReSubmission");
        String projectTitle = request.getParameter("projectTitle");
        String projectDescription = request.getParameter("projectDescription");
        String limitFrom = request.getParameter("limitFrom");
        String limitTo = request.getParameter("limitTo");
        String scope = request.getParameter("scope");
        Long fiscalYear = Long.parseLong(request.getParameter("fiscalYear"));
        Long networkYear = Long.parseLong(request.getParameter("networkYear"));
        String county = request.getParameter("county");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String projectCost = request.getParameter("projectCost");
        String sponsor = request.getParameter("sponsor");
        String yoe = request.getParameter("yoe");



        Boolean success = Project.createProject(projectTitle,limitFrom,limitTo,
                scope,"",projectType,fiscalYear,networkYear,"DotDistrict",county,city,area,
                "StateSystemRead","CapacityProject",(long)4,(long)8,(long)1000,"I-20","projectType","","","","");

        if (success) {
            System.out.println("Project form went through");
            response.sendRedirect("Project/SuccessCreation.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
