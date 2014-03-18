package datastrTest;
import datastr.ArrayStack;
import datastr.ArrayStackUtils;

public class ArrayStackTest {
public static void main(String[] args) {
	ArrayStack Stack = new ArrayStack(10);
	for(int i=0;i<12;i++) {
		ArrayStackUtils.push(Stack,i);	
	}
	
	System.out.println("Printing values in stack after 8 push");
	ArrayStackUtils.print(Stack);
	System.out.println("Top value " + ArrayStackUtils.top(Stack));
	System.out.println("Now popping out the values ");
	for(int i=0;i<10;i++) {
	System.out.println(	ArrayStackUtils.pop(Stack));	
	}
	ArrayStackUtils.print(Stack);
}
}
