
package com.ds.doubly.linkedlist;

public class DLLTest {

	public static void main(String[] args) {
		
		DLL list = new DLL();
		
		//list.add(10); list.add(20); list.add(20); list.add(40); list.add(40); list.add(40);
		list.add(2); list.add(10); list.add(8); list.add(10);list.add(5);list.add(2);
		System.out.println( "DLL list : "+list);
		
	/*	
		list.InsertBefore(list.head.next,90);
		System.out.println( "DLL list after adding at first: "+list);
		
		list.InsertAfter(list.head.next,90);
		System.out.println( "DLL list before : "+list); */
		
		/*list.deleteNode(list.head);		
		System.out.println( "DLL list after deletion1 : "+list);
		list.deleteNode(list.head.next);		
		System.out.println( "DLL list after deletion2 : "+list);
		list.deleteNode(list.head.next);		
		System.out.println( "DLL list after deletion3 : "+list);*/
		
		//list.reverse();
		/*list.reverse1();
		System.out.println( "DLL list after reverse : "+list);*/
		
	//	list.pairSum(30);
		
		/*list.deleteNodeAtGivenPos(2);
		System.out.println( "DLL list after deletion : "+list);*/
		
		/*list.deleteDuplicates();
		System.out.println( "DLL list after duplicate deletion : "+list);*/
		
		list.deleteDuplicatesUnsortedDLL();
		System.out.println( "DLL list after duplicate deletion in Unsorted DLL: "+list);
		
		/*list.deleteAllOccurOfX(40);
		System.out.println( "DLL list after deletion of X "+list);*/
	}
	
}
