<%@page import="com.entity.Courses"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.DAO.CourseDAOimpl"%>
<%@ page import="java.util.Arrays"%>
<%@page import="com.entity.Service"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  
     <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<style>

table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 50%;
  border: 2px solid black;
  text-align: center;
}

th, td {
  border: 2px solid #FF007F;
  text-align: left;
  padding: 8px;
}
td{
  background-color: white;
  text-align: center;
}
th{
  text-align: center;
  background-image: linear-gradient(45deg, #FF007F, #FF007F);
}
.obutton button{
  font-size: 23px;
  height: 45px;
   width: 180px;
   border: 3px solid #FF007F;
   box-shadow: 0 4px #999;
   border-radius: 10px;
 

}
.obutton button:hover{
  background-color: #FF007F;
  transform: translate(3px);
}
.obutton button a{
  text-decoration: none;
  color: black;
}

</style>
</head>
<body class="servicesb">
<%@include file="Adminnav.jsp" %>
<center>
<h1 style="color: white;padding-top: 10px;">Course Details</h1>




<div class="obutton" style="overflow-x:auto;">
   <button ><a href="course.jsp"><b>Add Courses</b></a></button><br><br>
  <table>
    <tr>
        <th id="poid">Cid</th>
        <th>Course Name</th>
         <th>Course Photo</th>
         <th>Course Type</th>
        <th>Course Price</th>
          <th>Course Details</th>
        <th>Operation</th>
    </tr>
    <%
     
       CourseDAOimpl dao=new CourseDAOimpl(DBconnect.getConn());
       List<Courses> list=dao.getAllcourse();
     
      for(Courses c:list)
      {
    %>
      <tr>
        <td> <%=c.getIdcourse() %></td>
        <td> <%=c.getCname() %></td>
        <td> <img src="../images/<%=c.getPhoto() %>" style="width: 50px; height: 50px;"></td>
        <td> <%=c.getCtype() %></td>
        <td> <%=c.getCprice() %></td>
        <td> <%=c.getCdetails() %></td>
        <td class="delete"><center>
           
          <!-- <a href="updatecourse.jsp?id=<%=c.getIdcourse() %>"style="..."><i class="fa fa-edit" style="color:black;"></i>Edit</a><br> -->
          <a href="../delcourse?id=<%=c.getIdcourse() %>" onclick="return confirm('Are you sure you want to delete this item')" style="...">Delete</a>
        </center></td>

      </tr>
 <%	  
      }
    %>
  </table>
</div>
<br>
</center>
</body>

</html>