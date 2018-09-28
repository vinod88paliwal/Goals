package com.vinod.analytical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateUsingHashSet {
public static void main(String[] args) {
	
	List<Integer> numbers = new ArrayList<Integer>();
	numbers.add(10);
	for (int i = 1; i < 30; i++) {
		numbers.add(i);
	}
	numbers.add(30); numbers.add(25); numbers.add(25);
	finddupeInt(numbers);
	
	List<String> s = new ArrayList<String>();
	s.add("Hello"); s.add("Ram"); s.add("Hello");s.add("Sita");
	finddupeString(s);
}

private static void finddupeString(List<String> strNos) {

	HashSet<String> totalString = new HashSet<String>();
	
	for(String str : strNos){
	
		if(!totalString.add(str))
			System.out.println("Duplicate: "+str);
	}
}

private static void finddupeInt(List<Integer> numbers) {

	HashSet<Integer> nos = new HashSet<Integer>();

	for(Integer no : numbers){
		
		if(!nos.add(no)){
			System.out.println("Duplicate no: "+no);
		}
	}
}

}
