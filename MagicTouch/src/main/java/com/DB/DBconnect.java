package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
    private static Connection conn;
    public static Connection getConn(){
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/magictouch","root","RootVrush");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	return conn;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
