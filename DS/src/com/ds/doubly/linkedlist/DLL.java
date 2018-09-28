package com.ds.doubly.linkedlist;

public class DLL {

	 Node head;
	
	class Node{
		
		int data;
		Node prev;
		Node next;
		
		 // Constructor to create a new node
        // next and prev is by default initialized as null
			Node(int d){
				data = d;
			}
		}//End of Node Inner class
	
	
	//Adding a node at the front of the list
	public void add(int new_data) {
		
		Node new_Node = new Node(new_data);
		
		/* 3. Make next of new node as head and previous as NULL */
		new_Node.next =head;
		new_Node.prev =null;
		
		/* 4. change prev of head node to new node */
		  if(head != null) 
			  head.prev = new_Node;
		  
		  /* 5. move the head to point to the new node */
		  head = new_Node;
	}

	/* Given a node as prev_node, insert a new node after the given node */
	public void InsertAfter(Node prev_Node,int new_data) {
		
		/*1. check if the given prev_node is NULL */
	    if(prev_Node == null) {
	        System.out.println("The given previous node cannot be NULL ");
	        return;
	    }
	    
	    Node new_node = new Node(new_data);
	    
	    /* 2. Make next of new node as next of prev_node */
	      new_node.next = prev_Node.next;
	      
	    /* 3. Make the next of prev_node as new_node */
	      prev_Node.next = new_node;
	      
	    /* 4. Make prev_node as previous of new_node */
	      new_node.prev = prev_Node;
	      
	    /* 5. Change previous of new_node's next node */
	     if(new_node.next != null)
	    	 	new_node.next.prev = new_node;
	}

	/* Given a node as prev_node, insert a new node before the given node */
	public void InsertBefore(Node next_Node, int new_data) {
	
		/*1. check if the given next_Node is NULL */
			if(next_Node == null) {
				System.out.println("The given next node cannot be NULL ");
				return;
			}
			
		Node new_Node = new Node(new_data);
		
		/* 2. set next and prev of new node */
		new_Node.prev =next_Node.prev;
		new_Node.next =next_Node;
	
	  /* 3. change prev of next_Node node to new node */
		next_Node.prev = new_Node;
		
	 /*4.  */
		  if(new_Node.prev != null) 
			  new_Node.prev.next = new_Node;
		  else
		    head = new_Node; // given node is head, so modify head with the newly created node
}
	
	// Add a node at the end of the list
	public void append(int new_data) {
	
		Node new_node = new Node(new_data);
		
		Node last = head;/* used in step 3*/

		/* 1. This new node is going to be the last node, so make next of it as NULL*/
		new_node.next = null;
		
		/* 2. If the Linked List is empty, then make the new node as head */
			if(head == null) {
				new_node.prev =null;
				head = new_node;
				return;
			}
				
		/* 3. Else traverse till the last node */		
		   while (last.next != null) 
			 last = last.next;
		 
		 /* 4. Change the next of last node */
		   	last.next  = new_node;
		   	
		 /* 5. Make last node as previous of new node */
		   	new_node.prev = last;
	}
	
	/*      ***********  Delete Function in a Doubly Linked List  **********
    
    Time Complexity: O(1)

    head_ref --> pointer to head node pointer.
    del  -->  pointer to node to be deleted. */
    public void deleteNode( Node del) {
    			
    	//base case
    			if(head == null || del == null)
    				return;
    
    	 /* If node to be deleted is head node */
    			if(head == del)
    				head = del.next;
    			
    	/* Change next only if node to be deleted is NOT the last node */
    			if(del.next != null)
    				del.next.prev = del.prev;
    			
    	/* Change prev only if node to be deleted is NOT the first node */
    			if(del.prev != null)
    				del.prev.next = del.next;
    			
    	  return;		
    }
    
