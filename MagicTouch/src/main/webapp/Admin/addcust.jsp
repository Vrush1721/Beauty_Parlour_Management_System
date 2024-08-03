<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Add Customer</title>
     <link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  
     <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 <meta name="viewport" content="width=device-width, initial-scale=1">
	<style type="text/css">
	
		.custcontainer{
background-image: linear-gradient(45deg, #FF007F, #E9DCC9);
			
			width: 450px;
			height: 550px;
		   border: 2px solid whitesmoke;
			box-shadow: 0 15px 30px ;

			
		}
		.custcontainer input{
			width: 300px;
			height: 30px;
			text-align: center;
			border: none;
			border-radius: 10px;
			background-color: white;	
			outline: none;		
		}
   
	.custcontainer .appi{
			width: 250px;
			height: 48px;
            font-family: serif;
			border-radius: 19px;
			background: #FF007F;
			font-size: 30px;
		}
	.custcontainer .appi:hover {
	background-color: purple;
}

	</style>
</head>

<body>
	<%@include file="Adminnav.jsp" %>
	<div class="appbody">
   <center>

   <div class="custcontainer">
   	<form class="appi-form" method="post"  >
   	
						<h1>Customer</h1>
					
						<br> <label class="label">Name</label><br> 
						<input type="text" name="name"><br>
						<br> <label class="label">Mobno</label><br> 
						<input type="text" name="mobno"><br><br>
						<label class="label">Email</label><br> 
						<input type="text" name="email"><br><br>  
						<label class="label">Address</label><br> 
						<input type="text" name="address"><br><br> 
						 
						
					     

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
    