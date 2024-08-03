<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.entity.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@include file="Allcss/allcss.jsp"%>
	<%
	User user = (User) session.getAttribute("userobj1");
	%>
	<div class="m-8" style="position: sticky; top: 0;">
		<nav class="navbar navbar-expand-lg navbar-light ">
			<div class="container-fluid ">
				<a href="#" class="navbar-brand"> <img src="images/ff.png"
					height="90" alt="CoolBrand">
				</a>
				<button type="button" class="navbar-toggler"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<div class="navbar-nav p-4">
						<a href="index.jsp" class="nav-item nav-link active">Home</a> 
						<a href="dispservices.jsp" class="nav-item nav-link ">Services</a>
						<!-- <a href="#" class="nav-item nav-link">services</a>-->
						<a href="about.jsp"
							class="nav-item nav-link">about</a> <a href="contact.jsp"
							class="nav-item nav-link " tabindex="-1">contact</a> 
							
							<%
							  if(user == null){
							 
							%>
							<a href="login.jsp" class="nav-item nav-link">
							<button type="button" class="btn btn-outline-primary"
								style="width: 220px; color: black; border-color: black;">
								<b>Get An Appointment</b>
							</button>
							</a>
							<% }else { %>
							<a href="appointment.jsp" class="nav-item nav-link">
							<button type="button" class="btn btn-outline-primary"
								style="width: 220px; color: black; border-color: black;">
								<b>Get An Appointment</b>
							</button>
							</a>
							<%} %>
						
                       <a href="courseadd.jsp" class="nav-item nav-link">Courses</a> 

					</div>
					<div class="navbar-nav ms-auto">
						<%
						if (user != null) {
						%>
						<a href="uappoint.jsp" class="nav-item nav-link" >My Appointment</a>
						<a href="" class="nav-item nav-link"> <b><%=user.getEmail()%></b></a>
						<a href="logout" class="nav-item nav-link">
                             <button type="button" onclick="return confirm('Do you want to Logout')" class="btn btn-outline-primary" style="color: black;   border-color: black;">
                               <b>Logout</b>
                             </button>
                        </a>
						<%
						}else{
						%>

					</div>
					<div class="navbar-nav ms-auto">

						<a href="login.jsp" class="nav-item nav-link">
							<button type="button" class="btn btn-outline-primary"
								style="color: black; border-color: black;">
								<b>Login</b>
							</button>
						</a>
					</div>
					<% } %>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>