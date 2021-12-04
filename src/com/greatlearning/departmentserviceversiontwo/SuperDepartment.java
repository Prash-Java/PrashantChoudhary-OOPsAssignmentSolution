package com.greatlearning.departmentserviceversiontwo;

import com.greatlearning.departmentmodelversiontwo.SuperDepartmentModel;

public class SuperDepartment {
	//Instantiating object from data/model class
	SuperDepartmentModel superDepartmentModel = new SuperDepartmentModel();

	//No-arguments Constructor
	public SuperDepartment() {	
	}

	//Defining four properties as requirements for this class
	public String departmentName() {
		superDepartmentModel.setDepartmentName("Super Department");
		return superDepartmentModel.getDepartmentName();
	}

	public String getTodaysWork() {
		superDepartmentModel.setGetTodaysWork("No Work as of now");
		return superDepartmentModel.getGetTodaysWork();
	}

	public String getWorkDeadline() {
		superDepartmentModel.setGetWorkDeadline("Nil");
		return superDepartmentModel.getGetWorkDeadline();
	}

	public String isTodayAHoliday() {
		superDepartmentModel.setIsTodayAHoliday("Today is not a Holiday");
		return superDepartmentModel.getIsTodayAHoliday();
	}
}
