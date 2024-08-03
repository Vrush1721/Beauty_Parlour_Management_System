<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.DB.*"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.DAO.CourseDAOimpl"%>
<%@ page import="java.util.Arrays"%>
<%@page import="com.entity.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css"
	rel="stylesheet" />

<style type="text/css">
#ctid {
	border-radius: 10px;
}

#appointbody {
	width: 100%;
	background-image: url("images/13.jpg");
	background-size: cover;
	background-position: center;
}
</style>
</head>
<%@include file="Allcss/allcss.jsp"%>
<%@include file="navbar.jsp"%>

<body id="appintbody">
	
	<div class="appbody">
		<center>
			<div class="appcontainer">
				<form class="app-form" method="post" action="addappointmentservlet">
				<%
	               User us = (User) session.getAttribute("userobj1");
	            %>
					<div class="app1">
						
						<img src="images/ff.png" style="height: 400px; width: 300px;">
						<img src="images/im9.jpg"
							style="height: 270px; width: 300px; border-radius: 300px;">
					</div>
					<div class="app1">
						<h1>Appointment</h1>
                           <input type="hidden" value="<%=us.getIdUser()%>" name="uid">
						<br> <label class="label1">Name</label><br> <input
							type="text" name="name" required><br> <br> <label
							class="label1">Mobno</label><br> <input type="text"
							name="mobno" required><br> <label class="label1">Email</label><br>
						<input type="text" name="email" required><br> <label
							class="label1">Services</label><br> <select
							class="multiple-select" width=300
							style="width: 300px; height: 40px;" name="idServices" size=3
							multiple required>
							<%
							try {

								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/magictouch", "root", "RootVrush");
								Statement stm = conn.createStatement();
								String sql = "SELECT * FROM magictouch.services";
								ResultSet rs = stm.executeQuery(sql);
								while (rs.next()) {
							%>
							<option
								value="<%=rs.getString("sname")%> -₹<%=rs.getString("cost")%>"><%=rs.getString("sname")%>
								-
								₹<%=rs.getString("cost")%></option>
							<%
							}
							} catch (Exception e) {
							e.printStackTrace();
							}
							%>
						</select> <label class="label1">Address</label><br> <input type="text"
							name="address" required><br> <label class="label1">Date</label><br>
						<input type="date" name="date" required><br> <label
							class="label1">Time</label><br> <input type="time"
							name="time" required> <br>
						<br> <input type="hidden" name="status" value="Pending"><br>
						<br>

						<button type="submit" class="l" name="submit"
							onclick="myfunction()">Submit</button>
						<br> <br>

					</div>
				</form>

			</div>
	</div>
	</center>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js"></script>
	<script type="text/javascript">
		$(".multiple-select").select2({
			maximumSelectionLength : 1
		});
	</script>

</body>
<%@include file="footer/footer.jsp"%>
</html>