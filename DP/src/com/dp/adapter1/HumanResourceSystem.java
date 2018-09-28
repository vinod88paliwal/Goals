package com.dp.adapter1;

public class HumanResourceSystem {

	public static String[][] getEmployees(){
		
		String[][] employees = new String[4][];
		
		employees[0] = new String[] {"101","Dave","Team Leader"};
		employees[1] = new String[] {"102","Ram","Developer"};
		employees[2] = new String[] {"103","Ramesh","Developer"};
		employees[3] = new String[] {"104","Raj","Tester"};
		
		return employees;
	}
	
	public static void main(String[] args) {
		
		ITarget target = new EmployeeAdapter();
		System.out.println("HR system passes Employee string array to Adapter" );
		
		target.processCompanySalary(getEmployees());
	}
}
