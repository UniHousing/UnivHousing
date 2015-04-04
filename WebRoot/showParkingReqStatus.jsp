
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
		<s:iterator value="#request.all" id="ticket">
		<tr>
			<td><a href="showTicket.action?id=<s:property value='#parking_request.id'/>"><s:property value="#ticket.id"/></a></td>
			<td><s:property value="#parking_request.status"/></td>
			<td><s:property value="#parking_request.description"/></td>
		</tr>
		</s:iterator>	
	</table>
	<a href="ParkingOptions.jsp">Back to maintenance</a>
</center>
</body>
</html>