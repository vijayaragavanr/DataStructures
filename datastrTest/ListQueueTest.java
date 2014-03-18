package datastrTest;
import datastr.ListQueue;

public class ListQueueTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ListQueue Queue = new ListQueue();
		
		for(int i=0;i<10;i++) Queue.enque(i*100);
		Queue.print();
		
		System.out.println(Queue.top());
		
		for(int i= 0;i <7 ;i++) System.out.println(Queue.deque());
		Queue.print();
		System.out.println(Queue.top());
		//for(int i= 0;i <7 ;i++) System.out.println(Queue.deque());
	}

}