    /* Function to delete the node at the given position in the doubly linked list */
    public void deleteNodeAtGivenPos(int n)
 	{
    	/* if list in NULL or invalid position is given */
  	  if(head == null || n < 0)
  		  return;
  
     /* traverse up to the node at position 'n' from the beginning */
          Node tmp = head;
          for(int i=0; tmp != null && i < n; i++)
          	tmp = tmp.next;
  	  
     /* if 'n' is greater than the number of nodes or node is not found as tmp is 'null' in the doubly linked list */
          if(tmp == null)
          	return;
          
     /* Change next only if node to be deleted is NOT the last node */
         if(tmp.next != null )
      	   tmp.next.prev =   tmp.prev;
  	
     /* Change prev only if node to be deleted is NOT the first node */     
         if(tmp.prev != null)
      	   tmp.prev.next = tmp.next; 
 	}
	
    
	public void deleteDuplicates() {

		if (head == null)
			return;

		Node p = head;
		Node q = head.next;

		while (q != null) {

			if (p.data == q.data) {
				p.next = q.next;
				q.next = null;
				q = p.next;
			} else {
				p = q;
				q = q.next;
			}
		}
	}
	
	public void deleteDuplicatesUnsortedDLL() {

		System.out.println("deleteDuplicatesUnsortedDLL()");
		
		Node p = head;
		Node q = head;

		while (p != null) {
			q = p.next;

			//System.out.println(p.data +"=="+ q.data);
			while( q != null)
			{
				if(p.data == q.data)
				{
					if(q.prev != null)
					q.prev.next = q.next;
					
					if(q.next != null)
					q.next.prev = q.prev;
					
						q.next = null;
						q = p.next;
				} else 
					q = q.next;
			}
			p = p.next;
		}
	}	
	
    
    /* function to delete all occurrences of the given key 'x' */
    public void deleteAllOccurOfX(int x)
    {
    	/* if list is empty */
    		if (head == null)
    			  return;
    		
    		Node tmp = head;
    	/* traverse the list up to the end */	
    		while(tmp.next != null)
    		{
    			/* if node found with the value 'x' */
    			 if(tmp.data == x)
    			 {
    				 tmp.next.prev = tmp.prev;
    	    			tmp.prev.next = tmp.next;
    	    			
    	    		 tmp = tmp.next;
    	    	  }
    	    	   else /* else simply move to the next node */
    	    			tmp = tmp.next;
    		 }
    }   
    
    /* *************** Function to reverse a Doubly Linked List ************* */
    public void reverse()
    {
    		Node temp = null;
    		Node current = head;
    		
    		/* swap next and prev for all nodes of doubly linked list */	
    		while (current != null) {
		
    			temp = current.prev;
    			current.prev = current.next;
    			current.next = temp;
    			current = current.prev;
			}
    		
    		 /* Before changing head, check for the cases like empty list and list with only one node */
    			if(temp != null)
    					head = temp.prev;
    }//Time Complexity: O(n)
    
	 public void reverse1() {
		Node temp = head;
		Node tempHead = head;

		while (temp != null) {
			Node prev = temp.prev;
			Node next = temp.next;
			temp.prev = next;
			temp.next = prev;

			tempHead = temp;
			temp = next;
		}

		//return tempHead;
		head = tempHead;
	}
   
	// Function to find pair whose sum equal to given value x.
	public void pairSum(int x)
	{
		// Set two pointers, first to the beginning and second to the end of DLL.
		Node first = head;
		Node second = head;
		while(second.next != null)
			second = second.next;
		
		boolean found = false;
		
	/* The loop terminates when either of two pointers become NULL,  
	   or they cross each other (second->next == first), or they become same (first == second)*/	
		while (first != null && second != null && first != second && second.next != first) {
	
			//pair found
			if((first.data + second.data) == x)
			{
				found =true;
				System.out.println("Pair : "+first.data+" "+second.data);
				
				first = first.next;
				second = second.prev;
			}
			else
			{
				if((first.data + second.data) > x)
					first = first.next;
				else
					second = second.prev;
			}
		}
		if(found == false)
			System.out.println("Pair not found!!");
	}//Time complexity : O(n)
	 
	public void sortedInsert(int x)
	{
		
	}
	
	public String toString(){
		String output="";
		
		Node currentNode = head;
		
		while(currentNode !=null){
			
			output += "[ "+currentNode.data+" ]";
			
			currentNode = currentNode.next;
		}
		return output;
	}
}
