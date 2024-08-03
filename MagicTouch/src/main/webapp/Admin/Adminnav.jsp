<%@page import="java.net.http.HttpClient.Redirect"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.entity.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Navbar</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../Allcss/style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body
	style="background-image: url('../images/13.jpg'); background-size: cover; background-position: center;  width: 100%; height: 100vh;">

	<%@include file="../Allcss/allcss.jsp"%>
	<%
	User user = (User) session.getAttribute("userobj");
	if(user==null){
		
	}
	%>
	<div class="m-8" style="position: sticky; top: 0;">
		<nav class="navbar navbar-expand-lg navbar-light ">
			<div class="container-fluid ">
				<a href="#" class="navbar-brand"> <img src="../images/ff.png"
					height="90" alt="CoolBrand">
				</a>
				<button type="button" class="navbar-toggler"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<div class="navbar-nav p-4">

						<a href="home.jsp" class="nav-item nav-link active">Home</a> <a
							href="customer.jsp" class="nav-item nav-link">Customer</a> <a
							href="service.jsp" class="nav-item nav-link">Services</a> 
							<a href="Allcourse.jsp" class="nav-item nav-link">Courses</a>
							<a
							href="appoint.jsp" class="nav-item nav-link " tabindex="-1">Appointment</a>
						<a href="contacts.jsp" class="nav-item nav-link">Feedback</a>

					</div>

					<div class="navbar-nav ms-auto">

						<a href="../logout" class="nav-item nav-link">
							<button type="button"
								onclick="return confirm('Do you want to Logout')"
								class="btn btn-outline-primary"
								style="color: black; border-color: black;">
								<b>Logout</b>
							</button>
						</a>
					</div>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>