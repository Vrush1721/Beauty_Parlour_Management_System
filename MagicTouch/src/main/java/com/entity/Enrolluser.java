package com.entity;

public class Enrolluser {

	private int iduser_course;
	private String cname;
	private String ctype;
	private String cprice;
	private String cdetails;
	private int uid;
	@Override
	public String toString() {
		return "Enrolluser [iduser_course=" + iduser_course + ", cname=" + cname + ", ctype=" + ctype + ", cprice="
				+ cprice + ", cdetails=" + cdetails + ", uid=" + uid + "]";
	}
	public Enrolluser(int iduser_course, String cname, String ctype, String cprice, String cdetails, User user) {
		super();
		this.iduser_course = iduser_course;
		this.cname = cname;
		this.ctype = ctype;
		this.cprice = cprice;
		this.cdetails = cdetails;
		this.uid = uid;
	}
	public Enrolluser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIduser_course() {
		return iduser_course;
	}
	public void setIduser_course(int iduser_course) {
		this.iduser_course = iduser_course;
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
	public String getCprice() {
		return cprice;
	}
	public void setCprice(String cprice) {
		this.cprice = cprice;
	}
	public String getCdetails() {
		return cdetails;
	}
	public void setCdetails(String cdetails) {
		this.cdetails = cdetails;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	
	
}
