package datastr;
import java.awt.HeadlessException;

import datastr.ListNode;
public class ListQueue {
/* Author : Vijayaragavan
 * Date	  : 16-03-2014
 * */
	/*
	 * QUeue operations
	 * 1. enque
	 * 2.deque
	 * 3. size
	 * 4. check if queue 
	 * 5. get the first element 
	 * */
	ListNode front ;//= new ListNode();
	ListNode back ;
	 
	int size ;
	
	public ListQueue(){
		front = null;
		back=null;
		size =0;
	}
	
	public boolean isEmpty(){
		return (front==null);
	}
	
	public void enque(int data){
		ListNode node = new ListNode(data);
		if(back == null) {
			back=node;
			front =back;
		}
		else {
			back.setNext(node);
			back = node;
		 }
		
	}
	public int deque() throws Exception{
		if(isEmpty()) throw new Exception("Empty Queu =e Bummer") ;
		else{
			ListNode node = front.getNext();
			int data = front.getData();
			front = node;
			return data;
		}
	}
	
	public int top () {
		if (!isEmpty()) return front.getData();
		else return (Integer) null;
	}
	
	public int size(){
		if (isEmpty()) return 0;
		else {
			ListNode  currNode = front;
			int ctr =0;
			while(currNode!=null) {
				ctr++;
				currNode = currNode.getNext();
			}
			return ctr;
		}
		
	}
	public void print() {
		System.out.println("------------------------");
		System.out.println("Printing the values ");
		System.out.println("Size of the Queue " + size());
			ListNode curr = front;
		while(curr!=null){
			System.out.println(curr.getData());
			curr= curr.getNext();
		}
		// code to be written to print the linked list values in reverse order 
		//printReverse(front);
		System.out.println("------------------------");
	}
	void printReverse(ListNode node) {
		
		if(node.getNext() != null) { // we recurse every time unless we're on the last one
	        printReverse(node.getNext());  // this says "do this to the next node first"
	    }
		System.out.println(node.getData()); // we'll print out our node now
	    
	}
}
