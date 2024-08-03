package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Service;
import com.entity.User;

public class ServiceDAoimpl implements ServDAO {
	private Connection conn;
	public ServiceDAoimpl(Connection conn) {
		super();
		this.conn = conn;
	}
	
	
	
	@Override
	public boolean addservicesdb(Service s) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			
			String sql="insert into magictouch.services(sname,cost)values(?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, s.getSname());
			ps.setString(2, s.getCost());
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
	@Override
	public List<Service> getAllService() {
		List<Service> list =new ArrayList<Service>();
		Service s=null;
		try {
			String sql="SELECT * FROM magictouch.services";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				s=new Service();
				s.setIdServices(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setCost(rs.getString(3));
				
				
				list.add(s);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}



	@Override
	public Service getserviceById(int id) {
		Service s=null;
		try {
			String sql ="select * from magictouch.services where idServices=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				s=new Service();
				s.setIdServices(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setCost(rs.getString(3));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}



	@Override
	public boolean Deleteservice(int id) {
		boolean s=false;
		try {
			
			String sql ="DELETE FROM `magictouch`.`services` where idServices=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i==1) {
				s=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return s;	
	}



	@Override
	public boolean Updateservice(Service s) {
		boolean f=false;
		try {
			String sql ="UPDATE `magictouch`.`services` SET `sname` = ?,`cost` = ? WHERE `idServices` = ?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,s.getSname());
			ps.setString(2,s.getCost());
			
			ps.setInt(3, s.getIdServices());
			
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
}
