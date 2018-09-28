package com.ds.linkedlist;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedList {
	
	public Node head;
	private int modCount;
	private Node second_half = null;

	// Inner class to create Node in list
		private class Node {
			private int data;
			private Node next;

			public Node(int data) {
				this.data = data;
				this.next = null;
			}
		}// End of inner Class Node

		
	public Iterator iterator() {
        return new MyIterator();
    }
	
/*
	public LinkedList() {
		this.head = new Node();
		this.modCount = 0;
	}
*/
	//Time complexity of push() is O(1) as it does constant amount of work.	
	public void add(int data) {
  //This function Inserts a new Node at front of the list.
		/* 1 & 2: Allocate the Node & Put in the data*/
		Node new_node = new Node(data);
		
		/* 3. Make next of new Node as head */
		new_node.next =head;
		
		/* 4. Move the head to point to new Node */
		head = new_node;
		
		modCount++;
	}
	
	public void add (int index, int data) {

		if (index >= 0 && index <= modCount) {

			/* 1 & 2: Allocate the Node & Put in the data*/
			Node new_node = new Node(data);
			Node temp = head;

	  //search the  Node of given index, to add the new Node after it.	
			for (int i = 0; i < index; i++) //No need to check ( temp.next != null) as index is already less than modCount 
					temp = temp.next;

			new_node.next = temp.next;
			temp.next = new_node;
			modCount++;
		}
		
		else
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + modCount);
	}
	
//Time complexity of insertAfter() is O(1) as it does constant amount of work.	
	public void addAfter(int data, Node prev_Node) {
		
		 /* 1. Check if the given Node is null */
		if(prev_Node == null) {
			System.out.println("The given previous node cannot be null");
	        return;
		}
		
		/* 2 & 3: Allocate the Node & Put in the data*/
		Node new_node = new Node(data);
		
		 /* 4. Make next of new Node as next of prev_node */
		   new_node.next = prev_Node.next;
		   /* 5. make next of prev_node as new_node */  
		   prev_Node.next = new_node;
	}

