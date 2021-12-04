package com.greatlearning.departmentserviceversiontwo;

import com.greatlearning.departmentmodelversiontwo.AdminDepartmentModel;

public class AdminDepartment extends SuperDepartment {

	//Instantiating object from data/model class
	AdminDepartmentModel adminDepartmentModel = new AdminDepartmentModel();

	//No-arguments Constructor
	public AdminDepartment() {
		super();
	}

	//Defining three properties as requirements for this class with method overriding
	public String departmentName() {
		adminDepartmentModel.setDepartmentName("Admin Department");
		return adminDepartmentModel.getDepartmentName();
	}

	public String getTodaysWork() {
		adminDepartmentModel.setGetTodaysWork("Complete your documents submission");
		return adminDepartmentModel.getGetTodaysWork();
	}

	public String getWorkDeadline() {
		adminDepartmentModel.setGetWorkDeadline("Complete by EOD");
		return adminDepartmentModel.getGetWorkDeadline();
	}

}
