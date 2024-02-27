package com.cg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;




import com.cg.bean.Login;
import com.cg.util.DBUtil;

public class LoginDaoImpl implements LoginDao{
	
	Connection con = DBUtil.getCon();

	@Override
	public Login loginUser(Login user) {
		// TODO Auto-generated method stub
		String qry= "select * from UserDetails";
		Login obj=null;
		try{
			Statement s= con.createStatement();
			ResultSet rs= s.executeQuery(qry);
			while(rs.next()){
				String uName=rs.getString(1);
				String pWd=rs.getString(2);
				if(uName.equals(user.getUsername())&& pWd.equals(user.getPassword())){
					obj=user;
					return obj;
				}
			}
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		return obj;
	}
	

}
