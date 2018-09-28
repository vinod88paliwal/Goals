package com.ds.arrays;
import java.util.*;

public class CommonElementsFromMultipeArrays {

	
	
	public static void main(String[] args) {
	
	int arr1[] = {1,2,3};	
	int arr2[] = {3,4,5};	
	int arr3[] = {5,6,7};	
		
	Set set = new HashSet();
	boolean firstTime = true;
	
	for(int i=0; i< arr1.length; i++)
	{
		for(int j=0; j< arr1.length; j++)
		{
			set.add(arr1[i]);
		}
	}
		
	
	
	}

}
