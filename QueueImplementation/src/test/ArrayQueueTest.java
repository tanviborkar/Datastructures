package test;

import implementation.ArrayQueue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		ArrayQueue<String> arrayAsQueue = new ArrayQueue<String>(11);
		
		//inserting elements in the queue
		arrayAsQueue.enqueue("H");
		arrayAsQueue.enqueue("A");
		arrayAsQueue.enqueue("R");
		arrayAsQueue.enqueue("R");
		arrayAsQueue.enqueue("Y");
		System.out.println("Display elements of the queue: ");
		arrayAsQueue.displayQueueElements();
		arrayAsQueue.enqueue("P");
		arrayAsQueue.enqueue("O");
		arrayAsQueue.enqueue("T");
		arrayAsQueue.enqueue("T");
		arrayAsQueue.enqueue("E");
		arrayAsQueue.enqueue("R");
		System.out.println("Display elements of the queue: ");
		arrayAsQueue.displayQueueElements();
		System.out.println("Size of the queue: "+arrayAsQueue.size());
		
		//code to fetch the first element of the queue
		System.out.println("First element of queue: "+arrayAsQueue.first());
		
		
		//code to delete the first element of the queue
		arrayAsQueue.dequeue();
		arrayAsQueue.dequeue();
		System.out.println("Display elements of the queue: ");
		arrayAsQueue.displayQueueElements();
		
		//inserting elements
		arrayAsQueue.enqueue("H");
		arrayAsQueue.enqueue("A");
		//arrayAsQueue.enqueue("R");
		System.out.println("Display elements of the queue: ");
		arrayAsQueue.displayQueueElements();
		
		//code to fetch the first element of the queue
		System.out.println("First element of queue: "+arrayAsQueue.first());
	}
}
