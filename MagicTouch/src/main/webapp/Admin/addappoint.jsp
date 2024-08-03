<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Add Appointment</title>
     <link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  
     <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 <meta name="viewport" content="width=device-width, initial-scale=1">
	<style type="text/css">
	
		.appicontainer{
background-image: linear-gradient(45deg, #FF007F, #E9DCC9);
			
			width: 450px;
			height: 660px;
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
   	<form class="appi-form" method="post" action="../addappointmentservlet" >
   	
						<h1>Appointment</h1>
					
						<br> <label class="label">Name</label><br> 
						<input type="text" name="name" required><br>
						<br> <label class="label">Mobno</label><br> 
						<input type="text" name="mobno" required><br><br>
						<label class="label">Email</label><br> 
						<input type="text" name="email" required><br><br>  
						<label class="label">Address</label><br> 
						<input type="text" name="address" required><br><br> 
						<label class="label">Date</label><br> 
						<input type="date" name="date" ><br><br>
						<label class="label">Time</label><br> 
						<input type="time" name="time"><br><br>   
						<input type="hidden" name="status" value="Pending">
					     

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
    