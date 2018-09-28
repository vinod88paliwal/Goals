package optionalclass;

public class OptionalExample {
	
	public static void main(String[] args) {
	
		String[] str = new String[10];
		
		
		if(str[5] !=null)
		{
			String lowercaseString = str[5].toLowerCase();	
			System.out.print(lowercaseString);
		}
		else
		System.out.println("str[5] is null");
	}
}