package datastr;
/* Author : Vijayaragavan
 * Date	  : 16-03-2014
 * */
/*
 * In addition to the normal stack operations like top,push and pop this dynamic array allows to dynamically increase the size of a stacks
 * 
 * */
public class DynArrayStack {
private int capacity;
private int size;
private int[] array ;


public static void log(String a){
	System.out.println(a);
}

public DynArrayStack(int capacity) {
	this.capacity =capacity;
	size =-1;
	array = new int[capacity];
}

public boolean isEmpty() {
	return (size==-1);
}
public boolean isFull () {
	return ((size+1)== capacity);
}
public int top () {
	return array[size];
}
public int size(){
	return size+1;
}
public void push(int data) {
	if(!isFull()) {
		array[++size] = data;
	}
	else 
	{
		doubleSize();
		array[++size] = data;
	}
}
public int pop() {
	if(!isEmpty()) {
		return array[--size];
	}
	else {
	    log("Stacks is empty");
		return -1;
	}
	//return data;
}
public void doubleSize(){
	int bigArray [] = new int [2*capacity];
	System.arraycopy(array, 0, bigArray , 0, capacity);
	capacity*=2;
	array =bigArray ;
}
public void print(){
	log("Printing the contents of the stack"); 
	log("-----------------------------------");
	for(int i=0;i<=size;i++) {
		log("Element  		:: " + i + "  	val 	" + array[i] );
	}
	log("-----------------------------------");
}
}
