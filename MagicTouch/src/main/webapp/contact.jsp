<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.conbody{
      
      padding: 2%;
      width: 100%;
      background-image:url("images/13.jpg");
      background-size: cover;
      background-position: center;
     

     }
    .concontainer{
      background-image: linear-gradient(45deg ,#FF007F,#E9DCC9);
    
      width: 700px;
      height: 530px;
        
       border: 2px solid whitesmoke;
      box-shadow: 0 15px 30px ;

      
    }
    .reg-form{
      display: flex;
      padding: 30px;
    }
    input{
      width: 300px;
      height: 46px;
      text-align: center;
      font-size: 20px;
      border: none;
      border-radius: 8px;
      outline-color: skyblue;
      background-color: white;
      font-size: 17px;
      
    }
   
      .reg{
      width: 300px;
      height: 40px;
      font-family: serif;
      border-radius: 10px;
      background: pink;
      font-size: 30px;
    }
    p{
      
      font-size: 125%;
    }
 a{
  font-size: 25px;
  

 }
table{
  padding: 20px;
}

table tr td{
  padding: 9px;
  
}
@media only screen and (max-width: 768px) {
         .reg-form{
      display:block;
      
    }
    .container{
      width: 400px;
      height: 990px;
    }
    #foot{
    padding-top:30%;
   }
  }
</style>
</head>
<body>
<%@include file="Allcss/allcss.jsp" %>
 <%@include file="navbar.jsp" %>
<div class="conbody">
   <center>
   <div class="concontainer">
    <form class="reg-form" method="post" action="addfeedbackservlet">
      <div class="log1">
       
        <img src="images/con1.jpg" style="height: 440px; width: 300px">
      </div>
      
      <div class="log1" style="margin-left: 20px;">
      
      <h1 style="background-color:pink">Contact Us</h1><br>
         <input type="text" name="name" placeholder="Full Name" pattern="[a-zA-Z'-'\s]*" required ><br><br>
         <input type="number" name="mobno" placeholder="Mobile No" pattern="^\d{10}$"  required ><br><br>
         <input type="Email" name="email" placeholder="Email"  required ><br><br>
         <input type="text" name="address" placeholder="Address"  required ><br><br>
          <input type="text" name="messege" placeholder="massage" style="height:90px;" required ><br><br>
        
  

       
      <button type="submit" class="reg " name="submit" onclick="myfunction()">Submit</button><br><br>
      
    </div>
    </form>
    
    </div>
   </div>
</center>
</div>
</body>
 <%@include file="footer/footer.jsp" %>
</html>