package datastrTest;

import datastr.BinaryTreeNode;
import datastr.BinaryTreeUtils;

public class BinaryTreeTest {
	/*
	 * Tree Traversal for the following tree
	 *   1
        / \
       /   \
      /     \
     2       3
    / \     /
   4   5   6
  /       / \
 7       8   9
 
preorder :    	1 2 4 7 5 3 6 8 9
inorder  :      7 4 2 5 1 8 6 9 3
postorder:   	7 4 5 2 8 9 6 3 1
level-order: 	1 2 3 4 5 6 7 8 9
	 * */
	
public static void main(String[] args) {
	BinaryTreeNode root = new BinaryTreeNode(1);
	BinaryTreeNode nodeTwo = new BinaryTreeNode(2);
	BinaryTreeNode nodeThree = new BinaryTreeNode(3);
	BinaryTreeNode nodeFour = new BinaryTreeNode(4);
	BinaryTreeNode nodeFive = new BinaryTreeNode(5);
	BinaryTreeNode nodeSix = new BinaryTreeNode(6);
	BinaryTreeNode nodeSeven = new BinaryTreeNode(7);
	BinaryTreeNode nodeEight = new BinaryTreeNode(8);
	BinaryTreeNode nodeNine = new BinaryTreeNode(9);	
	
	root.setLeft(nodeTwo);
	root.setRight(nodeThree);
	
	nodeTwo.setLeft(nodeFour);
	nodeTwo.setRight(nodeFive);
	
	nodeFour.setLeft(nodeSeven);
	
	nodeThree.setLeft(nodeSix);
	
	nodeSix.setLeft(nodeEight);
	nodeSix.setRight(nodeNine);
	BinaryTreeUtils.preOrderTraversalNonRecur(root);
	BinaryTreeUtils.inOrderTraversalNonRecur(root);
	BinaryTreeUtils.postOrderTraversalNonRecur(root);
	BinaryTreeUtils.slvlOrderTraversal(root);
}
}
