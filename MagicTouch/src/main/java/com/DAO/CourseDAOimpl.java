package com.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

import com.entity.Courses;

import com.entity.appointment;

public class CourseDAOimpl implements CourseDAO {
	private Connection conn;

	public CourseDAOimpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addcourse(Courses c) {
		boolean f = false;
		try {

			String sql = "INSERT INTO `magictouch`.`course` (`cname`,`ctype`,`cprice`,`photo`,`cdetails`)VALUES(?,?,?,?,?)";
			;
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCname());
			ps.setString(2, c.getCtype());
			ps.setString(3, c.getCprice());
			ps.setString(4, c.getPhoto());
			ps.setString(5, c.getCdetails());
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public List<Courses> getAllcourse() {
		List<Courses> list =new ArrayList<Courses>();
		Courses c=null;
		try {
			String sql="SELECT * FROM `magictouch`.`course`";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				c=new Courses();
				c.setIdcourse(rs.getInt(1));
				c.setCname(rs.getString(2));
				c.setCtype(rs.getString(3));
				c.setCprice(rs.getString(4));
				c.setPhoto(rs.getString(5));
				c.setCdetails(rs.getString(6));
				list.add(c);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Courses getcourseById(int id) {
		Courses c=null;
		try {
			String sql ="SELECT * FROM magictouch.course where idcourse=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				c=new Courses();
				c.setIdcourse(rs.getInt(1));
				c.setCname(rs.getString(2));
				c.setCtype(rs.getString(3));
				c.setCprice(rs.getString(4));
				c.setPhoto(rs.getString(5));
				c.setCdetails(rs.getString(6));
					
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public boolean Delcourse(int id) {
		boolean s=false;
		try {
			
			String sql ="DELETE FROM magictouch.course where idcourse=?";
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
	public boolean Updatecourse(Courses c) {
		
		boolean f=false;
		try {
			String sql ="UPDATE `magictouch`.`course` SET `cname` = ?,`ctype` = ?,`cprice` = ?,`photo` = ?,`cdetails` = ? WHERE `idcourse` = ?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, c.getCname());
			ps.setString(2, c.getCtype());
			ps.setString(3,c.getCprice());
			ps.setString(4, c.getPhoto());
			ps.setString(5, c.getCdetails());
			ps.setInt(6, c.getIdcourse());
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public List<Courses> displaycourse() {
		List<Courses> list = new ArrayList<Courses>();
		Courses c1=null;
		try {
			String sql="Select * from magictouch.course";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				c1=new Courses();
				c1.setIdcourse(rs.getInt(1));
				c1.setCname(rs.getString(2));
				c1.setCtype(rs.getString(3));
				c1.setCprice(rs.getString(4));
				c1.setPhoto(rs.getString(5));
				c1.setCdetails(rs.getString(6));
				list.add(c1);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
