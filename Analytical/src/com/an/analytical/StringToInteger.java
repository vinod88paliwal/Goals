package com.an.analytical;

public class StringToInteger {
//Ascai code : 0 --> 48 & 9 -->57
	
	private int stringToInt(String str){
		int sum=0;
		
		for(int i=0; i<str.length(); i++ )
		{
			char c = str.charAt(i);
			//if(c !='\0'){
				System.out.println("C: "+c);
				
				if(c < 48 || c > 57){
		             System.out.println("Unable to convert it into integer.");
		             return 0;
		         }else {
		        	 System.out.println("no: "+c);
		        	 sum = sum*10 + (c - 48);
				}
			//}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		StringToInteger obj = new StringToInteger();
		int no =obj.stringToInt("12");
		System.out.println(no+2);
	}
}