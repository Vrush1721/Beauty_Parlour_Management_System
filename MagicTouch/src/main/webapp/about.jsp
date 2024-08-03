<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

.text{
  text-align: center;
  font-family: sans-serif;
  padding:4px;
}

.text h2{
   font: bold;
   font-size: 70px;
}
.text .pic{
 height: 240px;
}
.text .pics{
 height: 300px;
 width: 700px;
}
.data{
   padding: 14px;
}

.about-us{
  background-color: pink;
}
</style>
</head>
<body>
	<%@include file="Allcss/allcss.jsp"%>
	<%@include file="navbar.jsp"%>
	<section class="about-us">
		<div class="about">
			
			<div class="text">
			 <h2 style="font-family: cursive;">About Us</h2>
			<center>
			 
				<img src="images/ff.png" class="pic">
			</center>		
								<p>The <b>‘Magic Touch Beauty Parlour’</b> was established by business person
					Kate Cynthia in 1976. Joined by her little girls, Larry and keeth,
					before long, the trio has developed the business to what it is
					today.
					<br> <br>The honor winning sisters have buckled down and keep on
					working unendingly on enhancing and keeping up benchmarks over the
					business and are now extremely energized with the presentation of
					the new Beauty and Skin Clinic on Grafton Street 
					<br><br>“Our customers are
					vital to us, so we constantly train our specialists to guarantee
					that all medicines are of the most astounding standard and that
					every customer gets the best consideration” 
					<br><br>The new Beauty and Skin
					Clinic will enable us to give customers the full range of
					corrective, remedial, and preparing medications with the most
					expert and classified administration</p>
					<img src="images/b1.jpg" class="pics"><br>
			
				<div class="data">
					<button class="button button1"><a href="contact.jsp"><b style="color: black;">Contact Us</b></button>
				</div>
			</div>
		</div>
	</section>
</body>
 <%@include file="footer/footer.jsp" %>
</html>