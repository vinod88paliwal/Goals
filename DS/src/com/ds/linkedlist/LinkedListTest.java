package com.ds.linkedlist;

import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
	//LinkedList myList = new LinkedList();
		
		// myList.add(60);  myList.add(60); myList.add(50); myList.add(40); myList.add(40); myList.add(20); myList.add(20); 
		 
	//	myList.add(10);  myList.add(10); myList.add(20); myList.add(20); myList.add(30); myList.add(30); myList.add(40); myList.add(40); myList.add(40); 
		 
	 //myList.add(10);  myList.add(8);  myList.add(10); myList.add(3); myList.add(10); myList.add(1); 
	
	//myList.add(10);  myList.add(8);  myList.add(11); myList.add(3); myList.add(9); myList.add(1); 
	
	//myList.get(13);
		//System.out.println("Data->> : "+myList);
		//myList.uniqueElements();
		
		
		//System.out.println("isPalindrome : "+myList.isPalindrome());
		
		/*myList.deleteGreaterNodes(2);
		System.out.println("Data11->> : "+myList);
	*/	
	//	System.out.println("Is Sorted : "+myList.isSorted());
		
		// myList.detectAndRemoveLoopInLinkedList();
		 
		 //System.out.println("Data111->> : "+myList);
		//myList.printReverseList();
		
		//myList.printNthFromLast(3);
		
		//myList.printMiddle();
		
		//myList.deleteMiddle();
		//System.out.println("After Deletion Data->> : "+myList);
		/*
		myList.DeleteDuplicates();
		System.out.println("After Deleting duplicate Data->> : "+myList);
		
		myList.detectLoop();
		*/
/*		
	 Iterator<Integer> it= myList.iterator();
		
		while (it.hasNext()) {
			Object obj = it.next();
			//myList.add(50);  //java.util.ConcurrentModificationException
		
		System.out.println("Data : "+obj);
	
		}
*/			
	/*	
		LinkedList l = new LinkedList();
		
		l.add(10); l.add(20); 
		//l.addFirst(30);
		
		l.add(30); l.add(40); l.add(50); l.add(60); l.add(70); l.add(80);l.add(90); l.add(100);
		
		//First Para : How many nodes to be traveled.
		//Second Para : Many nodes to be deleted.
		//l.deleteChoice(2, 3);
		
		//l.add(250, 3);
		System.out.println(l);
		
		System.out.println("Size: "+l.size());
		
		
		//l.reverse();
		
		System.out.println("Reversed List: "+l);
		System.out.println("Size: "+l.size());
*/	
		//myList.moveTailToFront();
		//System.out.println("List after moving last to front --> : "+myList);
		
		/*** InterSection and Union ****/
		LinkedList llist1 = new LinkedList();
		LinkedList llist2 = new LinkedList();

		List intersect = new java.util.LinkedList();
		List union = new java.util.LinkedList();
		
		/*create a linked list 10->15->4->20 */
		llist1.add(20);
		llist1.add(4);
		llist1.add(15);
		llist1.add(10);

		/*create a linked list 8->4->2->10 */
		llist2.add(10);
		llist2.add(2);
		llist2.add(4);
		llist2.add(8);

		intersect = llist1.getInterSection(llist1,llist2);
		union     = llist1.getUnion(llist1, llist2);

		System.out.println("First List is");
		System.out.println(llist1);

		System.out.println("Second List is");
		System.out.println(llist2);

		System.out.println("Intersection List is");
		System.out.println(intersect);

		System.out.println("Union List is");
		System.out.println(union);
	
		}
}
