package com.greatlearning.departmentservice;

public class HrDepartment extends SuperDepartment {
	//Data Members Of This Child Class
	private String departmentNameField = "HR Department";
	private String getTodaysWorkField = "Fill today’s timesheet and mark your attendance";
	private String getWorkDeadlineField = "Complete by EOD";
	private String doActivityField = "team Lunch";

	//No-arguments Constructor
	public HrDepartment() {
		super();
	}

	//Defining three properties as requirements for this class using method overriding
	public String departmentName() {
		return departmentNameField;
	}

	public String getTodaysWork() {
		return getTodaysWorkField;
	}

	public String getWorkDeadline() {
		return getWorkDeadlineField;
	}

	//method explicitly for this class blueprint only
	public String doActivity() {
		return doActivityField;
	}

}
