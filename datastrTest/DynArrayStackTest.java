package datastrTest;
import datastr.DynArrayQueue;

public class DynArrayStackTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynArrayQueue Queue = new DynArrayQueue(10);
		for(int i=0;i<10;i++) Queue.enque(10+i);
		Queue.print();
	    
	    for(int i=0;i<3;i++) System.out.println(Queue.deque());
	    
	    System.out.println("After removing three elements ");
	    Queue.print();
	    
	    System.out.println("About to add 2 elem"); 
	    Queue.enque(700);
	    Queue.enque(800);
	    Queue.print();
	    System.out.println(" Size of the queuer  " + Queue.size());
	    System.out.println("Size is going to exceed");
	    for(int i=0;i <10;i++) Queue.enque(10*i);
	    Queue.print();
	    System.out.println(" Size of the queuer  " + Queue.size());
	}

}
