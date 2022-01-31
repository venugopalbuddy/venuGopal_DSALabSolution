package com.lab3.question_2;



import com.lab3.question_2.LongestBranchOfBST.Node;


public class LongestBranchOfBSTDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		LongestBranchOfBST longestbranchofbst = new LongestBranchOfBST();
		Node root = LongestBranchOfBST.NewNode(100);
	    root.left = LongestBranchOfBST.NewNode(20);
	    root.right = LongestBranchOfBST.NewNode(130);
	    root.left.left = LongestBranchOfBST.NewNode(10);
	    root.left.left.left=LongestBranchOfBST.NewNode(5);
	    root.left.right=LongestBranchOfBST.NewNode(50);
	    root.right.left=LongestBranchOfBST.NewNode(110);
	    root.right.right=LongestBranchOfBST.NewNode(140);
	    System.out.println("The height of the root node is: "+longestbranchofbst.calculateHeight(root));
	    System.out.print("The longest path is: ");
	    longestbranchofbst.printLongestBranch(root);
		
	}

}
