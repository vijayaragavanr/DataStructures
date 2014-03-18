package datastr;

public class DoubleListNode {
/* Author : Vijayaragavan
 * Date	  : 16-03-2014
 * */
	private int data;
	private DoubleListNode prevNode;
	private DoubleListNode nextNode;
	
	public DoubleListNode (int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleListNode getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(DoubleListNode prevNode) {
		this.prevNode = prevNode;
	}
	public DoubleListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoubleListNode nextNode) {
		this.nextNode = nextNode;
	}
	
}
