package com.greatlearning.departmentserviceversiontwo;

import com.greatlearning.departmentmodelversiontwo.HrDepartmentModel;

public class HrDepartment extends SuperDepartment {

	//Instantiating object from data/model class
	HrDepartmentModel hrDepartmentModel = new HrDepartmentModel();

	//No-arguments Constructor
	public HrDepartment() {
		super();
	}

	//Defining three properties as requirements for this class using method overriding
	public String departmentName() {
		hrDepartmentModel.setDepartmentName("HR Department");
		return hrDepartmentModel.getDepartmentName();
	}

	public String getTodaysWork() {
		hrDepartmentModel.setGetTodaysWork("Fill today’s timesheet and mark your attendance");
		return hrDepartmentModel.getGetTodaysWork();
	}

	public String getWorkDeadline() {
		hrDepartmentModel.setGetWorkDeadline("Complete by EOD");
		return hrDepartmentModel.getGetWorkDeadline();
	}

	//method explicitly for this class blueprint only
	public String doActivity() {
		hrDepartmentModel.setDoActivity("team Lunch");
		return hrDepartmentModel.getDoActivity();
	}

}
