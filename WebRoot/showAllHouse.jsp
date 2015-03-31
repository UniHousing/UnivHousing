<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>House Vacancy List</title>
</head>
<body>
	<center>
		<h2>House List</h2>
		<h3>General Apartments</h3>
		<table border="1">
			<tr>
				<td>id</td>
				<td>Apt Name</td>
				<td>Address</td>
				<td>Telephone</td>
				<td>Total Rooms</td>
				<td>Total Bathrooms </td>

			</tr>
			<s:iterator value="#request.general" id="apt">
				<tr>
					<td><s:property value="#apt.id" /></a></td>
					<td><s:property value="#apt.name" /></td>
					<td><s:property value="#apt.addr" /></td>
					<td><s:property value="#apt.tel" /></td>
					<td><s:property value="#apt.roomCount" /></td>
					<td><s:property value="#apt.bathCount" /></td>
				</tr>
			</s:iterator>
		</table>
		<h3>Family Apartments</h3>
		<table border="1">
			<tr>
				<td>id</td>
				<td>Apt Name</td>
				<td>Address</td>
				<td>Telephone</td>
				<td>Total Rooms</td>
				<td>Total Bathrooms </td>
				<td>Monthly Rate</td>

			</tr>
			<s:iterator value="#request.family" id="apt">
				<tr>
					<td><s:property value="#apt.id" /></a></td>
					<td><s:property value="#apt.name" /></td>
					<td><s:property value="#apt.addr" /></td>
					<td><s:property value="#apt.tel" /></td>
					<td><s:property value="#apt.roomCount" /></td>
					<td><s:property value="#apt.bathCount" /></td>
					<td><s:property value="#apt.monthRate" /></td>
				</tr>
			</s:iterator>
		</table>
				<h3>Residence Hall</h3>
		<table border="1">
			<tr>
				<td>id</td>
				<td>Hall Name</td>
				<td>Address</td>
				<td>Telephone</td>


			</tr>
			<s:iterator value="#request.family" id="apt">
				<tr>
					<td><s:property value="#apt.id" /></a></td>
					<td><s:property value="#apt.name" /></td>
					<td><s:property value="#apt.addr" /></td>
					<td><s:property value="#apt.tel" /></td>

				</tr>
			</s:iterator>
		</table>
		<a href="houseOptions.jsp">Back</a>
	</center>
</body>
</html>