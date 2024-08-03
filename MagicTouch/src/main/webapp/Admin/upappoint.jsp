<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.entity.appointment"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.DAO.AppDAOimpl"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.DB.*"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Add Appointment</title>
     <link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css" rel="stylesheet" />
     <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 <meta name="viewport" content="width=device-width, initial-scale=1">
	<style type="text/css">
	
		.appicontainer{
background-image: linear-gradient(45deg, #FF007F, #E9DCC9);
			
			width: 450px;
			height: 810px;
		   border: 2px solid whitesmoke;
			box-shadow: 0 15px 30px ;

			
		}
		.appicontainer input{
			width: 300px;
			height: 30px;
			text-align: center;
			border: none;
			border-radius: 10px;
			background-color: white;	
			outline: none;		
		}
   
	.appicontainer .appi{
			width: 250px;
			height: 48px;
            font-family: serif;
			border-radius: 19px;
			background: #FF007F;
			font-size: 30px;
		}
	.appicontainer .appi:hover {
	background-color: purple;
}

	</style>
</head>

<body>
	<%@include file="Adminnav.jsp" %>
	<div class="appbody">
   <center>

   <div class="appicontainer">
   	<form class="appi-form" method="post" action="../editapp" >
   	
						<h1>Appointment</h1>
					<% 
   
                         int id =Integer.parseInt(request.getParameter("id"));
						 AppDAOimpl dao=new AppDAOimpl(DBconnect.getConn());
						 appointment a= dao.getsappById(id);
   
   
                        %>
                         <input type="hidden" name="id" value="<%=a.getIdappointment() %>"><br>
						<br> <label class="label">Name</label><br> 
						<input type="text" name="name" value=<%=a.getName() %> required><br>
						<br> <label class="label">Mobno</label><br> 
						<input type="text" name="mobno" value=<%=a.getMobno() %> required><br><br>
						<label class="label">Email</label><br> 
						<input type="text" name="email" value=<%=a.getEmail() %> required><br><br> 
						<label class="label">Services</label><br> 
						<!--  <select class="multiple-select" width=300 style="width: 300px; height: 40px;" name="idServices" size=3 multiple value="<%=a.getIdServices() %>" required>
						
						<%
						   
						    
						   try{
							    
							   Class.forName("com.mysql.cj.jdbc.Driver");
					    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/magictouch","root","RootVrush");
					    		Statement stm=conn.createStatement();
					    		String sql="SELECT * FROM magictouch.services";
					    		ResultSet rs=stm.executeQuery(sql);
					    		while(rs.next()){
					    			%>
					    			
					    			<option  value="<%=rs.getString("sname")%>"><%=rs.getString("sname") %> - <%=rs.getString("cost") %></option>
					    <%			
					    		}
						   }
						  catch(Exception e){
							  e.printStackTrace();
						  }
						
						%>
						</select > -->
						<input type="text" name="idServices" value="<%=a.getIdServices() %>" >
						 <br> 
						<label class="label">Address</label><br> 
						<input type="text" name="address" value=<%=a.getAddress() %> required><br><br> 
						<label class="label">Date</label><br> 
						<input type="date" name="date" value=<%=a.getDate() %> ><br><br>
						<label class="label">Time</label><br> 
						<input type="time" name="time" value=<%=a.getTime() %>><br><br> 
						
					     
                     <select name="status" style="width:200px;height: 40px;font-size: 20px;" >
                          <option value=<%=a.getStatus() %>><%=a.getStatus() %></option>
                          <option value="Rejected">Reject</option>
                          
                          <option value="Approved">Approve</option>
                     </select><br><br>
						<button type="submit" class="appi" name="submit"
							onclick="myfunction()">Edit</button>
						<br>
						<br>


     
   	</form>
   	
   	</div>
   </div>
   </div>
</center>
<script src="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js"></script>
	<script type="text/javascript">
	$(".multiple-select").select2({
		  maximumSelectionLength: 1
		});</script>
</body>

</html>