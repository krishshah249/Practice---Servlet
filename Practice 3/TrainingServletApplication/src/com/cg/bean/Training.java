package com.cg.bean;

public class Training {
	int trainingId;
	String trainingName;
	int available;
public Training() {
	// TODO Auto-generated constructor stub
}
public Training(int trainingId, String trainingName, int available) {
	super();
	this.trainingId = trainingId;
	this.trainingName = trainingName;
	this.available = available;
}
public int getTrainingId() {
	return trainingId;
}
public void setTrainingId(int trainingId) {
	this.trainingId = trainingId;
}
public String getTrainingName() {
	return trainingName;
}
public void setTrainingName(String trainingName) {
	this.trainingName = trainingName;
}
public int getAvailable() {
	return available;
}
public void setAvailable(int available) {
	this.available = available;
}

}
