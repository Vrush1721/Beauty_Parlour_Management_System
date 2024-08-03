package com.entity;

public class User {
    
	private int idUser;
	private String fname;
	private String mobno;
	private String email;
	private String address;
	private String password;
	
	



	public User(int idUser, String fname, String mobno, String email, String address, String password) {
		super();
		this.idUser = idUser;
		this.fname = fname;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
		this.password = password;
	}


	public User(String fname, String mobno, String email, String address, String password) {
		super();
		this.fname = fname;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
		this.password = password;
	}


	


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", fname=" + fname + ", mobno=" + mobno + ", email=" + email + ", address="
				+ address + ", password=" + password + "]";
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMobno() {
		return mobno;
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	

}
