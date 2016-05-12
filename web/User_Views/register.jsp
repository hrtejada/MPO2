<%--
  Created by IntelliJ IDEA.
  User: Beto
  Date: 5/11/16
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import ="Models.User" %>
<%
    String fname = request.getParameter("firstname");
    String mname = request.getParameter("middleinitial");
    String lname = request.getParameter("lastname");
    String org = request.getParameter("organization");
    String dept = request.getParameter("depName");
    String postitle = request.getParameter("position");
    String deptnum = request.getParameter("depContactNum");
    String worknum = request.getParameter("workContactNum");
    String email = request.getParameter("Email");
    String username = request.getParameter("Username");
    String password = request.getParameter("Password");
    Boolean success = createUser(fname, mname, lname, org, dept, postitle, deptnum, worknum, email, username, password, "", false);
    if (success) {
        response.sendRedirect("registrationSuccessful.jsp");
    } else {
        response.sendRedirect("loginError.jsp");
    }
%>
