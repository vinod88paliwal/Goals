package optionalclass;

import java.util.Optional;

public class OptionalExample2 {

	public static void main(String[] args) { 
		
        String[] str = new String[10];        
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
        
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        
        checkNull.ifPresent(System.out::println);   // printing value by using method reference  
        
        System.out.println(checkNull.get());    // printing value by using get method  
        System.out.println(str[5].toLowerCase());     
    
	}  
	
}
