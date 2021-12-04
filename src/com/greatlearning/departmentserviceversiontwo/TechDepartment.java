package com.greatlearning.departmentserviceversiontwo;

import com.greatlearning.departmentmodelversiontwo.TechDepartmentModel;

public class TechDepartment extends SuperDepartment {
	//Instantiating object from data/model class
	TechDepartmentModel techDepartmentModel = new TechDepartmentModel();

	//No-arguments Constructor
	public TechDepartment() {
		super();
	}

	//Defining three properties as requirements for this class using method overriding
	public String departmentName() {
		techDepartmentModel.setDepartmentName("Tech Department");
		return techDepartmentModel.getDepartmentName();
	}

	public String getTodaysWork() {
		techDepartmentModel.setGetTodaysWork("Complete coding of Module 1");
		return techDepartmentModel.getGetTodaysWork();
	}

	public String getWorkDeadline() {
		techDepartmentModel.setGetWorkDeadline("Complete by EOD");
		return techDepartmentModel.getGetWorkDeadline();
	}

	//method explicitly for this class blueprint only
	public String getTechStackInformation() {
		techDepartmentModel.setGetTechStackInformation("Core Java");
		return techDepartmentModel.getGetTechStackInformation();
	}

}
