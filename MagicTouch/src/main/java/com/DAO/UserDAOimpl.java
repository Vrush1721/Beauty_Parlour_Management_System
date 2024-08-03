package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;
import com.mysql.cj.xdevapi.PreparableStatement;

public class UserDAOimpl implements UserDAO {
    
	private Connection conn;
	
	public UserDAOimpl(Connection conn) {
		super();
		this.conn = conn;
	}
	
	

	@Override
	public boolean userRegister(User us) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			String sql="insert into user(fname,mobno,email,address,password) values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,us.getFname());
			ps.setString(2,us.getMobno());
			ps.setString(3,us.getEmail());
			ps.setString(4,us.getAddress());
			ps.setString(5,us.getPassword());
			
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
	public List<User> getAllUser() {
		List<User> list =new ArrayList<User>();
		User u=null;
		try {
			String sql="SELECT * FROM magictouch.user";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				u=new User();
				u.setIdUser(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setMobno(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setAddress(rs.getString(5));
				list.add(u);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}



	@Override
	public User getUserById(int id) {
		User u=null;
		try {
			String sql ="select * from magictouch.user where idUser=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				u=new User();
				u.setIdUser(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setMobno(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setAddress(rs.getString(5));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}



	@Override
	public boolean Updateuser(User u) {
		boolean f=false;
		try {
			String sql ="UPDATE user SET fname=?, mobno=?,email=?,address=? WHERE idUser = ?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,u.getFname());
			ps.setString(2, u.getMobno());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getAddress());
			ps.setInt(5,u.getIdUser());
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
	public boolean Deleteuser(int id) {
		boolean f=false;
		try {
			
			String sql ="DELETE FROM `magictouch`.`user` where idUser=?";
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
	public User login(String email, String password) {
		User us=null;
	
		
		try {
			
			String sql="SELECT * FROM magictouch.user where email=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				us=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				//us.setIdUser(rs.getInt(1));
				//us.setFname(rs.getString(2));
				//us.setMobno(rs.getString(3));
				//us.setEmail(rs.getString(4));
				//us.setAddress(rs.getString(5));
				//us.setPassword(rs.getString(6));
					
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return us;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
