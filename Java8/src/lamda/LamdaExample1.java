package lamda;
import java.util.*;
import java.util.function.Predicate;
public class LamdaExample1 {

	public static void main(String args[]){
		  List languagesList = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

		  System.out.println("Languages which starts with J :");
		  filter(languagesList, str->(((String) str).startsWith("J")));

		  System.out.println("Languages which ends with a ");
		  filter(languagesList, (str)->((String) str).endsWith("a"));

		  System.out.println("Print all languages :");
		  filter(languagesList, (str)->true);

		   System.out.println("Print no language : ");
		   filter(languagesList, (str)->false);

		   System.out.println("Print language whose length greater than 4:");
		   filter(languagesList, (str)->((String) str).length() > 4);
		}

	/*public static void filter(List<String> names, Predicate condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}
*/				   //OR

	//Even better
	 public static void filter(List names, Predicate condition) {
	    names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
	        System.out.println(name + " ");
	    });
	 }

/*	 
	//Even more better
		 public static void filter(List<String> names, Predicate<String> condition) {
		    names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
		        System.out.println(name + " ");
		    });
		 }
*/
}
