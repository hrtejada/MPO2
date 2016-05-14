package Controllers;
import Models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Beto on 5/13/16.
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleinitial");
        String lastName = request.getParameter("lastname");
        String organization = request.getParameter("organization");
        String department = request.getParameter("depName");
        String deptContactName = request.getParameter("depContactName");
        String posTitle = request.getParameter("position");
        //String deptNum = request.getParameter("depContactNum");
        String workNumber = request.getParameter("workContactNum");
        String email = request.getParameter("Email");
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");

        char middleInitial = middleName.charAt(0);


        User newUser = new User(firstName, middleInitial, lastName, organization, department, posTitle, deptContactName, workNumber,
                email, username, password, "", true);

        Boolean success = newUser.createUser(newUser);

        if (success) {
            System.out.println("Register form went through");
            response.sendRedirect("Join/SuccessReg.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
