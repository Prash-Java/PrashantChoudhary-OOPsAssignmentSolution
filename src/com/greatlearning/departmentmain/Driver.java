//Building Department Application Version First-- Here we are not instantiating Parent Class
package com.greatlearning.departmentmain;

import com.greatlearning.departmentservice.AdminDepartment;
import com.greatlearning.departmentservice.HrDepartment;
import com.greatlearning.departmentservice.TechDepartment;

public class Driver {

	//Instantiating Child Classes
	public static AdminDepartment adminDepartment;
	public static HrDepartment hrDepartment;
	public static TechDepartment techDepartment;

	//Starting point for Java application
	public static void main(String[] args) {
		//Initializing All Child Classes As Per Requirements
		adminDepartment = new AdminDepartment();
		displayProperties(adminDepartment);
		hrDepartment = new HrDepartment();
		displayProperties(hrDepartment);
		techDepartment = new TechDepartment();
		displayProperties(techDepartment);		
	}

	//Below constitutes Method Overloading for displaying properties of respective child classes
	public static void displayProperties(AdminDepartment adminDepartment) {
		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday()); 
		System.out.println("\n\n");
	}

	public static void displayProperties(HrDepartment hrDepartment) {
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday()); 
		System.out.println("\n\n");
	}

	public static void displayProperties(TechDepartment techDepartment) {
		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday()); 
	}

}
