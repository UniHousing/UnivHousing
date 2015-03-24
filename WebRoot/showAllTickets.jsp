<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Maintenance Tickets</title>
</head>
<body>
<center>
	<h2>Ticket List</h2>
	<table border="1">
		
		<tr>
			<td>ID</td>
			<td>StudentID</td>	
			<td>Type</td>
			<td>Date</td>
			<td>Location</td>		
		</tr>
		<s:iterator value="#request.all" id="ticket">
		<tr>
			<td><a href="showTicket.action?id=<s:property value='#ticket.id'/>"><s:property value="#ticket.id"/></a></td>
			<td><s:property value="#ticket.studentid"/></td>	
			<td><s:property value="#ticket.type"/></td>
			<td><s:property value="#ticket.date"/></td>
			<td><s:property value="#ticket:location"/></td>
			
		</tr>
		</s:iterator>	
	</table>
			
</center>
</body>
</html>