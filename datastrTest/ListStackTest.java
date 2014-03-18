package datastrTest;
import datastr.ListNode;
import datastr.ListStack;


public class ListStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListNode headNode = new ListNode(100);
		ListStack Stack = new ListStack(headNode);
		Stack.print();
		
		for(int i=0;i<10;i++) Stack.push(i*5);
		Stack.print();
		for(int i=0;i<15;i++) 
			{
			System.out.println("Pushed out elem " + Stack.pop());
			}
		Stack.print();
		for(int i=0;i<10;i++) Stack.push(i*50);
		Stack.print();
		Stack.delete();
		Stack.print();
	}

}
