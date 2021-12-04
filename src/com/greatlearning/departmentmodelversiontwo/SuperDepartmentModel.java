package com.greatlearning.departmentmodelversiontwo;

public class SuperDepartmentModel {
	//Data Members
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodayAHoliday;

	//No Arguments Constructor
	public SuperDepartmentModel() {
	}

	//Parametric Constructor
	public SuperDepartmentModel(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = isTodayAHoliday;
	}

	//Setter & Getter Methods
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getGetTodaysWork() {
		return getTodaysWork;
	}

	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}

	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}

	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}

	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}

	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}



}
