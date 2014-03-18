package datastrTest;
import datastr.DoubleListNode;
import datastr.DoubleLLUtils;
public class DoubleLLTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleListNode headNode = new DoubleListNode(0);
		DoubleListNode node1 = new DoubleListNode(1);
		DoubleListNode node2 = new DoubleListNode(2);
		DoubleListNode node3 = new DoubleListNode(3);
		DoubleListNode node4 = new DoubleListNode(4);
		
		headNode.setNextNode(node1);
		
		node1.setNextNode(node2);
		node1.setPrevNode(headNode);
		
		node2.setPrevNode(node1);
		node2.setNextNode(node3);
		
		node3.setPrevNode(node2);
		node3.setNextNode(node4);
		
		node4.setPrevNode(node3);
		
		System.out.println("Length / size of DDLL " + DoubleLLUtils.length(headNode));
		DoubleLLUtils.printList(headNode);
		// inserting elements 
		System.out.println("New head is added ");
		DoubleListNode newHead = new DoubleListNode(-1);
		
		headNode = DoubleLLUtils.InsertLinkedList(headNode, newHead, 0);
		System.out.println("List with new Head ");
		DoubleLLUtils.printList(headNode);
		
		DoubleListNode newNode3 = new DoubleListNode(-3);
		headNode = DoubleLLUtils.InsertLinkedList(headNode, newNode3, 3);
		System.out.println("List with new node elem 3 ");
		DoubleLLUtils.printList(headNode);
		
		DoubleListNode newNode7 = new DoubleListNode(999);
		headNode = DoubleLLUtils.InsertLinkedList(headNode, newNode7, 7);
		System.out.println("List with new node addded at end");
		DoubleLLUtils.printList(headNode);
		
		/*Deletion of elements */ 
		DoubleListNode nodeToDoubleListNode = DoubleLLUtils.getNthNode(headNode, 0);
		headNode = DoubleLLUtils.deleteNode(headNode, 0);
		System.out.println("Head node is deleted ");
		DoubleLLUtils.printList(headNode);
		
		nodeToDoubleListNode = DoubleLLUtils.getNthNode(headNode, 2);
		headNode = DoubleLLUtils.deleteNode(headNode, 2);
		System.out.println("Node with index 2 is removed ");
		DoubleLLUtils.printList(headNode);
		
		nodeToDoubleListNode = DoubleLLUtils.getNthNode(headNode, DoubleLLUtils.length(headNode)-1);
		System.out.println("Last node to be removed with data  "+ nodeToDoubleListNode.getData());
		headNode = DoubleLLUtils.deleteNode(headNode,  DoubleLLUtils.length(headNode)-1);
		DoubleLLUtils.printList(headNode);
		
	}

}
