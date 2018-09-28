package com.collectios.basics;

public class Person implements Comparable {
    private int personId;
    private String name;
    /**
     * Compare current person with specified person
     * return zero if person_id for both person is same
     * return negative if current person_id is less than specified one
     * return positive if current person_id is greater than specified one
     */
    @Override
    public int compareTo(Object o) 
    {
      Person p = (Person) o;
      return (this.getName().compareTo(p.getName()));
       //or      
  //  return this.personId - p.personId ;
    }
   
    public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}

