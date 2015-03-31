<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Add Ticket</title>
</head>
<body>

	<h2>Add Ticket</h2>
	<s:actionerror/>
	<s:form  action="addTicket">
		<s:select label="Select a priority type" 
		list="#{'Low':'Low', 'Medium':'Medium', 'High':'High'}" 
		name="type" value="Low" />
		<s:password label="Description" name="description"></s:password>
		<s:textfield label="Location" name="location"></s:textfield>
		<s:textfield name="Date" label="Format (MM/DD/YEAR)" ></s:textfield>
		<s:textfield label="Status" name="status"></s:textfield>
		
		<s:submit value="Submit"></s:submit>
		<s:reset value="Reset"></s:reset>
	
	</s:form>	
	<a href="maintenanceOptions.jsp">Back to maintenance</a>

</body>
</html>