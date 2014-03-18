package datastr;

import java.util.EmptyStackException;

public class LLQueue {


	/* Author : Vijayaragavan
	 * Date	  : 16-03-2014
	 * */
	
	private ListNode frontNode; 
	private ListNode rearNode;

	public LLQueue() {
		this.frontNode =null;
		this.rearNode =null;
	}
	
	public static LLQueue createQueue() {
		return new LLQueue();
	}
	
	public boolean isEmpty() {
		return (frontNode==null);
	}
	
	public void enQueue(int data){
		ListNode newNode = new ListNode(data);
		if(rearNode!=null) {
			rearNode.setNext(newNode);
		}
		rearNode= newNode;
		if(frontNode == null) {
			frontNode = rearNode;
		}
	}
	public int deQueue(){
		int data =0;
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			data = frontNode.getData();
			frontNode= frontNode.getNext();
		}
		return data;
	}
	public  static int getSize(LLQueue queue) {
		int size =0;
		while (!queue.isEmpty()) {
			queue.deQueue();
			size++;
		}
		
		return size;
	}

}
