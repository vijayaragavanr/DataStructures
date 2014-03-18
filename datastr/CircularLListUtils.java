package datastr;

public class CircularLListUtils {
	/*
	  * Author  : R Vijayaragavan
	  * Date    : 15-03-2014
	  * Purpose : Utility operations for a circular linked List
	  * */
	  /* Operations Supported:
	   * 1. Size of the circular ll
	   * 2. fetching nth node from head and nth node from tail
	   * 3. inserting element into 
	   * 	1. head
	   * 	2. middle
	   * 4. deleting an element from 
	   * 	1. head
	   * 	2. middle
	   * 5. delete entite circular LL
	   * */
	public static int length (CircularNode headNode) {
		int size =0;
		if (headNode !=null) size++;
		else return size;
		CircularNode currNode = headNode;
		while(true)
		{
			currNode = currNode.getNextNode();
			if(headNode == currNode) break;
			size++;
		}
		return size;
	}
	
	public static CircularNode getNthNode(CircularNode headNode, int pos) {
		CircularNode CurrNode = headNode;
		int size = length(headNode);
		if (pos<0 || (pos-1) > (size)) {
			System.out.println("Kindly enter valid position between 0 and " +  size+1 + " Pos " + pos);
		}
		else {
			int ctr=0;
			while(ctr <=pos) {
				ctr++;
				CircularNode nextNode = CurrNode.getNextNode();
				CurrNode = nextNode ;
			}
		}
		return CurrNode;
	}
	
	public static CircularNode insertNode (CircularNode headNode, CircularNode nodeToBeInserted, int pos) {
		CircularNode currNode = headNode;
		CircularNode prevNode, nextNode ;
		int size = length(headNode);
		if (pos<0 || pos > (size-1)) {
			System.out.println("Kindly enter valid position between 0 and " +  size);
		}
		if(size>1) {
			
			//currNode = headNode;
			prevNode = getNthNode(headNode, size-1);
			if (prevNode!=headNode) {
				currNode  = prevNode.getNextNode();
				nodeToBeInserted.setNextNode(currNode);	
				prevNode.setNextNode(nodeToBeInserted);
			}
			
			
			
			//headNode = nodeToBeInserted;
		}
		else {
			// First node element insertion
			if (headNode ==null){
			headNode= nodeToBeInserted;
			headNode.setNextNode(headNode);}
			else {
				currNode = nodeToBeInserted;
				currNode.setNextNode(headNode);
				headNode.setNextNode(currNode);
			if (pos==0) {
	
			headNode = currNode;
			}
			}
		}
		return headNode;
	}
	public static CircularNode insertNodeAtBeginning (CircularNode head, CircularNode nodeToInsert, int pos) {
		CircularNode currNode = head;
		
		if(head==null) {
			nodeToInsert.setNextNode(nodeToInsert);
			head = nodeToInsert;
		}
		else {
			while(currNode.getNextNode()!=head) {
				currNode.setNextNode(currNode.getNextNode());
			}
			nodeToInsert.setNextNode(nodeToInsert);
			nodeToInsert.setNextNode(head);
			currNode.setNextNode(nodeToInsert);
			head= nodeToInsert;
		}
		
		return head;
	}
	public static CircularNode insertNodeAtEnd (CircularNode head, CircularNode nodeToInsert, int pos) {
		CircularNode currNode = head;
		while(currNode.getNextNode()!=head) {
			//System.out.println("ia mfoeush " + currNode.getData());
			currNode = currNode.getNextNode();
			//currNode.setNextNode();
		}
		nodeToInsert.setNextNode(nodeToInsert);
		if(head==null) {
			head = nodeToInsert;
		}
		else {
			nodeToInsert.setNextNode(head);
			currNode.setNextNode(nodeToInsert);
			//head= nodeToInsert;
		}
		
		return head;
	}
	public static CircularNode insertNodeMid(CircularNode head, CircularNode nodeToInsert, int pos) {
		CircularNode currNode = head;
		int ctr=1;
		while(currNode.getNextNode()!=head) {
			currNode =currNode.getNextNode(); 
			//currNode.setNextNode(currNode.getNextNode());
			ctr++;
			if (ctr==pos){
				break;
			}
		}
		nodeToInsert.setNextNode(nodeToInsert);
		nodeToInsert.setNextNode(currNode.getNextNode());
		currNode.setNextNode(nodeToInsert);
			//head= nodeToInsert;
		
		
		return head;
	}
	public static CircularNode deleteNode (CircularNode headNode , int pos) {
		int size = length(headNode);
		if(pos<0 || pos >=size) 
			System.out.println("Kindly enter a valid position for delete between 0 and " + (size-1));
		
		CircularNode prevNode;// = getNthNode(headNode, size-1);
		CircularNode nextNode; // = headNode.getNextNode();
		
		if (pos==0) {
			prevNode = getNthNode(headNode, size-1);
			nextNode = headNode.getNextNode();
			prevNode.setNextNode(nextNode);
			headNode = null;
			headNode = nextNode;
		}
		else {
			prevNode = getNthNode(headNode, size-1);
			CircularNode currNode =prevNode.getNextNode();
			nextNode = currNode.getNextNode();
			
			currNode = null;
			prevNode.setNextNode(nextNode);
		}
		return headNode;
	}
	
	
	public static void printList (CircularNode headNode) {
		CircularNode curr = headNode ;
		System.out.println("----------------------------");
		System.out.println("Printing the List ");
		int ctr =0;
		while(true)  {
			System.out.println(" Node no " + ctr++ + " Data  " + curr.getData()  + " Next Node data  "  + curr.getNextNode().getData());
			curr = curr.getNextNode();
			if (curr== headNode) break;
		}
		System.out.println("----------------------------");
	}
	
}
