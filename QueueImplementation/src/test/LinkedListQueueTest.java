package test;

import implementation.LinkedListQueue;

public class LinkedListQueueTest {

	public static void main(String[] args) {
		LinkedListQueue<String> listQueue = new LinkedListQueue<String>();
		
		//inserting elements in the queue
		listQueue.enqueue("R");
		listQueue.enqueue("O");
		listQueue.enqueue("G");
		listQueue.enqueue("E");
		listQueue.enqueue("R");
		System.out.println("Elements in the queue: ");
		listQueue.displayQueueElements();
		
		listQueue.enqueue("F");
		listQueue.enqueue("E");
		listQueue.enqueue("D");
		listQueue.enqueue("E");
		listQueue.enqueue("R");
		listQueue.enqueue("E");
		listQueue.enqueue("R");
		System.out.println("Elements in the queue:");
		listQueue.displayQueueElements();
		
		//deleting elements from the list
		listQueue.dequeue();
		listQueue.dequeue();
		listQueue.dequeue();
		System.out.println("No. of elements in the queue: "+listQueue.size());
		System.out.println("Elements in the queue:");
		listQueue.displayQueueElements();
		
		//fetching the first element of the queue
		System.out.println("First element in the queue is: "+listQueue.first());
		
		listQueue.enqueue("R");
		listQueue.enqueue("O");
		System.out.println("Elements in the queue:");
		listQueue.displayQueueElements();
		System.out.println("No. of elements in the queue: "+listQueue.size());
	}
}
