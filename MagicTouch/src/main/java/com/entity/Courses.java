package com.entity;

public class Courses {
   private int idcourse;
   private String cname;
   private String ctype;
   private String cprice;
   private String photo;
   private String cdetails;
 
   


public Courses() {
	super();
	// TODO Auto-generated constructor stub
}

public String getCprice() {
	return cprice;
}
public void setCprice(String cprice) {
	this.cprice = cprice;
}

public int getIdcourse() {
	return idcourse;
}
public void setIdcourse(int idcourse) {
	this.idcourse = idcourse;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}

public String getCdetails() {
	return cdetails;
}

public void setCdetails(String cdetails) {
	this.cdetails = cdetails;
}



public Courses(String cname, String ctype, String cprice, String photo, String cdetails) {
	super();
	this.cname = cname;
	this.ctype = ctype;
	this.cprice = cprice;
	this.photo = photo;
	this.cdetails = cdetails;

}

@Override
public String toString() {
	return "Courses [idcourse=" + idcourse +  ", cname=" + cname + ", ctype="
			+ ctype + ", cprice=" + cprice + ", photo=" + photo + ", cdetails=" + cdetails + "]";
}





   
   
}
