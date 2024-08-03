<%@page import="com.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.DAO.UserDAOimpl"%>
<%@ page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
<?php include_once('adminnav.php'); ?>
<body>
<%@include file="Adminnav.jsp" %>
<center>
<h1 style="color: white;padding-top: 10px;">Customer Details</h1>
 

<div class="obutton" style="overflow-x:auto;">
   <!-- <button ><a href="addcust.jsp"><b>Add Customer</b></a></button><br><br>-->
  <table>
    <tr>
        <th id="poid">Cid</th>
        <th>Name</th>
        <th>Mobile No</th>
        <th>Email</th>
        <th>Address</th>
        <th>Operation</th>
    </tr>
    <%
      UserDAOimpl dao =new UserDAOimpl(DBconnect.getConn());
      List<User> list =dao.getAllUser();
      for(User u:list)
      {
    %>
    	 <tr>
        <td style="color: black;"  ><%=u.getIdUser() %></td>
        <td ><%=u.getFname() %></td>
        <td ><%=u.getMobno() %></td>
        <td ><%=u.getEmail() %></td>
        <td><%=u.getAddress()%></td>
        <td ><center>
           
           <a href="upcust.jsp?id=<%=u.getIdUser() %>"style="...">Edit</a><br>
          <!--  <a href="../delcustservlet?id=<%=u.getIdUser()%>" onclick="return confirm('Are you sure you want to delete this item')" style="...">Delete</a>-->
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
    