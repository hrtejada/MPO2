<%--
  Created by IntelliJ IDEA.
  User: Beto
  Date: 5/11/16
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import ="Models.User" %>
<%
    String firstName = request.getParameter("firstname");
    String middleName = request.getParameter("middleinitial");
    String lastName = request.getParameter("lastname");
    String organization = request.getParameter("organization");
    String department = request.getParameter("depName");
    String deptContactName = request.getParameter("depContactName");
    String posTitle = request.getParameter("position");
    String deptNum = request.getParameter("depContactNum");
    String workNumber = request.getParameter("workContactNum");
    String email = request.getParameter("Email");
    String username = request.getParameter("Username");
    String password = request.getParameter("Password");

    char middleInitial = middleName.charAt(0);

    Boolean success = createUser(firstName, middleInitial, lastName, organization, department, posTitle, deptContactName, workNumber,
            email, username, password, "", false);

    if (success) {
        response.sendRedirect("registrationSuccessful.jsp");
    } else {
        response.sendRedirect("loginError.jsp");
    }
%>
