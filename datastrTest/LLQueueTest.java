package datastrTest;
import datastr.*;

public class LLQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLQueue queue = LLQueue.createQueue();
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9);
		queue.enQueue(3);
		System.out.println(LLQueue.getSize(queue));
	}
	

}
