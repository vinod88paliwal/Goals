package com.collectios.basics;

import java.util.Comparator;

/**
 * Comparator implementation which sorts Person objects on person_id field
 */
public class SortByPerson_ID implements Comparator{

    @Override
	public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        return p1.getPersonId() - p2.getPersonId();
    }
    
    
}
