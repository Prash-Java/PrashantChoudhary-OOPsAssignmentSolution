package com.greatlearning.departmentmodelversiontwo;

public class TechDepartmentModel extends SuperDepartmentModel {

	//Data Member For This Class
	private String getTechStackInformation;

	//No Arguments Constructor
	public TechDepartmentModel() {	
	}

	//Parametric Constructor
	public TechDepartmentModel(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super(departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday);
	}

	//Getter & Setter Methods
	public String getGetTechStackInformation() {
		return getTechStackInformation;
	}

	public void setGetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;
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
