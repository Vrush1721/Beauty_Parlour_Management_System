package com.entity;

public class Service {
    public int idServices;
    public String sname;
    public String cost;
    
    
	
	
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service( String sname, String cost) {
		super();
	
		this.sname = sname;
		this.cost = cost;
		
	}
	public int getIdServices() {
		return idServices;
	}
	public void setIdServices(int idServices) {
		this.idServices = idServices;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String i) {
		this.sname = i;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Service [idServices=" + idServices + ", sname=" + sname + ", cost=" + cost +  "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
