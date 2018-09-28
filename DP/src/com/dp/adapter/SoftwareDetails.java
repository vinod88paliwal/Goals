package com.dp.adapter;

import java.util.Map;
import java.util.TreeMap;

public class SoftwareDetails {
	static Map<String,Data> dataMap = new TreeMap<String,Data>();

public static void main(String[] args) {
	
	dataMap.put("Ubuntu", new Data("Ubuntu Server","16.04"));
	dataMap.put("MySQL", new Data("MySQL","5.5"));
	dataMap.put("Python", new Data("Python","2.7.11"));
	
	SoftwareDetails obj = new SoftwareDetails();
	System.out.println(obj.getStatusOfSoftware("Ubuntu", "15.05"));
	System.out.println(obj.getStatusOfSoftware("MySQL", "5.7"));
	System.out.println(obj.getStatusOfSoftware("Python", "2.7.12"));
	
}	
	
public String getStatusOfSoftware(String sname, String ver) {
	
	Data data = dataMap.get(sname);   
	int res = data.compareVersion(ver);
	
	if(res < 0)
		return "We have latest version";
	else
		return "Thank you giving latest version";
	
}
}

 class Data  {
		
		private String software_name;
		private String version;
		
		public Data(String software_name, String version) {
			this.software_name = software_name;
			this.version = version;
		}

		
		public int compareVersion(String v1) {
			
			int vnum1 =0, vnum2 =0;
			
			for(int i=0,j=0 ; (i<v1.length() || j< this.version.length()); ) {
				
				while (i< v1.length() && v1.charAt(i) != '.' ) {
					vnum1 = vnum1 * 10 + (v1.charAt(i) - '0');
					i++;
				}
				
				while (j< this.version.length() && this.version.charAt(j) != '.' ) {
					vnum2 = vnum2 * 10 + (this.version.charAt(j) - '0');
					j++;
				}
				
				if(vnum1 > vnum2)
					return 1;
				if(vnum2 > vnum1)
					return -1;
				
				vnum1 = vnum2 = 0;
				i++;
				j++;
			}
			return 0;
		}
}