package com.vinod.analytical;

import java.util.Scanner;

public class PersonDetailsWithAgerCalculation {

	 public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	 
	        String fName, lName, gender;
	        int cYear, cMonth, cDay;
	        int bYear, bMonth, bDay;
	 
	 
	        System.out.print("Enter you first name: ");
	        fName= input.nextLine();
	 
	        System.out.print("Enter you last name: ");
	        lName= input.nextLine();
	 
	        System.out.print("Enter you Gender: ");
	        gender= input.nextLine();
	 
	 
	        System.out.print("Please Enter current Date: ");
	        cDay= input.nextInt();
	 
	        System.out.print("Please Enter current Month: ");
	        cMonth= input.nextInt();
	 
	        System.out.print("Please Enter current Year: ");
	        cYear= input.nextInt();
	 
	        System.out.println("-----BIRTHDAY INFORMATION-----");
	        System.out.print("Please Enter your Birth Date: ");
	        bDay= input.nextInt();
	 
	        System.out.print("Please Enter your Birth Month: ");
	        bMonth= input.nextInt();
	 
	        System.out.print("Please Enter your Birth Year: ");
	        bYear= input.nextInt();
	 
	        PersonDetailsWithAgerCalculation pd = new PersonDetailsWithAgerCalculation();
	        Person access = pd.new Person(fName, lName, gender);
	        System.out.println("Name: "+access.getFullName());
	        System.out.println(access.getAge(cYear, cMonth, cDay, bYear, bMonth, bDay));
	         
	 
	    }
	 	
//Person Pojo	
	public class Person
	{
	    private String fName;
	    private String lName;
	    private String sex;
	     
	    private int year;
	    private int month;
	    private int day;
	     
	 
	    public Person()
	    {
	        fName="";
	        lName="";
	        sex="";
	         
	        year=0;
	        month=0;
	        day=0;
	    }
	    public Person(String fName1, String lName1, String gender)
	    {
	        fName=fName1;
	        lName=lName1;
	        sex=gender;
	        
	    }
	    public String getFName()
	    {
	        return fName;
	    }
	    public void setFName(String fName1)
	    {
	        fName=fName1;
	    }
	    public String getLName()
	    {
	        return lName;
	    }
	    public void setLName(String lName1)
	    {
	        lName=lName1;
	    }
	    public String getSex()
	    {
	        return sex;
	    }
	    public void setSex(String gender)
	    {
	        sex=gender;
	    }
	    public int getYear()
	    {
	        return year;
	    }
	    public void setYear(int year1)
	    {
	        year=year1;
	    }
	    public int getMonth()
	    {
	        return month;
	    }
	    public void setMonth(int month1)
	    {
	        month=month1;
	    }
	    public int getDay()
	    {
	        return day;
	    }
	    public void setDat(int day1)
	    {
	        day=day1;
	    }
	    public String getFullName()
	    {
	        if(sex.equals("f"))
	        {
	            return "Ms. "+ fName + " "+lName;
	          
	        }
	        else
	        {
	           return "Mr. "+ fName +" "+lName;
	        }
	    }
	    public String getAge(int cYear, int cMonth, int cDay, int bYear, int bMonth, int bDay)
	    {
	         
	        String result="";
	        int tYear;
	        if((cYear>bYear) && (cMonth==bMonth))
	        {
	            if(cDay==bDay)
	            {
	               tYear=cYear-bYear;
	               result= "Happy " + tYear + "th birthday!";
	            }
	            else if(cDay>bDay)
	            {
	               tYear=cYear-bYear;
	               result= "Current Age: " + tYear + " years old.";
	            }
	            else if(cDay<bDay)
	            {
	                tYear=(cYear-1)-bYear;
	               result= "Current Age: " + tYear + " years old.";
	            }
	        }
	        else if((cYear > bYear) && (cMonth > bMonth))
	        {
	            tYear=cYear-bYear;
	            result= "Current Age: " + tYear + " years old.";
	        }
	        else if((cYear > bYear) && (cMonth < bMonth))
	        {
	            tYear=(cYear-1)-bYear;
	            result= "Current Age: " + tYear + " years old.";
	        }
	        else if(cYear<bYear)
	        {
	            result= "Wrong Input. Age Calculation Failed.";
	        }
	        return result;
	 
	    }
	             
	}

}