/* Time complexity of append is O(n) where n is the number of nodes in linked list. Since there is a loop from head to end, 
 * the function does O(n) work.This method can also be optimized to work in O(1) by keeping an extra pointer to tail of linked list */	

	public void addAtEnd(int data) {
		
		/* 1 & 2: Allocate the Node & Put in the data*/
		Node new_node = new Node(data);
		
		/* 3. If the Linked List is empty, then make the new node as head */	
		if(head == null) {
			head = new_node;
			return;
		}
		
		/* 4. This new node is going to be the last node, so make next of it as null */	
		new_node.next =null;
		
		/* 5. Else traverse till the last node */		
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		
		/* 6. Change the next of last node */		
		temp.next = new_node;
		return;
	}

	public Object get (int index){
		if(index >= 0 && index <= modCount )
		{
			Node temp = head;

			//No need to check ( temp.next != null) as index is already less than modCount 
			for(int i=0; i<=index;  i++){
				temp = temp.next;
			}
			return temp.data;
		}
		else
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + modCount);
	} //Time Complexity: O(n)
	
	public void singlyToCircular()
	{
		Node temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		//if head->next points to NULL then start assign to the head->next node.
		temp.next = head;
	}
	
	//Checks whether the value x is present in linked list
	public boolean search(int x)
	{
		Node tmp = head;
		while(tmp != null)
		{
			if(tmp.data == x)
				return true; //data found
			
			tmp = tmp.next;
		}
		return false; //data not found
	}
	
	public boolean searchRec(int x)
	{
		Node tmp = head;
		return search(head,x);
	}
	private boolean search(Node head,int x)
	{   //base case
		if(head == null)
			return false;
		// If key is present in current node,return true
		 if(head.data == x)
			 return true;
		 
	   //Recur for remaining list
		 return search(head.next,x);
	}	
	
	public int getCount()
	{
		int count=0;
		Node tmp = head;
		while(tmp.next != null)
		{
			count++;
			tmp= tmp.next;
		}
		return count;
	}
	
	public int getCountRec()
	{
		return getCountRec(head);
	}
	private int getCountRec(Node head)
	{    //Base Case
		if(head == null)
			return 0;
		// Count is this node plus rest of the list
	   return 1 + getCountRec(head.next);	
	}
	
	/* Given a key, deletes the first occurrence of key in linked list */	
	public void deleteNode(int key) {
		
	// If head node itself holds the key to be deleted	
		if(head != null && head.data == key) {
			head = head.next;
			return;
		}
		
	//else Search for the key to be deleted, keep track of the previous node as we need to change temp.next	
		Node temp = head, prev= null;
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
	
		// If key was not present in linked list
		if(temp == null)
			return;
		
		// Unlink the node from linked list
		prev.next = temp.next;
	}
	
	/*deletes the node at the given position */
	public boolean deleteNodeOfGivenPosition(int index) {
		 
		if (index >= 0 && index <= modCount) {

		// If linked list is empty
		if(head == null)
			return false;
		
		// If head needs to be removed
		if(index ==0) {
			head = head.next;
			modCount--;
			return true;
		}

		Node temp = head;
		
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		modCount--;
		
		return true;
	} else
		throw new IndexOutOfBoundsException("Index: " + index + ", Size " + modCount);
	}
	
	// First Para : How many nodes to be travelled.
	// Second Para :How Many nodes to be deleted.
	public void deleteChoice(int noOfTraversal, int noOfNodesToBeDeleted) {

		Node temp = head;
		int modCount = 0;

		while (temp != null) {

			modCount++;
			temp = temp.next;

			if (modCount == noOfTraversal) {
				modCount = 0;

				for (int j = 1; j <= noOfNodesToBeDeleted; j++) {

					if (temp != null && temp.next != null)
						temp.next = temp.next.next;
				}
			}
		}
	}

	public void deleteMiddle() {

		if (head != null) {
			
		Node slow_ptr = head;
		Node fast_ptr = head;
		Node preNode = null;

			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				preNode = slow_ptr;
				slow_ptr = slow_ptr.next;
			}

			System.out.println("Middle element is being deleted : " + slow_ptr.data);

			// Delete the middle node
			preNode.next = slow_ptr.next;
		}
		else
			System.out.println("List is empty....");	
			
	}

	// Remove duplicates from a unsorted linked list
	public void DeleteDuplicates() {

		Node ptr1 = head;
		Node ptr2 = null;
		Node dup = null;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			/* Compare the picked element with rest of the elements */
			while (ptr2.next != null) {
				/* If duplicate then delete it */
				if (ptr1.data == ptr2.next.data)
					ptr2.next = ptr2.next.next;
				else
					ptr2 = ptr2.next;
			}
			ptr1 = ptr1.next;
		}
	}
	
	// Remove duplicates from sorted linked list
	public void DeleteDuplicatesFromSortedlist() {
		
		Node tmp =head;
		
		/* Pointer to store the next pointer of a node to be deleted*/
		Node next_next;
		
		/* do nothing if the list is empty */
		if(head == null)
			return;
	/* Traverse list till the last node */	
		while(tmp.next != null)
		{
			/*Compare current node with the next node */
			if(tmp.data == tmp.next.data)
			{
				next_next = tmp.next.next;
				tmp.next =null;
				tmp.next = next_next;
			}
			else
			tmp = tmp.next;
		}
	}
	
	// function to delete all the nodes from the list
	// that are greater than the specified value x
	public void deleteGreaterNodes( int x)
	{
		
		if(head != null && head.data > x) {
			head = head.next;
		}
		
		Node temp = head, prev=null;
		
		// Delete occurrences other than head
		while (temp != null) {
			
			//Search for the node to be deleted, keep track of the previous node as we need to change 'prev->next'
			while (temp != null && temp.data <=x) {
				prev = temp;
				temp = temp.next;
			}
			//If required value node was not present in linked list
			if (temp == null)
				return;
			
			prev.next = temp.next; //Unlink the node from linked list
			temp = prev.next;  //Update temp for next iteration of outer loop
		}
	} //Time Complexity: O(n)
	
	public void moveTailToFront()
	{
		/* If linked list is empty or it contains only one node then simply return. */
        if(head == null || head.next == null)
        	return;
        
        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;
        
    	/* After this loop secLast contains address of second last node and last contains address of last node in Linked List */   
        while(last.next != null)
        {
        	secLast = last;
        	last = last.next;
        }
        
      /* Set the next of second last as null, to make it as last node */    
        secLast.next =null;
        
     /* Set the next of last as head,to link first node (present in head) with this node (last node) */ 
        last.next =head;
    
     /* Change head to point to last node., To make it first node of the list */    
        head = last;
	}//Time Complexity: O(n)

