package com.ds.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
Binary Search Tree, is a node-based binary tree data structure which has the following properties:
   The left subtree of a node contains only nodes with keys lesser than the node’s key.
   The right subtree of a node contains only nodes with keys greater than the node’s key.
   The left and right subtree each must also be a binary search tree.
   There must be no duplicate nodes.
 */

public class BST {

	Node root,root1,root2;

	//Time Complexity: O(h), : Height of a tree.
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	private Node insertRec(Node root, int data) {
		Node newNode = new Node(data);
		
		/* If the tree is empty, return a new node */
		  if(root == null)
			  return  newNode;
		  
		  /* Otherwise, recur down the tree to create left and right subtree*/
		  if(data < root.data)
			  root.left = insertRec(root.left, data);
		  
		  else if(data > root.data)
			  root.right = insertRec(root.right, data);
		
	   return root;	  
	}
	
	public void addNode(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Node current = root;
		Node parent;

		while (true) {
			parent = current;

			if (data < parent.data) {
				current = current.left;

				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	//Time Complexity: O(n) where n is number of nodes in given binary tree.
	public int heightRecursion(Node root) {
		
		if(root == null)
			return 0;
		return 1 + Math.max(heightRecursion(root.left), heightRecursion(root.right)) ;
	}
	
	//Time Complexity: O(n) where n is number of nodes in given binary tree.	
	public int heightLoop(Node root) {
		
		if(root == null)
			return 0;
		
	 // Create an empty queue for level order tarversal
		Queue<Node> q = new LinkedList();
		
	// Enqueue Root and initialise height
		q.add(root);
		int height =0;
		
		while (true) {
			// nodeCount (queue size) indicates number of nodes at current level.	
			int nodeCount = q.size();
			
			if(nodeCount ==0)
					return height;
			height++;

			// Dequeue all nodes of current level and Enqueue all nodes of next level	
			while (nodeCount >0) {
				
				Node newNode = q.poll();
				
				if(newNode.left != null)
					q.add(newNode.left);
				if(newNode.right != null)
					q.add(newNode.right);
				
				nodeCount--;
			}
		}
	}
	
	public void printRootToLeafPathRec(Node root, List<Integer> path) {
		
			if(root == null) return;
			
			path.add(root.data);
			
			if(root.left == null && root.right == null) {
				printPaths(path);
				path.remove(path.size() - 1);
			}else {

				printRootToLeafPathRec(root.left, path);
				printRootToLeafPathRec(root.right, path);
				path.remove(path.size() - 1);
			}
	}
	
	void printPaths(List<Integer> path) {
		System.out.println("");
		
		Iterator<Integer> it =  path.iterator();
		
		while (it.hasNext()) {
			
			System.out.print(it.next());
			
			if(it.hasNext())
				System.out.print("->");
		}
	}
	
//To delete a tree we must traverse all the nodes of the tree and delete them one by one. 
//So which traversal we should use â€“ Inorder or Preorder or Postorder. Answer is simple â€“ Postorder, 
//because before deleting the parent node we should delete its children nodes first	.
//Time Complexity: O(n)
	public void deleteTree(Node root ) {

		if(root == null)  return;
			
		
		 /* first delete both subtrees */
		deleteTree(root.left);
		deleteTree(root.right);
		
        System.out.println("The deleted node is " + root.data);

    	/* then delete the node */
        root=null;
	}
	
	//Check whether Node with requested value exists or not
	public boolean find(int data) {

		Node current = root;

		while (current != null) {

			if (current.data == data)
				return true;
			else if (data < current.data)
				current = current.left;
			else
				current = current.right;
		}
		return false;
	}
	
	//This functions converts an unbalanced BST to a balanced BST	
	public void buildBSTTree(Node root) {
/*	Time Complexity: O(n)
    Traverse given BST in inorder and store result in an array. This step takes O(n) time. Note that this array would be sorted as inorder traversal of BST always produces sorted sequence.
    Build a balanced BST from the above created sorted array using the recursive approach discussed here. This step also takes O(n) time as we traverse every element exactly once and processing an element takes O(1) time.
		
*/		// Store nodes of given BST in sorted order
		List<Node> nodesList = new ArrayList<Node>();
		storeBSTNodes(root , nodesList);
		
		// Constucts BST from nodes[]
		int size = nodesList.size();
		Node rootBST=	buildTreeUtil(nodesList ,0, size-1);
		
		 preOrderTravseTree(rootBST);
	}
	
	/* This function traverse the skewed binary tree and stores its nodes pointers in ArrayList nodes[] */
	private void storeBSTNodes(Node root , List<Node> nodesList) {
		
		if(root == null) return;
		
	 //Store nodes in Inorder (which is sorted order for BST)
		storeBSTNodes(root.left, nodesList);
		nodesList.add(root);
		storeBSTNodes(root.right, nodesList);
	}
	
	/* Recursive function to construct binary tree */
	private Node buildTreeUtil(List<Node> nodesList, int start , int end) {
		
		if(start > end) 
			return null;
		
		 /* Get the middle element and make it root */
		int mid = (start + end) /2;
		Node root = nodesList.get(mid);
		
		/* Using index in Inorder traversal, construct left and right subtress */
		root.left = buildTreeUtil(nodesList, start, mid-1);
		root.right = buildTreeUtil(nodesList,mid+1, end);
		
		return root;
	}
	
	
/*	
An empty tree is height-balanced. A non-empty binary tree T is balanced if:
1) Left subtree of T is balanced
2) Right subtree of T is balanced
3) The difference between heights of left subtree and right subtree is not more than 1. 	
*/	
	//Time Complexity is O(n)
	/* Returns true if binary tree with root as root is height-balanced */
	public boolean isHeightBalanceTree(Node root) {
		
		if(root == null)
			 return true;
		
		int lh; /* for height of left subtree */
		int rh; /* for height of right subtree */
		
		/* Get the height of left and right sub trees */
		lh =heightRecursion(root.left);
		rh = heightRecursion(root.right);
		
		if(Math.abs(lh - rh) <= 1 && isHeightBalanceTree(root.left) && isHeightBalanceTree(root.right))
			return true;
		
	 /* If we reach here then tree is not height-balanced */
	  return false;	
	}
	
	
/*	
To identify if two trees are identical, we need to traverse both trees simultaneously, and while traversing we need to compare data and children of the trees
Algorithm:
sameTree(tree1, tree2)
1. If both trees are empty then return 1.
2. Else If both trees are non -empty
     (a) Check data of the root nodes (tree1->data ==  tree2->data)
     (b) Check left subtrees recursively  i.e., call sameTree( 
          tree1->left_subtree, tree2->left_subtree)
     (c) Check right subtrees recursively  i.e., call sameTree( 
          tree1->right_subtree, tree2->right_subtree)
     (d) If a,b and c are true then return 1.
3  Else return 0 (one is empty and other is not)

*/
	/* Given two trees, return true if they are structurally identical */
	public boolean isTreesIdentical(Node root1, Node root2) {
		
		 /*1. both empty */
			if(root1 == null && root2 == null)
				return true;
			
	     /* 2. both non-empty -> compare them */	
			if(root1 != null && root2 != null )
				return (root1.data == root2.data && isTreesIdentical(root1.left, root2.left) && isTreesIdentical(root1.right, root2.right));
			
		/* 3. one empty, one not -> false */	
			return false;
	}
	
	//Note : This method not working now.
	 // Iterative method to find height of Bianry Tree
 	public boolean areIdentical(Node root1, Node root2) {

		 /*1. both empty */
			if(root1 == null && root2 == null)
				return true;
		
			// Create an empty queues for simultaneous traversals 
		    Queue<Node> q1 = new LinkedList<Node>();
		    Queue<Node> q2 = new LinkedList<Node>();
		    
		 // Enqueue Roots of trees in respective queues
		    q1.add(root1); q2.add(root2);
			
		/* 2. both non-empty -> compare them */	
			while(!q1.isEmpty() && !q2.isEmpty()) {
				
				// Get front nodes and compare them
				 Node node1 = q1.remove();  Node node2 = q2.remove();
			    
				 if(node1.data != node2.data)
					 return false;
				 
				 /* Enqueue left children of both nodes */
				 if(node1.left != null && node2.left != null) {
					 q1.add(node1.left); 
					 q2.add(node2.left);
				 
				 }else  // If one left child is empty and other is not
					 return false;
				 
				 /* Enqueue right children of both nodes */
				 if(node1.right != null && node2.right != null) {
					 q1.add(node1.right); 
					 q2.add(node2.right);
				 
				 }else  // If one right child is empty and other is not
					 return false;
			}
			
		/* 3. one empty, one not -> false */	
		return false;
	}
	
 	
 	public Node mirrorTree(Node root) {
 		
 		if(root != null) {
 			
 			Node t = root.left;
 			root.left = root.right;
 			root.right = t;
 			
 			mirrorTree(root.right);
 			mirrorTree(root.left);
 		}
 		return root;
 	}
	
	
	public void preOrderTravseTree(Node root) {
		
		if(root != null) {
			System.out.println(root.data);
			preOrderTravseTree(root.left);
			preOrderTravseTree(root.right);
		}
	}

	public void postOrderTravseTree(Node root) {
		
		if(root != null) {
			preOrderTravseTree(root.left);
			preOrderTravseTree(root.right);
			System.out.println(root.data);
		}
	}
	
	public void inOrderTravseTree(Node root) {
		
		if(root != null) {
			preOrderTravseTree(root.left);
			System.out.println(root.data);
			preOrderTravseTree(root.right);
		}
	}
	
	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
		//System.out.println("Tree is empty!!!");
	}

//Testing the APIs.	
public static void main(String[] args) {
		
		BST tree = new BST();
//		tree.addNode(10); tree.addNode(20); tree.addNode(30); tree.addNode(40); tree.addNode(50);
	/*	tree.insert(10); tree.insert(20); tree.insert(30); tree.insert(40); tree.insert(50);	
		tree.display(tree.root);
		System.out.println();
		System.out.println("Height : "+tree.heightLoop(tree.root));
	*/	
		//System.out.println(tree.find(2));
		
		//Node root = new Node(5);
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        //tree.root.right.right = new Node(6);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
		//tree.root.left.right = new Node(25);
		/*root.left.left.left =new Node(30);
		root.left.right.left = new Node(35);
		root.left.right.left.left = new Node(40);
		root.left.right.left.left.right = new Node(45);
		root.left.right.left.left.right.left = new Node(50);*/

        //Find the Maximum Depth OR Height of a Binary Tree		
		//System.out.println("Height of Tree Rec : "+tree.heightRecursion(tree.root));
		//System.out.println("Height of Tree Loop : "+tree.heightLoop(tree.root));
		
		//tree.deleteTree(root);
		
		List<Integer> list= new ArrayList<Integer>();
		tree.printRootToLeafPathRec(tree.root, list);
		
		//tree.display(tree.root);
		
		
		/*tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(5);
		
		tree.buildBSTTree(tree.root);*/
	/*	
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
        
		System.out.println("Is Height Balance : "+tree.isHeightBalanceTree(tree.root));*/
		
		
		/*tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
  
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);*/
     //   System.out.println("Is Balance Identical? : "+tree.isTreesIdentical(tree.root1,tree.root2));
        
      //  System.out.println("Is Balance Identical? : "+tree.areIdentical(tree.root1,tree.root2));
        
        
        /*Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		Node root11 =  tree.mirrorTree(root);
        tree.inOrderTravseTree(root11);
        */
        
        
	}
}

class Node {

	int data;
	Node left;
	Node right;

	Node() {}
	
	Node(int d) {
		data = d;
		left = null;
		right = null;
	}
}