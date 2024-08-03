<%@page import="com.DB.DBconnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
<style type="text/css">
 .col-sm-8 {
 background-color: pink;}
 
</style>
</head>
<body>
    <%@include file="navbar.jsp" %>
 <%
	User us = (User) session.getAttribute("userobj1");
	%>
 
<div class="imageContainer p-3">
<img src="images/im4.jpg">

<div class="caption TL" >


<p>
  Creative Styling <br>
  Beauty Parlour <br>
  Fashion For Women
</p>

</div>

    <div>
    <div class="call-w3 p-4 ">
        <div class="container">
       

        <center> <h1  style="color:#FF007F;font-family: cursive; ">Our Services</h1></center>
            <div class="grids">
                    <div class="grids-content row">
                           
                        <div class="column col-lg-4 col-md-6 color-2 ">
                           
                            <div class="column col-lg-4 col-md-6 col-sm-6 back-image  ">
                            <img src="images/s2.jpg" alt="product" class="img-responsive " style="width:300px; height: 200px;">
                            <h1>Makeup</h1>
                        </div>
                      
                    </div>
                        <div class="column col-lg-4 col-md-6 col-sm-6 back-image  ">
                            <img src="images/s4.jpg" alt="product" class="img-responsive " style="width:300px; height: 200px;">
                            <h1>Haircut</h1>
                        </div>
                        <div class="column col-lg-4 col-md-6 col-sm-6 back-image2 ">
                            <img src="images/s5.jpg" alt="product" class="img-responsive " style="width:300px; height: 200px;">
                             <h1>HairStyle</h1>
                          </div>
                          <div class="column col-lg-4 col-md-6 col-sm-6 back-image2 ">
                            <img src="images/s3.jpg" alt="product" class="img-responsive " style="width:300px; height: 200px;">
                             <h1>Nail Art</h1>
                          </div>
                          <div class="column col-lg-4 col-md-6 col-sm-6 back-image2 ">
                            <img src="images/s6.jpg" alt="product" class="img-responsive " style="width:300px; height: 200px;">
                             <h1>Facial</h1>
                          </div>
                          <div class="column col-lg-4 col-md-6 col-sm-6 back-image2 ">
                            <img src="images/s7.jpg" alt="product" class="img-responsive " style="width:300px; height: 200px;">
                             <h1>Haircoloring</h1>
                          </div>
                    </div>
                </div>
        </div>
    </div>
  </div> 
   <section class="w3l-teams-18">
	<div class="team-single-main ">
		<div class="container">
		
				<div class="column2 image-text">
					<h3 class="team-head ">Come experience the secrets of relaxation </h3>
					 <img src="images/ff.png" alt="CoolBrand" style="width:290px; height: 170px; ">
					<p class="para  text ">
						Best Beauty expert at your home and provides beauty salon at home. Home Salon provide well trained beauty professionals for beauty services at home including Facial, Clean Up, Bleach, Waxing,Pedicure, Manicure, etc.</p>
						
				</div>
			</div>
		</div>
	</div>
</section>
  
   
</div>


<div id="about" class="container-fluid">
  <div class="row">
    <div class="col-sm-8" style="z-index: -1;" >
      <h2 >About Company Page</h2><br>
      <h4>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
      
    </div>
    <div class="col-sm-4" style="
 background-color: pink;">
    <br>
    <% if(us == null){ %>
    <button class="button button1"><a href="login.jsp"><b style="color: black;">Get An Appointment </b><i class='fas fa-arrow-right'></i></button>
    <% } else { %>
    <button class="button button1"><a href="appointment.jsp"><b style="color: black;">Get An Appointment </b><i class='fas fa-arrow-right'></i></button>
    <% } %>
      <span class="glyphicon glyphicon-signal logo"></span>
      <img src="images/ff.png" style="height: 300px; width: 300px; ">
    </div>
  </div>
</div>

</body>
 <%@include file="footer/footer.jsp" %>
</html>