<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBconnect"%>
<%@page import="com.DAO.UserDAOimpl"%>
<%@ page import="java.util.Arrays"%>
<%@page import="com.entity.Service"%>
<%@page import="com.DAO.ServiceDAoimpl"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="bootstrap-4.4.1/css/bootstrap.min.css">
    <script type="text/javascript" src="bootstrap-4.4.1/js/juqery_latest.js"></script>
  
     <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body{

background-image:url("images/13.jpg");
}
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
<%@include file="navbar.jsp" %>
<center>
<br>
<h1 style="color: white;padding-top: 10px;">All Services</h1>



<br>
<div class="obutton" style="overflow-x:auto;">
   
  <table>
    <tr>
        
        <th>Service Name</th>
        <th>Service Price</th>
        
    </tr>
    <%
      ServiceDAoimpl dao =new ServiceDAoimpl(DBconnect.getConn());
      List<Service> list =dao.getAllService();
      
      for(Service s:list)
      {
    %>
      <tr>
        
        <td ><%=s.getSname() %></td>
        <td  >₹ <%=s.getCost() %></td>
       
        
        

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
