package datastrTest;
import datastr.ArrayQueue;;

public class ArrayQueueTest {
public static void main(String[] args) throws Exception {
	ArrayQueue Queue = new ArrayQueue(10);
	Queue.enque(100);
	Queue.enque(200);
	Queue.enque(300);
	Queue.enque(400);
	Queue.enque(600);
	Queue.print();
	for(int i=0;i<=Queue.size()-2;i++){
		System.out.println("Removing the elements " + Queue.deque());
	}
	Queue.print();
	
	for(int i=1;i<7;i++){
		 Queue.enque(i*100);
		System.out.println("Adding the elements " + (i*100) );
	}
	Queue.print();
}
}
