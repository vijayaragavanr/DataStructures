package datastr;

public class DoubleLLUtils {
 /*
  * Author  : R Vijayaragavan
  * Date    : 15-03-2014
  * Purpose : Utility operations for a Doubly linked List
  * */
  /* Operations Supported:
   * 1. Size of the Double ll
   * 2. fetching nth node from head and nth node from tail
   * 3. inserting element into 
   * 	1. head
   * 	2. middle
   * 	3. tail
   * 4. deleting an element from 
   * 	1. head
   * 	2. middle
   * 	3. tail
   * 5. delete entite double LL
   * 
   * */
	public static int length(DoubleListNode headNode) {
		int size =0;
		DoubleListNode currNode = headNode;
		while(currNode != null) {
			DoubleListNode nextNode = currNode.getNextNode();
			currNode = nextNode;
			size++;
		}
		return size;
	}
	public static DoubleListNode  InsertLinkedList(DoubleListNode headNode, DoubleListNode nodeTobeInserted, int position) {
		if(headNode== null) {
			//first elem
			return nodeTobeInserted;
		}
		int size = length(headNode); 
		if(position<0|| position >size) {
			System.out.println("Position to insert in invalid " );
			return  headNode;
		}
		
		if(position==0) {
		    // first 
			nodeTobeInserted.setPrevNode(null);
			nodeTobeInserted.setNextNode(headNode);
			headNode.setPrevNode(nodeTobeInserted);
			return nodeTobeInserted;
		}
		else {
			// traverse to nth element 
			DoubleListNode prevNode = getNthNode(headNode,position-1);
			System.out.println(" Nth Node " +   (position-1) + " Data  "  + prevNode.getData());
			
			DoubleListNode nextNode = prevNode.getNextNode();
			DoubleListNode currNode = nodeTobeInserted; 
					
			//nodeTobeInserted.setNext(nextNode);
			//nodeTobeInserted.setPrevNode(prevNode)
			prevNode.setNextNode(nodeTobeInserted);
			if (position<size){
			nextNode.setPrevNode(nodeTobeInserted);
			}
			
			nodeTobeInserted.setNextNode(nextNode);
			nodeTobeInserted.setPrevNode(prevNode);
		}
		
		return headNode;
		
	}
	
	public static DoubleListNode deleteNode(DoubleListNode headNode, int position) {
		DoubleListNode currNode = headNode;
		int size = length(headNode);
		if(position <0 || size -1 < position) {
			System.out.println("Kindly enter a valid Position  between 0 and "  + size);
		}
		else {
			if(position ==0 ) {
				currNode = currNode.getNextNode();
				//headNode.setPrevNode(currNode);
				currNode.setPrevNode(null);
				headNode = null;
				headNode = currNode;
			}
			else {
				DoubleListNode prevNode = getNthNode(headNode, position-1);
				DoubleListNode nextNode ;
				currNode = prevNode.getNextNode();
				nextNode = currNode.getNextNode();
				currNode = null;
				prevNode.setNextNode(nextNode);
				if(nextNode!=null) { 
				// skip for tail node
				nextNode.setPrevNode(prevNode);
				}
			}
		}
		
		return headNode;
		
	}
	
	public static DoubleListNode getNthNode (DoubleListNode headNode, int position) {
		DoubleListNode currNode = headNode;
		int size = length(headNode);
		if(position<0 || position > size) {
			System.out.println("Kindly enter a valid Position  between 0 and "  + size);
		}
		else{
			int ctr =0;
			while(ctr!=position) {
				currNode = currNode.getNextNode();
				ctr++;
			}
		}
		return currNode;
	}
	
	public static void deleteDoublyLinkedList(DoubleListNode headNode) {
		DoubleListNode currNode = headNode;
		while(currNode != null ) {
			DoubleListNode nextNode = currNode.getNextNode();
			currNode = null;
			//nextNode.setPrevNode(null);
			currNode = nextNode;
		}
		
	}
	
	public static void printList (DoubleListNode headNode) {
		DoubleListNode curr = headNode ;
		System.out.println("----------------------------");
		System.out.println("Printing the List ");
		int ctr =0;
		while(curr!=null)  {
			System.out.println(" Node no " + ctr++ + " Data  " + curr.getData() );
			curr = curr.getNextNode();
		}
		System.out.println("----------------------------");
	}	
}
