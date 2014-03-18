package datastrTest;

import datastr.CircularNode;
import datastr.CircularLListUtils;

public class circularLLTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularNode headNode =null;
		CircularNode firstElem = new CircularNode(100);
		try{
		headNode=CircularLListUtils.insertNodeAtBeginning(headNode, firstElem, 0);
	    int size = CircularLListUtils.length(headNode);
	    System.out.println("Size after the addition of first element == " + size);
	    CircularLListUtils.printList(headNode);
	    CircularNode secondElem = new CircularNode(200); 
	    headNode=CircularLListUtils.insertNodeAtEnd(headNode, secondElem, 1);
	    size = CircularLListUtils.length(headNode);
	    System.out.println("Size after the addition of second element == " + size);
	    CircularLListUtils.printList(headNode);
	    
	    CircularNode ThirdElem = new CircularNode(300); 
	    headNode=CircularLListUtils.insertNodeAtEnd(headNode, ThirdElem, 2);
	    size = CircularLListUtils.length(headNode);
	    System.out.println("Size after the addition of Third element == " + size);
	    CircularLListUtils.printList(headNode);

	    CircularNode mid = new CircularNode(9999); 
	    headNode=CircularLListUtils.insertNodeMid(headNode, mid, 2);
	    size = CircularLListUtils.length(headNode);
	    System.out.println("Size after the addition of mid element == " + size);
	    CircularLListUtils.printList(headNode);
	    
	    CircularNode FourthElem = new CircularNode(400); 
	    headNode=CircularLListUtils.insertNodeAtEnd(headNode, FourthElem, 3);
	    size = CircularLListUtils.length(headNode);
	    System.out.println("Size after the addition of Fourths element == " + size);
	    CircularLListUtils.printList(headNode);
	    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}

}
