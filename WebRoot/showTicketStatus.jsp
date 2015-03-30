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
			<td>Status</td>
			<td>description</td>
		</tr>
		<s:iterator value="#request.all" id="ticket">
		<tr>
			<td><a href="showTicket.action?id=<s:property value='#ticket.id'/>"><s:property value="#ticket.id"/></a></td>
			<td><s:property value="#ticket.status"/></td>
			<td><s:property value="#ticket:description"/></td>
		</tr>
		</s:iterator>	
	</table>
			
</center>
</body>
</html>