<%@page import="com.DB.DBconnect"%>
<%@page import="com.DAO.ServiceDAoimpl"%>
<%@page import="com.entity.Service"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Add Services</title>
     <link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  
     <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 <meta name="viewport" content="width=device-width, initial-scale=1">
	<style type="text/css">
	
		.sercontainer{
background-image: linear-gradient(45deg, #FF007F, #E9DCC9);
			
			width: 450px;
			height: 360px;
		   border: 2px solid whitesmoke;
			box-shadow: 0 15px 30px ;

			
		}
		.sercontainer input{
			width: 300px;
			height: 30px;
			text-align: center;
			border: none;
			border-radius: 10px;
			background-color: white;	
			outline: none;		
		}
   
	.sercontainer .appi{
			width: 250px;
			height: 48px;
            font-family: serif;
			border-radius: 19px;
			background: #FF007F;
			font-size: 30px;
		}
	.sercontainer .appi:hover {
	background-color: purple;
}

	</style>
</head>

<body>
	<%@include file="Adminnav.jsp" %>
	<div class="appbody">
   <center>

   <div class="sercontainer">
   <% 
   
   int sid =Integer.parseInt(request.getParameter("id"));
   ServiceDAoimpl dao=new ServiceDAoimpl(DBconnect.getConn());
  Service s=dao.getserviceById(sid);
   
   
   %>
   	<form class="appi-form" method="post" action="../upservi"  >
   	
						<h1>Services</h1>
					  <input type="hidden" name="id" value="<%=s.getIdServices() %>"><br>
						<br> <label class="label" >Services Name</label><br> 
						<input type="text" name="sname" value="<%=s.getSname() %>"><br>
						<br> <label class="label" >Cost </label><br> 
						<input type="text" name="cost" value="<%=s.getCost() %>"><br><br>
						
						<button type="submit" class="appi" name="submit"
							onclick="myfunction()">Add</button>
						<br>
						<br>


     
   	</form>
   	
   	</div>
   </div>
   </div>
</center>
</body>

</html>