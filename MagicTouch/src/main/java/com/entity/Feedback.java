package com.entity;

public class Feedback {
 
	 private int idffedback;
	 private String name;
	 private String mobno;
	 private String email;
	 private String address;
	 private String messege;
	public int getIdffedback() {
		return idffedback;
	}
	public void setIdffedback(int idffedback) {
		this.idffedback = idffedback;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedback [idffedback=" + idffedback + ", name=" + name + ", mobno=" + mobno + ", email=" + email
				+ ", address=" + address + ", messege=" + messege + "]";
	}
	 
}
