package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection con;
	static{
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getCon(){
		
		if(con!=null){
			System.out.println("Connected");
			return con;
			
		}
			
		else{
			
			System.out.println("Not Connected");
			return null;
		}
			
		
	}

}
