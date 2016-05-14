<%--
  Created by IntelliJ IDEA.
  User: Beto
  Date: 5/11/16
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
  Test.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

<jsp:include page="../partials/header.jsp" />

    <body>

    <div class="container-fluid">

    <%= new java.util.Date() %>

    <div class="container">

    <div class="panel-heading form-group" align="center">
        <h2>Register as a new MPO User </h2>
    </div>

    <form action="../UserController" class="form-group" method="post" novalidate="novalidate">
        <div class ="form-group">

            <div class="form-group">
                <input
                        type="text" class="form-control" name="firstName" id="firstname"
                        placeholder="First Name:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="middleinitial" id="middleinitial"
                        placeholder="Middle Name:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="lastname" id="lastname"
                        placeholder="Last Name:" required="required">

            </div>

            <div class="form-group">
                <select name="organization">
                    <option value="startAgency">Start Agency</option>
                    <option value="sponAgency">Sponsoring Agency</option>
                    <option value="localAgency">Local Agency</option>
                </select>
            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="depName" id="depName"
                        placeholder="Department Name:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="depContactName" id="depContactName"
                        placeholder="Department Contact Name:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="position" id="position"
                        placeholder="Position Title:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="depContactNum" id="depContactNum"
                        placeholder="Department Contact Number:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="workContactNum" id="workContactNum"
                        placeholder="Work Contact Number:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="Email" id="Email"
                        placeholder="Email:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="text" class="form-control" name="Username" id="Username"
                        placeholder="Username:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="password" class="form-control" name="Password" id="Password"
                        placeholder="Password:" required="required">

            </div>

            <div class="form-group">
                <input
                        type="password" class="form-control" name="rePassword" id="rePassword"
                        placeholder="Re-enter Password:" required="required">

            </div>

            <button type="submit" class="btn"> Register </button>

        </div>

    </form>

    </div>

    </div>


    <jsp:include page="../partials/footer.jsp" />
