package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Feedback;
import com.entity.Service;
import com.entity.appointment;

public class AppDAOimpl implements AppDAO {
	private Connection conn;
	public AppDAOimpl(Connection conn) {
		super();
		this.conn = conn;
	}
	@Override
	public boolean addAppoint(appointment a) {
		boolean f=false;
		try {
			
		String sql="INSERT INTO `magictouch`.`appointment` (`name`,`mobno`,`email`,`idServices`,`address`,`date`,`time`,`status`,`uid`)"
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
	;
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, a.getName());
			ps.setString(2, a.getMobno());
			ps.setString(3, a.getEmail());
			ps.setString(4, a.getIdServices());
			ps.setString(5, a.getAddress());
			ps.setString(6, a.getDate());
			ps.setString(7, a.getTime());
			ps.setString(8, a.getStatus());
			ps.setInt(9,a.getUid());
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
	public List<appointment> getAllapp() {
		List<appointment> list =new ArrayList<appointment>();
		appointment a=null;
		try {
			String sql="SELECT * FROM magictouch.appointment";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				a=new appointment();
				a.setIdappointment(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setMobno(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setIdServices(rs.getString(5));
				a.setAddress(rs.getString(6));
				a.setDate(rs.getString(7));
				a.setTime(rs.getString(8));
				a.setStatus(rs.getString(9));
				a.setUid(rs.getInt(10));
				list.add(a);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public boolean Deleteapp(int id) {
		boolean s=false;
		try {
			
			String sql ="DELETE FROM `magictouch`.`appointment` where idappointment=?";
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
	public appointment getsappById(int id) {
		appointment a=null;
		try {
			String sql ="SELECT * FROM magictouch.appointment where idappointment=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				a=new appointment();
				a.setIdappointment(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setMobno(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setIdServices(rs.getString(5));
				a.setAddress(rs.getString(6));
				a.setDate(rs.getString(7));
				a.setTime(rs.getString(8));
				a.setStatus(rs.getString(9));
				a.setUid(rs.getInt(10));	
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	@Override
	public boolean Updateapp(appointment a) {
		boolean f=false;
		try {
			String sql ="UPDATE `magictouch`.`appointment` SET `name` = ?,`mobno` = ?,`email` = ?,`idServices` = ?,`address` = ?,"
					+ "`date` = ?,`time` = ?,`status` = ? WHERE `idappointment` = ?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, a.getName());
			ps.setString(2, a.getMobno());
			ps.setString(3, a.getEmail());
			ps.setString(4, a.getIdServices());
			ps.setString(5, a.getAddress());
			ps.setString(6, a.getDate());
			ps.setString(7, a.getTime());
			ps.setString(8, a.getStatus());
			ps.setInt(9, a.getIdappointment());
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<appointment> getAlluapp( int uid) {
		List<appointment> list =new ArrayList<appointment>();
		appointment a=null;
		
		try {
			
			String sql="SELECT * FROM magictouch.appointment where uid=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, uid);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				a=new appointment();
				a.setIdappointment(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setMobno(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setIdServices(rs.getString(5));
				a.setAddress(rs.getString(6));
				a.setDate(rs.getString(7));
				a.setTime(rs.getString(8));
				a.setStatus(rs.getString(9));
				a.setUid(rs.getInt(10));
				list.add(a);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public boolean cancelapp(int id) {
		boolean s=false;
		try {
			
			String sql ="DELETE FROM `magictouch`.`appointment` where idappointment=?";
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
	
	
}
