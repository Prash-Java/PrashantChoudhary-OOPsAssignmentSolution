package com.greatlearning.departmentmodelversiontwo;

public class AdminDepartmentModel extends SuperDepartmentModel {
	//No Arguments Constructor
	public AdminDepartmentModel() {
	}
	//Parametric Constructor
	public AdminDepartmentModel(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
	}

	//Setter & Getter Methods using super keyword to manipulate parent class data variables and/or methods
	public String getDepartmentName() {
		return super.getDepartmentName();
	}

	public void setDepartmentName(String departmentName) {
		super.setDepartmentName(departmentName);
	}

	public String getGetTodaysWork() {
		return super.getGetTodaysWork();
	}

	public void setGetTodaysWork(String getTodaysWork) {
		super.setGetTodaysWork(getTodaysWork);
	}

	public String getGetWorkDeadline() {
		return super.getGetWorkDeadline();
	}

	public void setGetWorkDeadline(String getWorkDeadline) {
		super.setGetWorkDeadline(getWorkDeadline);
	}

	public String getIsTodayAHoliday() {
		return super.getIsTodayAHoliday();
	}

	public void setIsTodayAHoliday(String isTodayAHoliday) {
		super.setIsTodayAHoliday(isTodayAHoliday);
	}

}
