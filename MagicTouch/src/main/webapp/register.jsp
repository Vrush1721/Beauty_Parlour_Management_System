<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style type="text/css">
 .reg{
  
 }
</style>
</head>
<body>
<%@include file="Allcss/allcss.jsp" %>
 <%@include file="navbar.jsp" %>
  <div class="regbody1">
   <center>
   
   <div class="regcontainer">
   	<form class="reg-form" method="post" action="register">
   		<div class="reg1">
   			<img src="images/ff.png" style="height: 400px; width: 300px; ">
   		</div>
   		
      <div class="reg1" style="margin-left: 20px;">
   		<h1>Register</h1><br><br>
   		 

             <div class="name" style="display:flex;">
		       <input type="text" name="fname" placeholder="Full Name" pattern="[a-zA-Z'-'\s]*" title="Name must type in a-zA-Z'-format"  required > 
			   
			 </div><br>
	
		<input type="number" name="mobno" placeholder="Mobile No"  pattern="^\d{10}$" title="Mobile number must contain 10 number" required ><br><br>

         <input type="Email" name="email" placeholder="Email"  required ><br><br>
         <input type="text" name="address" placeholder="Address"  required ><br><br>
          <input type="password" name="password" placeholder="Set Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required ><br><br>
        
	

   		 
   		<button type="submit" class="reg " name="submit" onclick="myfunction()">Register</button><br><br>
   		<p><a href="login.jsp"><b style="color:blue;" >Sign In  </b></a>   Alredy Customer?</p>
   	</div>
   	</form>
   	
   	</div>
   </div>
</center>
</div>


</body>
 <%@include file="footer/footer.jsp" %>
</html>