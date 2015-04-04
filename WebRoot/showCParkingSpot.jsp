<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>ParkingSpot</title>
</head>
<body>
<center>
	<h2>ParkingSpot</h2>
	<table border="1">
		<s:set name="parkingspot" value="#request.parkingspot"/>
		<tr>
			<td>ParkingSpot ID</td>
			<td><s:property value="#parkingspot.id"/></td>
		</tr>
		<tr>	
			<td>Lot ID</td>	
			<td><s:property value="#parkingspot.lotId"/></td>	
		</tr>
		<tr>
			<td>Classification</td>
			<td><s:property value="#parkingspot.classification"/></td>
		</tr>
		<tr>
			<td>Fee</td>
			<td><s:property value="#parkingspot.fee"/></td>
		</tr>
		<tr>
			<td>Availability</td>
			<td><s:property value="#parkingspot.availability"/></td>
		</tr>		
	</table>
	<a href="parkingOptions.jsp">Back</a>		
</center>
</body>
</html>