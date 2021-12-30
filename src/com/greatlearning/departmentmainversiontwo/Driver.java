//Building Department Application Version Second--Using main,service and modal packages and their classes
package com.greatlearning.departmentmainversiontwo;

import com.greatlearning.departmentserviceversiontwo.AdminDepartment;
import com.greatlearning.departmentserviceversiontwo.HrDepartment;
import com.greatlearning.departmentserviceversiontwo.SuperDepartment;
import com.greatlearning.departmentserviceversiontwo.TechDepartment;

public class Driver {

	//Parent Class Reference
	public static SuperDepartment superDepartment;

	//Child Classes Reference
	public static AdminDepartment adminDepartment;
	public static HrDepartment hrDepartment;
	public static TechDepartment techDepartment;

	//Starting point for Java application
	public static void main(String[] args) {
		//Initializing All Child Classes As Per Requirements Using Upcasting
		superDepartment = new AdminDepartment();
		displayProperties(superDepartment);
		superDepartment = new HrDepartment();
		displayProperties(superDepartment);
		superDepartment = new TechDepartment();
		displayProperties(superDepartment);		
	}

	//Code Reuse So That Any Child Class Properties Can Be Handled Having Same Behaviors and Attributes Using Parent Class And Upcasting
	public static void displayProperties(SuperDepartment superDepartment) {
		System.out.println("Welcome to " + superDepartment.departmentName());
		//Call to specific Method of one of child class as this method not available in Parent Class
		if(superDepartment.getClass().toString().contains("HrDepartment")) {
			System.out.println(new HrDepartment().doActivity());
		}
		System.out.println(superDepartment.getTodaysWork());
		System.out.println(superDepartment.getWorkDeadline());
		if(superDepartment.getClass().toString().contains("TechDepartment")) {
			System.out.println(new TechDepartment().getTechStackInformation());
		}
		System.out.println(superDepartment.isTodayAHoliday());
		System.out.println("\n\n");
	}

	/*Below constitutes Another Way Using Method Overloading for displaying properties of respective child classes Without Using Parent Classes
	 *  or Upcasting, this is commented but can be used as well, which is already presented in version 1 of solution
	 */
	/*
		public static void displayProperties(AdminDepartment adminDepartment) {
			System.out.println("Welcome To " + adminDepartment.departmentName());
			System.out.println(adminDepartment.getTodaysWork());
			System.out.println(adminDepartment.getWorkDeadline());
			System.out.println(adminDepartment.isTodayAHoliday());
			System.out.println("\n\n");
		}
		
		public static void displayProperties(HrDepartment hrDepartment) {
			System.out.println("Welcome To " + hrDepartment.departmentName());
			System.out.println(hrDepartment.doActivity());
			System.out.println(hrDepartment.getTodaysWork());
			System.out.println(hrDepartment.getWorkDeadline());
			System.out.println(hrDepartment.isTodayAHoliday());
			System.out.println("\n\n");
		}
		
		public static void displayProperties(TechDepartment techDepartment) {
			System.out.println("Welcome To " + techDepartment.departmentName());
			System.out.println(techDepartment.getTodaysWork());
			System.out.println(techDepartment.getWorkDeadline());
			System.out.println(techDepartment.getTechStackInformation());
			System.out.println(techDepartment.isTodayAHoliday());
			System.out.println("\n\n");
		}
*/
}
