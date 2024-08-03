package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Feedback;
import com.entity.User;

public class FeedDAOimpl implements FeedDAO {
	private Connection conn;
	public FeedDAOimpl(Connection conn) {
		super();
		this.conn = conn;
	}
	@Override
	public boolean addfeedback(Feedback f) {
		boolean f1=false;
		try {
			
			String sql="insert into magictouch.feedback(name,mobno,email,address,messege)values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, f.getName());
			ps.setString(2, f.getMobno());
			ps.setString(3, f.getEmail());
			ps.setString(4, f.getAddress());
			ps.setString(5, f.getMessege());
			int i=ps.executeUpdate();
			if(i==1)
			{
				f1=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f1;
	}
	
	
	
	@Override
	public boolean Deletefeed(int id) {
		boolean f=false;
		try {
			
			String sql ="DELETE FROM `magictouch`.`feedback` where idfeedback=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;	
		}
	
	@Override
	public List<Feedback> getAllFeedback() {
		List<Feedback> list =new ArrayList<Feedback>();
		Feedback f=null;
		try {
			String sql="SELECT * FROM magictouch.feedback";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				f=new Feedback();
				f.setIdffedback(rs.getInt(1));
				f.setName(rs.getString(2));
				f.setMobno(rs.getString(3));
				f.setEmail(rs.getString(4));
				f.setAddress(rs.getString(5));
				f.setMessege(rs.getString(6));
				list.add(f);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	
}
