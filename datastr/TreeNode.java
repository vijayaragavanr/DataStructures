package datastr;

public class TreeNode {

	/* Author : Vijayaragavan
	 * Date	  : 16-03-2014
	 * */
	int data;
	TreeNode First;
	TreeNode NextSibling;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getFirst() {
		return First;
	}
	public void setFirst(TreeNode first) {
		First = first;
	}
	public TreeNode getNextSibling() {
		return NextSibling;
	}
	public void setNextSibling(TreeNode nextSibling) {
		NextSibling = nextSibling;
	}
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	
	
}
