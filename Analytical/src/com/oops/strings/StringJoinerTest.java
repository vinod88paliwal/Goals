package com.oops.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringJoinerTest {

	public static void main(String[] args) {
		//1. StringJoiner
		
		//1.1 Join String by a delimiter
		StringJoiner sj = new StringJoiner(",");
				sj.add("aaa");
				sj.add("bbb");
				sj.add("ccc");
				
				
		String s = sj.toString();
		System.out.println("StringJoiner : "+s);
				
		//1.2 Join String by a delimiter and starting with a supplied prefix and ending with a supplied suffix.
		StringJoiner sj1 = new StringJoiner("/","prefix-","-suffix");
					sj1.add("02");
					sj1.add("05");
					sj1.add("2018");
		
		String s1 = sj1.toString();
		System.out.println("StringJoinerPS : "+s1);
				
		
	//2. String.join -> StringJoiner is used internally by static String.join().
			//2.1 Join String by a delimiter.
		
		String s2 = String.join("/", "02","05","2018");
		System.out.println("String.join : "+s2);
		
		//2.2 Join a List by a delimiter.
		List l = Arrays.asList("Java","J2EE","GoLang","Docker");
		String s3 = String.join(",", l);
		System.out.println("Join a List : "+s3);
  
	//3. Collectors.joining 
	//3.1 Join List<String> and and Collectors.joining.	
		
	List<String> list =  Arrays.asList("Java","J2EE","GoLang","Docker");
	String s4 = list.stream().map(x -> x).collect(Collectors.joining("|"));
	System.out.println("Collectors.joining : "+s4);
		
	//Join List<Object> nd and Collectors.joining	
		
	  List<Game> gameList = Arrays.asList(
			  new Game("Dragon Blaze", 5),
              new Game("Angry Bird", 5),
              new Game("Candy Crush", 5)
			  );

	String s5 = gameList.stream().map(m -> m.getName()).collect(Collectors.joining("," , "{" , "}"));
									//OR
	//String s5 = gameList.stream().map(Game:: getName).collect(Collectors.joining("," , "{" , "}"));
			System.out.println("Collectors.joining with list of Objects : "+s5);
	
	}
}


class Game{
    String name;
    int ranking;
    
	public Game(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
}