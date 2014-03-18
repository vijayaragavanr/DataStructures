package datastr;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import datastr.ListStack;
/* Author : Vijayaragavan
 * Date	  : 16-03-2014
 * */
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
7       8   9 */

import datastr.BinaryTreeNode;
public class BinaryTreeUtils {
	
	public static void inOrderTraversalNonRecur(BinaryTreeNode root) {
		//ListNode currNode = new ListNode(root.getData());
		System.out.println("-----------------");
		System.out.println("Non Recursive In order traversal ");
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		//DynArrayStack stack = new DynArrayStack(200);
		while(true){
			while(root!=null) {
				stack.push(root);
				root = root.getLeft();
			}
			if(stack.isEmpty()){
				return;
			//	break;
			}
			root=stack.pop();
			System.out.print(root.getData() + " ");
			root=root.getRight();
		}
		//System.out.println("\n-----------------");

	}
	
	public static void slvlOrderTraversal (BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		System.out.println("---------------");
		while(!queue.isEmpty()){
			BinaryTreeNode currNode = queue.poll();
			System.out.print(currNode.getData() + " ");
			if(currNode.getLeft()!=null) queue.add(currNode.getLeft());
			if(currNode.getRight()!=null) queue.add(currNode.getRight());
		}
		System.out.println("---------------");
	}
	
	public static void postOrderTraversalNonRecur(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		System.out.println("-----------------");
		System.out.println("Post order traversal without recursion");
		while(true){
			if(root!=null){
				//System.out.println("stack contents " + root.getData());
				stack.push(root);
				root=root.getLeft();
			}
			else {
			if(stack.isEmpty()) {
				break;
			}
			else {
				BinaryTreeNode bst = stack.peek().getRight(); 
				if(bst==null) {
					root=stack.pop();
					System.out.print(root.getData() + " ");
					
					if(!stack.isEmpty()  && (stack.peek().getRight()!=null) && root== stack.peek().getRight()){
						System.out.print(stack.peek().getData() + " ");
						stack.pop();
						
					}
				}
				if(!stack.isEmpty()){
					root=stack.peek().getRight();
				}
				else root =null;
				
			}
			
				
			}
			}
		
		//System.out.println("\n-----------------");
	}
	
	public static void preOrderTraversalNonRecur(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		System.out.println("-----------------");
		System.out.println("Pre order traversal ");
		while(true){
			while(root!=null){
				System.out.print(root.getData() + " ");
				stack.push(root);
				root=root.getLeft();
			}
			if(stack.isEmpty()) break;
			root= stack.pop();
			root=root.getRight();
			//if (root!=null)
			//System.out.println(root.getData());
		}
		
		System.out.println("\n-----------------");
	}
	
	public void inorderTraversal(BinaryTreeNode root){
		if(root!=null){
			inorderTraversal(root.getLeft());
			System.out.println(root.getData());
			inorderTraversal(root.getRight());
		}
	}
	
	public void preOrderTraversal(BinaryTreeNode root){
		if(root!=null){
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}
	public void postOrderTraversal(BinaryTreeNode root){
		if(root!=null){
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}
	public int findMax(BinaryTreeNode root) {
		int root_val, max_left, max_right,max;
		root_val = root.getData();
		max_left = findMax(root.getLeft());
		max_right = findMax(root.getRight());
		max=Integer.MIN_VALUE;
		
		if(max_left<max_right) max = max_right;
		else max = max_right;
		
		if (max<root_val) max= root_val;
		
		return max;
	}
	
	public int findMaxNonRecurse(BinaryTreeNode root) {
		ListQueue Queue = new ListQueue();
		BinaryTreeNode tmp =root;
		//Queue.enque(root.)
		
		return 0;
	}
}
