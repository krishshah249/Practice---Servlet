package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Training;
import com.cg.dao.TrainingDao;
import com.cg.dao.TrainingDaoImpl;

public class TrainingServiceImpl implements TrainingService{
	TrainingDao dao=new TrainingDaoImpl(); 
	public ArrayList<Training> getTraining() {
		// TODO Auto-generated method stub
		return dao.getTraining();
		
}
}
