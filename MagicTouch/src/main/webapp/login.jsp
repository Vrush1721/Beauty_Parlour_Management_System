<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
.logbody{
      
      padding: 2%;
      width: 100%;
      background-image:url("images/13.jpg");
      background-size: cover;
      background-position: center;
     

     }
</style>
</head>
<body>
<%@include file="Allcss/allcss.jsp" %>
 <%@include file="navbar.jsp" %>
<div class="logbody">
   <center>
   <div class="logcontainer">
   	<form class="login-form" method="post" action="loginservlet" >
   	<div class="log1">
   		<img src="images/ff.png" style="height: 400px; width: 300px; ">
   	</div> 
   	   <div class="log1">
   	   <h1 > Login</h1>
						

<br>
   	   <label class="label1">Email</label><br>
   	   <input type="text" name="email"><br><br>
   	   <label class="label2">Password</label><br>
   	   <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"><br><br><br>

   		<button type="submit" class="l" name="submit" onclick="myfunction()">Sign In</button><br><br>
   		<p><a href="register.jsp"><b style="color:blue">Create Account  </b></a>  New Customer?</p>
   	</div>
   	</form>
   	
   	</div>
   </div>
</center>
</div>
</body>
 <%@include file="footer/footer.jsp" %>
</html>