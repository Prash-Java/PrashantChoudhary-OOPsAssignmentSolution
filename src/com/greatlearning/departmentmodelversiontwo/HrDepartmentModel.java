package com.greatlearning.departmentmodelversiontwo;

public class HrDepartmentModel extends SuperDepartmentModel {
	//Data Member for this class
	private String doActivity;
	//No Arguments Constructor
	public HrDepartmentModel() {
	}
	//Parametric Constructor
	public HrDepartmentModel(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
	}

	//Setter & Getter Methods with usage of super keyword for using parent class data members,methods
	public String getDoActivity() {
		return doActivity;
	}

	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}

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
