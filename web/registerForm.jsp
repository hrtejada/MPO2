<%--
  Created by IntelliJ IDEA.
  User: Beto
  Date: 5/11/16
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<%= new java.util.Date() %>

<form>
    First Name:<br>
    <input type="text" name="firstname" maxlength="100"><br>

    Middle initial:<br>
    <input type="text" name="middleinitail" maxlength="45"><br>

    Last name:<br>
    <input type="text" name="lastname" maxlength="100"> <br>

    Organization Name:<br>
    <select>
        <option value="startAgency">Start Agency</option>
        <option value="sponAgency">Sponsoring Agency</option>
        <option value="localAgency">Local Agency</option>
    </select>
    <br>

    Department Name:<br>
    <input type="text" name="depName" maxlength="45">
    <br>

    Position Title:<br>
    <input type="text" name="position" maxlength="45">
    <br>

    Department Contract number:<br>
    <input type="text" name="depContactNum" maxlength="45">
    <br>

    Work Contract Number:<br>
    <input type="text" name="workContactNum" maxlength="45">
    <br>

    Email:<br>
    <input type="text" name="Email" maxlength="100">
    <br>

    User Name:<br>
    <input type="text" name="Username" maxlength="45">
    <br>

    Password:<br>
    <input type="text" name="Password" maxlength="45">
    <br>

    Re-enter Password:<br>
    <input type="text" name="rePassword" maxlength="45">
    <br>
    <br>
    <button type="button"> Register </button>

</form>
</body>

</html>
