package datastr;

public class SLUtils {

	/**
	 * Author : Vijayaragavan
	 * Date	  : 16-03-2014
	 * */
	public static int length(ListNode  currentNode) {
		int l=0;
		while(currentNode!=null) {
	    	l++;
	    	currentNode = currentNode.getNext();
	    }
	   // System.out.println("No of node " + l);
		return l;
	}
	public static ListNode  InsertLinkedList(ListNode headNode, ListNode nodeTobeInserted, int position) {
		if(headNode== null) {
			//first elem
			return nodeTobeInserted;
		}
		int size = length(headNode); 
		if(position<1 || position-1 >size) {
			System.out.println("Position to insert in invalid " );
			return  headNode;
		}
		
		if(position==1) {
			nodeTobeInserted.setNext(headNode);
			return nodeTobeInserted;
		}
		else {
			// traverse to nth element 
			ListNode prevNode = getNthNode(headNode,position-1);
			System.out.println(" Nth Node " +   (position-1) + " Data  "  + prevNode.getData());
			ListNode nextNode = prevNode.getNext();
			
			nodeTobeInserted.setNext(nextNode);
			prevNode.setNext(nodeTobeInserted);
		}
		
		return headNode;
		
	}
	public static ListNode getNthNode (ListNode headListNode, int position) {
		ListNode nthNode =headListNode;
		int size = length(headListNode); 
		if(position<1 || position-1 >size) {
			System.out.println("Position to insert in invalid " );
			return  headListNode;
		}
		for(int i=1; i<=position;i++) {
			
			nthNode=nthNode.getNext();
			//System.out.println("Traversing the node " + nthNode.getData());
		}
		return nthNode;
	}
	public static void printList (ListNode headNode) {
		ListNode curr = headNode ;
		System.out.println("----------------------------");
		System.out.println("Printing the List ");
		int ctr =0;
		while(curr!=null)  {
			System.out.println(" Node no " + ctr++ + " Data  " + curr.getData());
			curr = curr.getNext();
		}
		System.out.println("----------------------------");
	}
	
	public static ListNode deleteListNode(ListNode headNode,ListNode nodeToBeDeleted, int position) {
		//list nodeDeleted ;
		int size = length(headNode);
		if(position <0 || position >size) {
			System.out.println("Invalid position given");
			return headNode;
		}
		if(position ==0) {
			ListNode currNode = headNode.getNext();
			headNode = null;
			return currNode;
		}
		else {
			ListNode prevNode = getNthNode(headNode, position-1);
			ListNode currNode = prevNode.getNext();
			ListNode nextNode = currNode.getNext();
			currNode = null;
			prevNode.setNext(nextNode);
			return headNode;
		}
		
		
	}
	public static void deleteLinkedList(ListNode headNode ) {
		ListNode currNode = headNode;
		while(currNode!=null) {
			ListNode nextNode = currNode.getNext();
			currNode = null;
			currNode = nextNode;
		}
	}
	
}
