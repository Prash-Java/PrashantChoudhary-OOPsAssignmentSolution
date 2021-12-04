package com.greatlearning.departmentservice;

public class TechDepartment extends SuperDepartment {
	//Data Members Of This Child Class
	private String departmentNameField = "Tech Department";
	private String getTodaysWorkField = "Complete coding of Module 1";
	private String getWorkDeadlineField = "Complete by EOD";
	private String getTechStackInformationField = "Core Java";

	//No-arguments Constructor
	public TechDepartment() {
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
	public String getTechStackInformation() {
		return getTechStackInformationField;
	}



}
