package com.greatlearning.departmentservice;

public class AdminDepartment extends SuperDepartment {
	//Data Members Of This Child Class
	private String departmentNameField = "Admin Department";
	private String getTodaysWorkField = "Complete your documents submission";
	private String getWorkDeadlineField = "Complete by EOD";

	//No-arguments Constructor
	public AdminDepartment() {
		super();
	}

	//Defining three properties as requirements for this class with method overriding
	public String departmentName() {
		return departmentNameField;
	}

	public String getTodaysWork() {
		return getTodaysWorkField;
	}

	public String getWorkDeadline() {
		return getWorkDeadlineField;
	}

}
