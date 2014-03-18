package datastr;


public class ArrayStackUtils {
/* Author : Vijayaragavan
 * Date	  : 15-03-2014
 * */
	/*Operations allowed:
	 * 1. size
	 * 2.si empty
	 * 3. is full
	 * 4. get top
	 * 5. pop
	 * 6. push 
	 * */
	public static void log(String a){
		System.out.println(a);
	}
	public static int size (ArrayStack as) {
		int c =-1;
		
		if(as.getCapacity()==-1) return -1;
		else
			return as.getSize();
	}
	
	public static boolean isEmpty (ArrayStack as) {
		if(as.getCapacity()==-1) return true;
		
		return false;
	}
	public static boolean isFull (ArrayStack as) {
		//log("Size " + as.size + " Capacity " + as.capacity);
		if( as.size < as.capacity-1) return false;
		else 
		return true;
	}
	public static int top (ArrayStack as) {
		int topV =-1;
		int size = as.getSize();
		if(as.getSize() >-1) {
			topV= as.getArray()[size];
		}
		else{
			System.out.println("Stack is empty");
		}
		return topV;
	}public static int pop (ArrayStack as) {
		int topV =-1;
		int size = as.getSize();
		if(as.getSize() >-1) {
			topV= as.getArray()[size];
			as.setSize(--size);
		}
		else{
			System.out.println("Stack is empty");
		}
		return topV;
	}
	public static void  push(ArrayStack as, int val) {
		if (isFull(as)) { 
			System.out.println("Stack is aleady full");
		}
		else{
		as.size++;
		as.Array[as.size]=val;
		}
	}
	
	public static void print(ArrayStack as) {
		System.out.println("-----------------------------");
		System.out.println("Printing the vlues ");
		System.out.println("Capacity of stack " + as.capacity);
		System.out.println("Size of stack " + (as.size+1));
		
		for(int i=0;i<=as.size;i++) {
			System.out.println("Elem No " + i + " value "+ as.Array[i]);
		}
		System.out.println("-----------------------------");
		
	}

}
