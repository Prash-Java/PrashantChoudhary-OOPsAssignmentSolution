package com.greatlearning.departmentservice;

public class SuperDepartment {
	//Data Members Of This Parent Class
	private String departmentNameField = "Super Department";
	private String getTodaysWorkField = "No Work as of now";
	private String getWorkDeadlineField = "Nil";
	private String isTodayAHoliday = "Today is not a Holiday";

	//No-arguments Constructor
	public SuperDepartment() {	
	}

	//Defining four properties as requirements for this class
	public String departmentName() {
		return departmentNameField;
	}

	public String getTodaysWork() {
		return getTodaysWorkField;
	}

	public String getWorkDeadline() {
		return getWorkDeadlineField;
	}

	public String isTodayAHoliday() {
		return isTodayAHoliday;
	}
}
