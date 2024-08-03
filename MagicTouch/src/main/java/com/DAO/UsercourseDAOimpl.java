package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Enrolluser;

public class UsercourseDAOimpl implements UsercourseDAO {
private Connection conn;
	
	public UsercourseDAOimpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addEnrolluser(Enrolluser en) {
		boolean f=false;
		try {
			
		String sql="INSERT INTO magictouch.user_course (cname,ctype,cprice,cdetails,uid)"
				+ "VALUES(?,?,?,?,?)";
	;
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, en.getCname());
			ps.setString(2, en.getCtype());
			ps.setString(3, en.getCprice());
			ps.setString(4, en.getCdetails());
			ps.setInt(5,en.getUid());
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
	
	

}
