package com.cg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Training;
import com.cg.util.DBUtil;

public class TrainingDaoImpl implements TrainingDao{

	Connection con=DBUtil.getConnect();
	
	@Override
	public ArrayList<com.cg.bean.Training> getTraining() {
		// TODO Auto-generated method stub
		 ArrayList<Training> al=new ArrayList<Training>();
			String qry="select * from Training";
			try
			{
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(qry);
				while(rs.next())
				{
					int tid=rs.getInt(1);
					String tname=rs.getString(2);
					int tav=rs.getInt(3);
					al.add(new Training(tid,tname,tav));
				}
			
		    }
			catch(Exception e)
			{
	          System.out.println(e.getMessage());
	        }
			return al;
	}
	
}
