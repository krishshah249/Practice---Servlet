package com.cg.service;

import com.cg.bean.Login;
import com.cg.dao.LoginDao;
import com.cg.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	
	LoginDao dao;
	
	public LoginServiceImpl(){
		dao= new LoginDaoImpl();
	}

	@Override
	public Login loginUser(Login user) {
		// TODO Auto-generated method stub
		
		return dao.loginUser(user);
	}

}
