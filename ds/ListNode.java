public class ListNode {

	/**
	 * 1. inserting a node in singly LinkedList at the end
2. at beginning
3. at tge middle
	 */

	private int data;
	private ListNode next;
		
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return this.next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public ListNode(int data) {
		this.data=data;
	}
	
	public int listLength(ListNode lnode) {
		int len =0;
		
		ListNode currNode = lnode;
		while(currNode!=null) {
			len++;
			currNode = currNode.getNext();
		}
				
		return len;
	}
}
