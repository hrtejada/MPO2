<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../partials/header.jsp" />
<body>
<form>
	<h1>Project Creation</h1>
	<p>What kind of project would you be creating?</p>

	<input type="radio" name="projectType" value="newSubmission" checked>New Submission<br>
	<input type="radio" name="projectType" value="newSubmissionBasedOnPrevious">New Submission Based on a Previous Submission<br>
	<input type="text" name="mpoIDNewSubmission" placeholder="MPO ID or CSJ #"><br>
  	<input type="radio" name="projectType" value="reSubmission">Resubmission<br>
	<input type="text" name="mpoIDReSubmission" placeholder="MPO ID or CSJ #"><br><br>

	<h1>General Information</h1>
	
	<input type="text" name="projectTitle" placeholder="Project Title"><br>
	<input type="text" name="projectDescription" placeholder="Project Description"><br>
	<input type="text" name="limitFrom" placeholder="Limit From"><br>
	<input type="text" name="limitTo" placeholder="Limit To"><br>
	<input type="text" name="scope" placeholder="Scope of Work"><br>
	<input type="text" name="fiscalYear" placeholder="Fiscal Year"><br>
	<input type="text" name="networkYear" placeholder="Network Year"><br><br>

	<input type="text" name="county" placeholder="County"><br>
	<input type="text" name="city" placeholder="City"><br>
	<input type="text" name="area" placeholder="Area"><br><br>
	
	<input type="text" name="projectCost" placeholder="Total Project Cost"><br>
	<input type="text" name="sponsor" placeholder="Sponsor"><br>
	<input type="text" name="yoe" placeholder="Year of Expenditure"><br>
</form>

<jsp:include page="../partials/header.jsp" />