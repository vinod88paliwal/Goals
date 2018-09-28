package com.dp.adapter1;

import java.util.ArrayList;

public class EmployeeAdapter extends ThirdPartyBillingSystem implements ITarget 
{
	@Override
	public void processCompanySalary(String[][] employeeinfo) 
	{
		 String empId =null;
		 String name=null;
		 String designation=null;
		
		 ArrayList<Employee> employeeList = new ArrayList<Employee>();
		 
		 for(int i = 0; i < employeeinfo.length ; i++)
		 {
			 for(int j = 0; j < employeeinfo[i].length ; j++)
			 {
				 		if(j == 0)
				 		{
				 			empId = employeeinfo[i][j];
				 		}
				 		else if(j == 1)
				 		{
				 			name = employeeinfo[i][j];
				 		}
				 		else
				 		{
				 			designation = employeeinfo[i][j];
				 		}
			 }
			 employeeList.add(new Employee(Integer.parseInt(empId), name, designation));
		 }

		 processSalary(employeeList);
	}

}
