package com.dp.adapter1;

import java.util.ArrayList;

public class ThirdPartyBillingSystem {

	public void processSalary(ArrayList<Employee> employeeList){
		
		for (Employee emp : employeeList) {
			
			System.out.print(emp+" : ");
			
			if(emp.getDesignation().equalsIgnoreCase("Team Leader")){
				System.out.println("70000Rs Salary created to "+emp.getName()+" Account \n");
			}
			else if(emp.getDesignation().equalsIgnoreCase("Developer")){
				System.out.println("40000Rs Salary created to "+emp.getName()+" Account \n");
			}
			else if(emp.getDesignation().equalsIgnoreCase("Tester")){
				System.out.println("30000Rs Salary created to "+emp.getName()+" Account \n");
			}
		}
		
	}

}
