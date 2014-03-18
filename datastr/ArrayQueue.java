package datastr;

import javax.print.attribute.standard.QueuedJobCount;
/* Author : Vijayaragavan
 * Date	  : 15-03-2014
 * */

public class ArrayQueue {
	int capacity;
	int size;
	int array [];
	int front= -1;
	int rear = -1;
	
	public ArrayQueue(int capacity){
		this.capacity=capacity;
		array = new int[capacity];
		this.size=-1;
	}
	
	public boolean isEmpty(){
		return (front==-1);
	}
	
	public boolean isFull(){
		if(front!=-1 && rear!=-1 && (rear+1)%capacity==front) return true;
		else return false;
	}
	
	public void enque (int data) throws Exception {
		if (rear==-1) {
			rear=0;
			front =0;
			array[front]= data;
		}
		else if(isFull()) 
			throw new Exception("Size of the queue is exceeded");
		
		else {
			rear = ((rear+1)%capacity);
			array[rear] = data;
		}
		
	}
	public int deque () throws  Exception {
		int data=0;
		if(isEmpty()) throw new Exception ("Bummer Empty Queue");
		else{
			data = array[front];
			if(front==rear) {
				
				front=(rear-1);
				
			}
			else {
				front = ((front+1)%capacity);
			}
			return data;
		}
	}
	public int size(){
		return (isEmpty())?0: ( rear>=front) ? (rear+1-front): ((capacity-front)+rear+1);
				//capacity-(rear+front)+1)%capacity; 
			//(rear-front)+1;
	}
	public void  print(){
		System.out.println("---------------------");
		System.out.println("Printing the queue ");
		System.out.println("What is the Size  " + size());
		int tmp=front;
		for(int i=0;i<size();i++) {
			
			System.out.println("Element " + (i+1) + " Value " + array[(tmp++)%capacity]);
		}
		
		System.out.println("---------------------");
		
		
	}
	
}
