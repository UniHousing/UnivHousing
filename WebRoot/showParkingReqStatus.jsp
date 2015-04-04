
<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Parking Request Status</title>
</head>
<body>
<center>
	<h2>Parking Request Status</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>Status</td>
			<td>Handicapped(yes/no)</td>
			<td>Vehicle Type</td>
			<td>Accept non-nearby parking(yes/no)<td>
		</tr>
		<s:iterator value="#request.all" id="spot">
		<tr>
			<td><s:property value="#spot.id"/></td>
			<td><s:property value="#spot.status"/></td>
			<td><s:property value="#spot.nearby"/></td>
			<td><s:property value="#spot.handicapped"/></td>
			<td><s:property value="#spot.vehicleType"/></td>
		</tr>
		</s:iterator>	
	</table>
	<a href="ParkingOptions.jsp">Back to Parking</a>
</center>
</body>
</html>