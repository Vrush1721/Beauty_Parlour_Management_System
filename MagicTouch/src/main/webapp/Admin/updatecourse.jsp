<%@page import="com.DAO.CourseDAOimpl"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.entity.Courses"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update Course</title>
<link rel="stylesheet" type="text/css"
	href="bootstrap-4.4.1/css/bootstrap.min.css">
<script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>

<script src='https://kit.fontawesome.com/a076d05399.js'
	crossorigin='anonymous'></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
.coursecontainer {
	background-image: linear-gradient(45deg, #FF007F, #E9DCC9);
	width: 450px;
	height: 660px;
	border: 2px solid whitesmoke;
	box-shadow: 0 15px 30px;
}

.coursecontainer input {
	width: 300px;
	height: 30px;
	text-align: center;
	border: none;
	border-radius: 10px;
	background-color: white;
	outline: none;
}

.coursecontainer .appi {
	width: 250px;
	height: 48px;
	font-family: serif;
	border-radius: 19px;
	background: #FF007F;
	font-size: 30px;
}

.coursecontainer .appi:hover {
	background-color: purple;
}
</style>
</head>

<body>
	<%@include file="Adminnav.jsp"%>
	<div class="appbody">
	 <% 
   
   int id =Integer.parseInt(request.getParameter("id"));
  CourseDAOimpl dao=new CourseDAOimpl(DBconnect.getConn());
  Courses c=dao.getcourseById(id);
   
   
   %>
		<center>

			<div class="coursecontainer">
				<form class="appi-form" method="post" action="../ceditcourse"
					enctype="multipart/form-data">

					<h1>Courses</h1>
					<c:if test="${not empty csuccess}">

						<P class="text-center text-success ">${csuccess}</P>
						<c:remove var="csuccess" scope="session" />
					</c:if>

					<c:if test="${not empty cfialmsg}">

						<P class="text-center text-danger ">${cfialmsg}</P>
						<c:remove var="cfialmsg" scope="session" />
					</c:if>
					<input type="text" name="idcourse" value="<%=c.getIdcourse() %>"> <br> <label
						class="label">Course Name</label><br> 
						<input type="text" name="cname" value="<%=c.getCname() %>" required><br> <br> <label
						class="label">Course Type</label><br> 
						
						<select type="text"
						name="ctype" value="<%=c.getCtype() %>" style="width: 290px; height: 38px;">
						<option value="<%=c.getCtype() %>"><%=c.getCtype() %></option>
						<option value="Basic">Basic</option>
						<option value="Advance">Advance</option>
						<option value="Professional">Professional</option>
					</select><br>
					<br> <label class="label">Price</label><br> <input
						type="text" name="cprice" value="<%=c.getCprice() %>" required><br>
		
					<br> <label class="label">Course Details</label><br> <input
						type="text" name="cdetails" value="<%=c.getCdetails() %>" style="width: 290px; height: 60px;"><br>
					<br>


					<button type="submit" class="appi" name="submit"
						onclick="myfunction()">Update</button>
					<br> <br>



				</form>

			</div>
	</div>
	</div>
	</center>
</body>

</html>