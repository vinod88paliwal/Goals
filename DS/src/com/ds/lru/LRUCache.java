package com.ds.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private DoublyLinkedList pageList;
	private Map<Integer, Node> pageMap;
	private final int cacheSize;

	public LRUCache(int cacheSize) {

		this.cacheSize = cacheSize;
		this.pageList = new DoublyLinkedList(cacheSize);
		this.pageMap = new HashMap<Integer, Node>();
	}

	public void accessPage(int pageNumber) {
		Node pageNode = null;

		if (pageMap.containsKey(pageNumber)) {
			// If page is present in the cache, move the page to the start of list
			pageNode = pageMap.get(pageNumber);
			pageList.movePageToHead(pageNode);

		} else {
			// If the page is not present in the cache, add the page to the cache
			if (pageList.getCurrSize() == cacheSize) {
				// If cache is full, we will remove the tail from the cache pageList
				// Remove it from map too
				pageMap.remove(pageList.tail.pageNumber);
			}

			pageNode = pageList.addPageToList(pageNumber);
			pageMap.put(pageNumber, pageNode);
		}
	}

	public static void main(String[] args) {
		int cacheSize = 4;
		LRUCache cache = new LRUCache(cacheSize);

		cache.accessPage(4);
		cache.printCacheState();
		cache.accessPage(2);
		cache.printCacheState();
		cache.accessPage(1);
		cache.printCacheState();
		cache.accessPage(1);
		cache.printCacheState();
		cache.accessPage(4);
		cache.printCacheState();
		cache.accessPage(3);
		cache.printCacheState();
		cache.accessPage(7);
		cache.printCacheState();
		cache.accessPage(8);
		cache.printCacheState();
		cache.accessPage(3);
		cache.printCacheState();

	}

	public void printCacheState() {

		pageList.printList();
		System.out.println();
	}

	class DoublyLinkedList {

		private Node head, tail;
		// private Node tail;
		private final int size;
		private int currSize;

		public DoublyLinkedList(int size) {
			this.size = size;
			currSize = 0;
		}

		public Node addPageToList(int pageNumber) {

			Node pageNode = new Node(pageNumber);

			if (head == null) {
				head = tail = pageNode;
				currSize = 1;
				return pageNode;

			} else if (currSize < size)
				currSize++;
			else {
				tail = tail.prev;
				tail.next = null;
			}
			pageNode.next = head;
			head.prev = pageNode;
			head = pageNode;
			return pageNode;
		}

		public void movePageToHead(Node pageNode) {

			if (pageNode == null || pageNode == head)
				return;

			if (pageNode == tail) {
				tail = tail.prev;
				tail.next = null;
			}

			Node prev = pageNode.prev;
			Node next = pageNode.next;

			prev.next = next;
			if (next != null)
				next.prev = prev;

			pageNode.prev = null;
			pageNode.next = head;
			head.prev = pageNode;
			head = pageNode;
		}

		public void printList() {
			if (head == null)
				return;

			Node temp = head;

			while (temp != null) {

				System.out.println(temp);
				temp = temp.next;
			}
		}

		public int getCurrSize() {
			return currSize;
		}

		public void setCurrSize(int currSize) {
			this.currSize = currSize;
		}

		public int getSize() {
			return size;
		}
	}

	class Node {
		private int pageNumber;
		private Node prev;
		private Node next;

		public Node(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public String toString() {
			return pageNumber + " ";
		}
	}
}
