package datastr;
import datastr.ListNode;
public class ListStack {
/* Author : Vijayaragavan
 * Date	  : 16-03-2014
 * */
	ListNode headNode;
	public ListStack(ListNode headNode){
		this.headNode = headNode;
	}
	public int size() {
		int size=0;
		ListNode currNode = headNode;
		while(currNode!=null) {
			size++;
			currNode = currNode.getNext();
		}
		return size;
	}
	public boolean isEmpty() {
		return (this.headNode==null);
	}
	public void push (int data){
		if(headNode == null) {
			headNode = new ListNode(data);
			return;
		}
		ListNode currNode = new ListNode(data);
		currNode.setNext(headNode);
		headNode = currNode;
	}
	public int pop() {
		ListNode currNode = headNode;
		int res = Integer.MIN_VALUE;

		if (currNode ==null)
		{
			System.out.println("Cannot do Pop as the Stack is empty alreadys");
			return res;
		}
		else {
			res = currNode.getData();
			headNode = headNode.getNext();
			return res;
		}
	}

	
	public void delete(){
		headNode = null;
	}
	
	public int top(){
		if (headNode!=null ) return headNode.getData();
		else {
			System.out.println("Stack already empty ");
			return (Integer) null;
		}
	}
	public void print() {
		System.out.println("--------------------------");
		System.out.println("Size of Stack " + size());
		ListNode currNode = headNode;
		int ctr =0;
		while(currNode!= null ) {
			System.out.println("Element " + ++ctr + "  :--:  Val " + currNode.getData());
			currNode = currNode.getNext();
		}
		System.out.println("--------------------------");
	}

}
