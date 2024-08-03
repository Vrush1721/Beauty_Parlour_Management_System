<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.DAO.CourseDAOimpl"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.entity.Courses"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}
#cardbody{
 
      width: 100%;
      background-image:url("images/13.jpg");
      background-size: cover;
      background-position: center;
}
/* Float four columns side by side */
#c {
  float: left;
  width: 28%;
  padding: 2px 10px;
  
}

/* Remove extra left and right margins, due to padding */
#r {
padding-left:17%;
align-items: center;
}

/* Clear floats after the columns */
#r:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive columns */
@media screen and (max-width: 600px) {
  #c {
    width: 100%;
    display: block;
    margin-bottom: 20px;
  }
}

/* Style the counter cards */
#ca {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  padding: 16px;
  text-align: center;
  background-color: #ffa6c9 ;
}
</style>
</head>
<%@include file="Allcss/allcss.jsp" %>
<%@include file="navbar.jsp" %>
<body id="cardbody">
<%
	User us = (User) session.getAttribute("userobj1");
	%>
<br>
<h1 style="text-align: center; color:#e4007c ">Our Courses</h1>

<br>
<div class="row" id="r">
  <%

    CourseDAOimpl dao=new CourseDAOimpl(DBconnect.getConn());
     List<Courses> list=dao.displaycourse();
     for(Courses c:list){
	%>
	<div class="column" id="c">
    <div class="card" id="ca">
    <h1><%=c.getCtype() %></h1>
    <img src="images/<%=c.getPhoto() %>" alt="John" name="photo" style="width:100% ;height: 150px;">
      <h4 name="ctype"><%=c.getCname()%></h4>
      <p name="cdetails"><%=c.getCdetails() %></p>
      <h3 name="cprice">₹ <%=c.getCprice() %> /-</h3>
      <% if(us == null){ %>
       <button style="border-radius: 20px; height: 40px;"><a href="login.jsp" style="color: black">Enroll For Courses</a></button>
       <% }else { %>
       <button style="border-radius: 20px; height: 40px;"><a href="enroll.jsp" style="color: black">Enroll For Courses</a></button>
       <% } %>
    </div>
    
  </div>
	<% 
 }
%>
  



 
</div>
   <br><br>
</body>
 <%@include file="footer/footer.jsp" %>
</html>
