package com.lab3.question_2;

public class LongestBranchOfBST {

	static class Node{
		int key,height;
		Node left,right;
	}
	static Node NewNode(int data) {
		Node temp = new Node();
		temp.key=data;
		temp.left=null;
		temp.right=null;
		temp.height=0;
		return temp;
	}
	public int getHeight(Node N) {
		if (N==null) {
			return 0;
		}
		return N.height;
	}
	public int findMax(int a,int b) {
		return (a>b)?a:b;
	}
	/*public int getBalanceFactor(Node N) {
		if (N==null) {
			return 0;
		}
		return getHeight(N.left)-getHeight(N.right);
	}*/

	int calculateHeight(Node root) {
		if (root!=null) {
			int left_tree_height=calculateHeight(root.left);
			int right_tree_height=calculateHeight(root.right);
			return root.height=1+ findMax(left_tree_height,right_tree_height);
		}
		else {
		 return -1;
		}
	}
	public void printLongestBranch(Node root) {
		System.out.print(root.key+"->");
		if (root.left==null && root.right==null) {
			return;
		}
		if (root.left!=null && root.right!=null) {
			if(root.right.height>root.left.height) {
				printLongestBranch(root.right);
			}
			else if (root.left.height>=root.right.height) {
				printLongestBranch(root.left);
			}
		}
		else if (root.right!=null) {
			printLongestBranch(root.right);
		}
		else {
			printLongestBranch(root.left);
		}
	}
}