//https://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/	
	private List getInterSection(Node head1, Node head2)
	 {
		Set<Integer> set = new HashSet<Integer>();
		List result = new java.util.LinkedList();
		
		Node n1 = head1;
		Node n2 = head2;
		
		// loop stores all the elements of list1 in Set.
			while(n1 != null)
			{
				set.add(n1.data);
				n1 = n1.next;
			}
			
	//For every element of list2 present in Set loop inserts the element into the result	
			while(n2 != null)
			{
				if(set.contains(n2.data))
					result.add(n2.data);
			 n2 = n2.next;	
			}
			
		return result;	
	}

//https://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/
	private List getUnion(Node head1, Node head2)
	{
		List result = new java.util.LinkedList();
		Set<Integer> set = new HashSet<Integer>();
		
		Node n1 = head1;
		Node n2 = head2;
		
		// loop stores all the elements of list1 in Set.
			while(n1 != null)
			{
			  if(! set.contains(n1.data))
				  set.add(n1.data);
			  else
				  n1 = n1.next;
			}
					
			//For every element of list2 present in Set loop inserts the element into the result	
					while(n2 != null)
					{
					  if(!set.contains(n2.data))
							  set.add(n2.data);
				     else
					   n2 = n2.next;	
					}
			// Eventually add all the elements into the result that are present in the Set
					result.addAll(set);
		
		return result;
	}
	
