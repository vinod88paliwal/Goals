package com.ds.circularlist;

public class CircularLinkedList {

	private Node head;
	private Node tail;
	
	// Inner class to create Node in list
		private class Node {
			private int data;
			private Node next;

			public Node(int data) {
				this.data = data;
				this.next = null;
			}
		}// End of inner Class Node

		
	public void addAtFront(int data) {
		Node node = new Node(data);
		
		if(head == null ) {
			head = node;
			tail =node;
			head.next = head;
		}
		else {
			//Node temp = head;
			node.next =head;
			head = node;
			tail.next =node; //OR tail.next =head;
		}
	}

	public void addLast(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			head.next = head;
		} else {
			node.next = head;
			tail.next = node;
			tail = node;
		}
	}
	
	public int countNodes()
	{
		int count=0;
		Node tmp = head;
		
		do {
			count++;
			tmp = tmp.next;
		} while (tmp != head);
		
		return count;
	}

	public void deleteFromStart() {

		if (head == null) {
			System.out.println("List is Empty");
		} else {
			System.out.println("deleting node " + head.data + " from start");
			
			head = head.next;
			tail.next = head;
		}
		
	}
	
	public void deleteFromEnd() {
		
		if (tail == null) {
			System.out.println("List is Empty");
		} else {
			  if(tail.next==tail) tail = null; // Single node in linked list
			  
			  Node newTail = tail;
			  
			  while(newTail.next != tail)
				  newTail = newTail.next; // Find previous node to tail
				  
			  newTail.next = tail.next; // OR newTail.next = head;
			  tail= newTail.next;
		}
	}

	public void deleteNodeGivenKey(int x) {
		
		if(head.data == x)
		{
			Node next =  head.next;
			head = null;
			head = next;
			return;
		}	
		Node tmp = head;
		
		 while (tmp.next != head)
		 {
			 if(tmp.data == x)
			 {
				 tmp = tmp.next.next;
				 break;
			 }
			 tmp = tmp.next;
		 }
		 
		 if(tmp.next == head)
			 System.out.println("Key  not found!!!");
	}
	
	public String toString() {
		String output = "";
		Node temp = head;

		if (temp != null) {
			do {
				// if (currentNode.data != null)
				output += "[ " + temp.data + " ]";
				temp = temp.next;
			}while (temp != head);
		}
		return output;
	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();

		list.addAtFront(10);list.addAtFront(20); list.addAtFront(30);
		list.addLast(55);
		System.out.println("Data--> "+list);		
		
		System.out.println("Count of Nodes in the list--> "+list.countNodes());		
		  
		/*list.deleteFromStart();
		System.out.println("Data--> "+list);*/
	
	/*	list.deleteFromEnd();
		System.out.println("Data--> "+list);*/
		
		list.deleteNodeGivenKey(30);
		System.out.println("Data--> "+list);
		
		

	}

}
