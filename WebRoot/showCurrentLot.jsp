<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Your Parking Lot Information</title>
</head>
<body>
<center>
	<h2>Detained Information of Parking Lot</h2>
	<table border="1">
		<s:set name="lot" value="#request.lot"/>
		<tr>
			<td>Ticket ID</td>
			<td><s:property value="#lot.id"/></td>
		</tr>
		<tr>	
			<td>Num of Parking Spot</td>	
			<td><s:property value="#lot.numParkingSpot"/></td>	
		</tr>
		
	
	</table>
	<a href="parkingOptions.jsp">Back to Parking Options</a>		
</center>
</body>
</html>