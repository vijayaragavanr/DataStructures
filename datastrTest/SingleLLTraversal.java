package datastrTest;

import datastr.ListNode;
import datastr.SLUtils;

public class SingleLLTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ListNode ln = new ListNode(7);
    ListNode lnA = new ListNode(6);
    ListNode lnB = new ListNode(4);
    ListNode lnC = new ListNode(3);
    ListNode lnD = new ListNode(2);
    ln.setNext(lnA);
    lnA.setNext(lnB);
    lnB.setNext(lnC);
    lnC.setNext(lnD);
    /* traveral*/;
    System.out.println(SLUtils.length(ln));
    /*Get nthe element*/
    System.out.println("---------------------------");
    System.out.println("Trying to fetch 4th element " + SLUtils.getNthNode(ln, 4).getData());
    System.out.println("Trying to fetch invalid 7th element " +  SLUtils.getNthNode(ln, 7).getData());
    System.out.println("---------------------------");
	
    // insertin elements to 
    // head
    // middle
    // and end
    ListNode element = new ListNode(10);
    ln = SLUtils.InsertLinkedList(ln, element, 1);
    System.out.println(ln.getNext().getData());
    SLUtils.printList(ln);
    ListNode elementMid = new ListNode(25);
    
    ln= SLUtils.InsertLinkedList(ln, elementMid, 2);
    SLUtils.printList(ln);
    //ListNode testNode = SLUtils.getNthNode(ln, 3);
    System.out.println("Data of 3rd Node " + SLUtils.getNthNode(ln, 3).getData() + " Next to 3rd Node data  " + SLUtils.getNthNode(ln, 3).getNext().getData());
	// inserting into the end 
    ListNode lastElem  = new ListNode (999);
    ln= SLUtils.InsertLinkedList(ln, lastElem,7);
    SLUtils.printList(ln);
    
    // deletion of linkedList elements
    /*
     * Case 1: Delete headNode
     * Case 2: Delete Mid node
     * Case 3: Delete End node*/
    System.out.println("List before Deletion head");
    SLUtils.printList(ln);
    ListNode delhead = SLUtils.getNthNode(ln,0);
    ln = SLUtils.deleteListNode(ln, delhead, 0);
    System.out.println("List after Deletion head");
    SLUtils.printList(ln);
    System.out.println("List before Deletion of Node no 2");
    SLUtils.printList(ln);
	ListNode delNode2 = SLUtils.getNthNode(ln,2);
    ln = SLUtils.deleteListNode(ln, delNode2, 2);
    SLUtils.printList(ln);
    System.out.println("List after Deletion of Node no 2");
    
    
    System.out.println("List before Deletion of Tail Node");
    SLUtils.printList(ln);
	ListNode delTail = SLUtils.getNthNode(ln,SLUtils.length(ln)-1);
    ln = SLUtils.deleteListNode(ln, delTail, SLUtils.length(ln)-1);
    SLUtils.printList(ln);
    System.out.println("List after Deletion of Tail Node");
    
	}
    
}