//Below are for testing.
	public List getInterSection(LinkedList head1, LinkedList head2)
	{
		return getInterSection(head1.head, head2.head);
	}
	
	public List getUnion(LinkedList head1, LinkedList head2)
	{
		return getUnion(head1.head, head2.head);
	}
	
	
	// function to Find the unique elements in linked lists
	void uniqueElements()
	{
		  //Base Condition
		   if (head == null || head.next ==  null)
			   return;
		   
		   Node temp = head;
		   Map<Integer,Integer> dupMap = new HashMap<Integer,Integer>();
		   
		   while(temp != null) {
			   
			   if(dupMap.containsKey(temp.data))
				   dupMap.put(temp.data, dupMap.get(temp.data)+1);
			   else
				   dupMap.put(temp.data, 1);
			   
			   temp = temp.next;
		   }
		   
		   Set<Integer> keys = dupMap.keySet();
		   System.out.print("Unique Elements : ");
		   for(int key : keys) {
			   
			   if(dupMap.get(key) == 1)
				   System.out.print(key+" ");
		   }
	}
	
	boolean isSorted() {
		   Node temp =head;
			
		   //Base Condition
		   if (head == null || head.next ==  null)
			   return true;
			   
		 //  temp = temp.next;//Its not needed, just a jugad.:)
		   
		   while (temp.next != null) {
			
			   if (temp.data > temp.next.data)
				   	return false;
			   else	   			
				    temp = temp.next; 
		   	}
			   return true;
		}
	
	/* Function to check if given linked list is Palindrome or not */
	boolean isPalindrome() {

		Node slow_p = head, fast_p = head, prev_of_slow_ptr = head;
		Node midNode = null; // To handle odd size list
		boolean res = false;

		if (head != null && head.next != null) {
			/*
			 * Get the middle of the list. Move slow_ptr by 1 and fast_ptrr by 2, slow_ptr
			 * will have the middle node
			 */

			while (fast_p != null && fast_p.next != null) {
				fast_p = fast_p.next.next;

				prev_of_slow_ptr = slow_p; /* We need previous of the slow_ptr for linked lists with odd elements */
				slow_p = slow_p.next;
			}

			/*
			 * fast_ptr would become NULL when there are even elements in the list and not
			 * NULL for odd elements. We need to skip the middle node for odd case and store
			 * it somewhere so that we can restore the original list
			 */
			if (fast_p != null) {
				midNode = slow_p;
				slow_p = slow_p.next;
			}

			// Now reverse the second half and compare it with first half
			second_half = slow_p;
			prev_of_slow_ptr.next =null;

			reverseLinkedListLoop();// Reverse the second half
			// printReverseList();

			res = compareLists(head, second_half); // compare

			/* Construct the original list back */
			reverseLinkedListLoop(); // Reverse the second half again
			// printReverseList();

			/*
			 * if(midNode != null) { // If there was a mid node (odd size case) which // was
			 * not part of either first half or second half.
			 * 
			 * prev_of_slow_ptr.setNext(midNode); midNode.setNext(second_half); }
			 * prev_of_slow_ptr.setNext(second_half);
			 */
		}
		return res;
	}

	private boolean compareLists(Node head1, Node head2) {

		Node temp1 = head1.next;
		Node temp2 = head2;
		
		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {

				temp1 = temp1.next;
				temp2 = temp2.next;
			} else
				return false;
		}
		/* Both are empty return true */
		if (temp1 == null && temp2.next == null)
			return true;

		/* Will reach here when one is NULL and other is not */
		return false;
	}

	private void reverseLinkedListLoop() {

		Node temp = head, prev = null, next = null;

		while (temp != null) {

			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}
	
	public void reverseLinkedListRecursive() {
        reverseLinkedListRecursive(head);
    }
	
	private void reverseLinkedListRecursive(Node curr) {
	
			if(curr == null)
				return;
			
			if(curr.next == null) {
				head = curr;
				return;
			}
			
			reverseLinkedListRecursive(curr.next);
			curr.next = curr;
			curr =null;
	}

	// Time Complexity: O(n)
	public void printReverseList() {
		reverseLinkedListLoop();
		//reverseLinkedListRecursive();
		System.out.print("Reverse List :==> ");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("Middle element is : " + slow_ptr.data);
		}
	}

	void findLoopInlinkedList() {

		/* Create loop for testing */
		// llist.head.next.next.next.next = llist.head;

		Node slow_p = head, fast_p = head;
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				System.out.println("Found loop");
				break;
			}
		}
		System.out.println("No Loop Found in the List");
	}

	public Node findStartNodeOfTheLoop() {
		Node slow_p = head, fast_p = head;
		boolean loopExists = false;

		while (fast_p != null && fast_p.next != null) {

			slow_p = slow_p.next;
			fast_p = fast_p.next.next;

			if (slow_p == fast_p) {
				loopExists = true;
				break;
			}
		  }

			if (loopExists) {

				slow_p = head;
				while (slow_p != fast_p) {
					slow_p = slow_p.next;
					fast_p = fast_p.next;
				}
			} else
				System.out.println("No Loop Found in the List");
		
		return slow_p;
	}

	// Detect and Remove Loop in a Linked List
	void detectAndRemoveLoopInLinkedList() {
		Node startNode = head;
		Node slowPointer = startNode;
		Node fastPointer = startNode;
		Node previousPointer = null;

		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			previousPointer = fastPointer.next; // For capturing just previous node of loop node for setting it to
														// null for breaking loop.
			fastPointer = fastPointer.next.next;

			if (slowPointer == fastPointer) { // Loop identified.
				slowPointer = startNode;

				// If loop start node is starting at the root Node, then we slowpointer,
				// fastpointer and head all point at same location.
				// we already capture previous node, just setting it to null will work in this
				// case.
				if (slowPointer == fastPointer) {
					previousPointer.next =null;

				} else {
					// We need to first identify the start of loop node and then by setting just
					// previous node of loop node next to null.
					while (slowPointer.next != fastPointer.next) {
						slowPointer = slowPointer.next;
						fastPointer = fastPointer.next;
					}
					fastPointer.next = null;
				}
			}
		}
		// return startNode;
	}

	/* Function to get the nth node from end of list */
	void printNthFromLast(int n) { // Time Complexity: O(n) where n is the length of linked list

		Node p1 = head;
		Node p2 = head;
		int count = 0;

		while (count < n) {

			if (p1 == null) {
				System.out.println(n + " is greater than the no of nodes in the list");
				return;
			}
			p1 = p1.next;
			count++;
		}

		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		System.out.println("Node no. " + n + "from last is " + p2.data);
	}
/*
Maintain two pointers – reference pointer and main pointer. Initialize both reference and main pointers to head. First move reference pointer to 
n nodes from head. Now move both pointers one by one until reference pointer reaches end. Now main pointer will point to nth node from the end.
Return main pointer.
*/	
	
	public String toString() {
		String output = "";

		Node temp = head;

		while (temp != null) {
			//if (currentNode.data != null)
				output += "[ " + temp.data + " ]";
				temp = temp.next;
		}
		return output;
	}
	
	//Inner class to create Custom Iterator
		class MyIterator implements Iterator {
			private	int expectedModCount = modCount;
			private	int current = 0;
			private Node lastReturned ;
			private Node next = head.next;
			
			public MyIterator() { }
			
			@Override
			public boolean hasNext() {
				if(current < modCount)
					return true;
				else
				return false;
			}

			@Override
			public Object next() {	
				checkForComodification();
				
				lastReturned = next;
				next = next.next;
				current++;
				
				return lastReturned.data ;
			}

			final private void checkForComodification() {
			    if (modCount != expectedModCount)
			        throw new ConcurrentModificationException();
			}
		}
}
