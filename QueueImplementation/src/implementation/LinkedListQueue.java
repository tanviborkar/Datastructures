package implementation;

import java.util.LinkedList;

import api.Queue;

public class LinkedListQueue<E> implements Queue<E> {
	LinkedList<E> linkedListQueue = new LinkedList<E>();
	
	//returns the number of elements in the queue
	public int size(){
		return linkedListQueue.size();
	}
	
	//checks whether elements are present in the queue
	public boolean isEmpty(){
		return linkedListQueue.isEmpty();
	}
	
	//inserts element at the rear of the queue
	public void enqueue(E e){
		linkedListQueue.addLast(e);
	}
	
	//removes and returns element from the front of the queue
	public E dequeue(){
		return linkedListQueue.removeFirst();
	}
	
	//returns element present at the front of the queue
	public E first(){
		return linkedListQueue.peekFirst();
	}
	
	//code to display queue elements
	public void displayQueueElements(){
		System.out.println(linkedListQueue.toString());
	}
}
