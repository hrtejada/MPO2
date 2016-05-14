<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
<form method="post">

<table border="2">
<tr>
<td>TYPE</td>
<td>NAME</td>
<td>LIMIT TO</td>
<td>LIMIT FROM</td>
<td>SCOPE OF WORK</td>
<td>FISCAL YEAR</td>
<td>NETWORK YEAR</td>
<td>COUNTY</td>
<td>CITY</td>
<td>AREA</td>
</tr>
    <%@ page import="java.sql.*" %>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://earth.cs.utep.edu/cs4311team2sp16";
String username="cs4311team2sp16";
String password="bostt";
String query="select * from Project";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
    <tr>
        <td><%=rs.getString("Project_Type") %></td>
        <td><%=rs.getString("Project_Name") %></td>
        <td><%=rs.getString("Limit_From") %></td>
        <td><%=rs.getString("Limit_To") %></td>
        <td><%=rs.getString("Scope_of_Work") %></td>
        <td><%=rs.getInt("Federal_Fiscal_Year") %></td>
        <td><%=rs.getInt("Network_Year") %></td>
	<td><%=rs.getString("County") %></td>
	<td><%=rs.getString("City") %></td>
	<td><%=rs.getString("Area") %></td>

    </tr>
        <%

}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }




%>

</form>
</html> 