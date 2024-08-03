package com.DAO;

import java.util.List;

import com.entity.Service;
import com.entity.User;

public interface ServDAO {
	public  boolean addservicesdb(Service s);
	public List<Service> getAllService();
	 public Service getserviceById(int id);
	 public boolean Updateservice(Service s);
	public boolean Deleteservice(int id);
}
