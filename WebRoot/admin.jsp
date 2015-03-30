<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Log in</title>
	<link href="<%=request.getContextPath()+"/css/style.css"%>" rel="stylesheet" type="text/css" />
<style>
#header {
	background-color: grey;
	color: white;
	text-align: center;
	padding-top: 30px;
    padding-right: 50px;
    padding-bottom: 30px;
    padding-left: 50px;
} 
</style>
</head>

<body style="font-family: sans-serif; font-weight:lighter ">
	
	<div id="header">
		<%
				out.print("<font size='5'>Welcome to University Housing System</font>");
		%>
	</div>
	<br><br><br>
	<div align="center">
	<h2>Logged in Supervisor/Admin</h2>
		<br><a href="<%="showNewLeaseRequest.action"%>" style="color: midnightblue;">View New Lease Requests</a>
		<br><a href="<%="showNewTerminReq.action"%>" style="color: midnightblue;">View Terminate Lease Requests</a>
		<br><a href="<%="showAllTicket.action"%>" style="color: midnightblue;">View Maintenance Tickets</a>
		<br><a href="<%="showAllParkingRequest.action"%>" style="color: midnightblue;">View Parking Requests</a>
		<br><a href="profileOptionsAdmin.jsp" style="color: midnightblue;">Profile</a>
		
		<br><a href="login.jsp" style="color: midnightblue;">Back</a>
		<br><HR><br>
		
	</div>
	<br><br><br>
	<div id="footer">Copyright ©2015 CSC540 Database Team.</div>
</body>
</html>
