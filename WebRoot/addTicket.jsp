<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Add Ticket</title>
</head>
<body>
<center>
	<h2>Add Ticket</h2>
	<s:actionerror/>
	<s:form action="addTicket">
		<s:textfield label="Type" name="type"></s:textfield>
		<s:password label="Description" name="description"></s:password>
		<s:textfield label="Location" name="location"></s:textfield>
		<s:textfield name="Date" label="Format (MM/DD/YEAR)" ></s:textfield>
		<s:textfield label="Type" name="type"></s:textfield>
		<s:textfield label="Student ID" name="studentId"></s:textfield>
		<s:textfield label="Status" name="status"></s:textfield>
		<s:submit value="Submit"></s:submit>
		<s:reset value="Reset"></s:reset>
	</s:form>	
</center>
</body>
</html>