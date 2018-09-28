package com.ds.trees;

public class MirrorTree {

/*
 Algorithm – Mirror(tree):

(1)  Call Mirror for left-subtree    i.e., Mirror(left-subtree)
(2)  Call Mirror for right-subtree  i.e., Mirror(right-subtree)
(3)  Swap left and right subtrees.
          temp = left-subtree
          left-subtree = right-subtree
          right-subtree = temp
	
 */
	public void mirror(Node root) {
		System.out.print("\n Original Image : ");
		print(root);
		Node x = mirrorTree(root);
		System.out.print("\n Mirror Image : ");
		print(x);
	}

	public Node mirrorTree(Node root) {
		
		if (root != null) {
			Node t = root.left;
			root.left = root.right;
			root.right = t;
			mirrorTree(root.right);
			mirrorTree(root.left);
		}
		return root;
	}

	public void print(Node root) {
		
		if (root != null) {
			print(root.left);
			System.out.print("" + root.data);
			print(root.right);
		}
	}

	// Recursive Way to create Mirror of Tree
//	Time Complexity is O(n) since all nodes of both trees are visited in the worst case.
	public void convertToMirror(Node root) {
		
		if(root == null)
			return;
		
		// Mirror left subtree
		convertToMirror(root.left);
		// Mirror right subtree
		convertToMirror(root.right);
		
		// Interchange left and right subtree root nodes
		Node t = root.left;
		root.left = root.right;
		root.right = t;
	}
	
	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	public static void main(String[] args) {

		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		MirrorTree i = new MirrorTree();
		//i.mirror(root);
		
		System.out.println("original Image : ");
		i.display(root);
		
		i.convertToMirror(root);
		
		System.out.println(" \n Mirror Image : ");
		i.display(root);
		
	}

}
