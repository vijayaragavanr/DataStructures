package datastrTest;
import datastr.DynArrayStack;
//Static import datastr.DynArrayStack;
public class DynArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynArrayStack Stack = new DynArrayStack(10);
		
		for(int i=0;i<5;i++) Stack.push(i*100);
		Stack.print();
		
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.print();
		System.out.println("What is my top element " + Stack.top());
		System.out.println("Wow now lets add lots of elements");
		for(int i =0;i<638/* doubled up to 640 size now stack will be full after this loop even a single stack push can double capacity to 1280*/; i++) {
			Stack.push(i*100);
		}
		Stack.print();
		System.out.println("Is my stack empty " + Stack.isEmpty());
		System.out.println("Is my stack full " + Stack.isFull());
	}

}
