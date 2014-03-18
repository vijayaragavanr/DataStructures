package datastr;

public class BinaryTreeNode {
	/*
	 * Author : VIjayaragavan
	 * Date : 16-03-2014
	 * */
	int data;
	 BinaryTreeNode right;
	BinaryTreeNode left;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode(int data) {
		super();
		this.data = data;
	}
	
	
}
