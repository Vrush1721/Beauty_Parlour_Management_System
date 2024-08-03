package com.entity;

import java.time.LocalDateTime;

public class appointment {
    private int idappointment;
    private String name;
    private String mobno;
    private String email;
    private String idServices;
    private String address;
    private String date;
    private String time;
    private String status;
    private int uid;
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdappointment() {
		return idappointment;
	}
	public void setIdappointment(int idappointment) {
		this.idappointment = idappointment;
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
	public String getIdServices() {
		return idServices;
	}
	public void setIdServices(String  idServices) {
		this.idServices = idServices;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "appointment [idappointment=" + idappointment + ", name=" + name + ", mobno=" + mobno + ", email="
				+ email + ", idServices=" + idServices + ", address=" + address + ", date=" + date + ", time=" + time
				+ ", status=" + status + ", uid=" + uid + "]";
	}
	
    
}
