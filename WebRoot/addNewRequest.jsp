<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Add New Request</title>
</head>
<body>
	<center>
		<h2>Add New Request</h2>
		<s:actionerror />
		<s:form action="addRequest">

			<s:select label="Select Your First Preferences"
				list="#{'Specific Hall':'Specific Hall', 'Apartment':'Apartment', 'Resident Hall':'Resident Hall'}"
				name="preference1" value="Specific Hall" />

			<s:select label="Select Your Second Preferences"
				list="#{'Specific Hall':'Specific Hall', 'Apartment':'Apartment', 'Resident Hall':'Resident Hall'}"
				name="preference2" value="Specific Hall" />

			<s:select label="Select Your Third Preferences"
				list="#{'Specific Hall':'Specific Hall', 'Apartment':'Apartment', 'Resident Hall':'Resident Hall'}"
				name="preference3" value="Specific Hall" />

			<s:select label="Payment Method"
				list="#{'Monthly':'Monthly', 'Semester':'Once per Semester'}"
				name="paymentMethod" value="Monthly" ></s:select>

			<s:textfield name="startDate"
				label="Start Date (Format (MM/DD/YEAR))"></s:textfield>
			<s:textfield name="endDate" label="Start Date (Format (MM/DD/YEAR))"></s:textfield>

			<s:submit value="Submit"></s:submit>
			<s:reset value="Reset"></s:reset>

		</s:form>
		<a href="requestOptions.jsp">Back to Request</a>
	</center>
</body>
</html>