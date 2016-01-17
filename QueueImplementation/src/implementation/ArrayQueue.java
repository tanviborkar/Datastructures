package implementation;

import api.Queue;

public class ArrayQueue<E> implements Queue<E> {
	private E[] elements;
	private int front = 0;
	private int sizeOfElements = 0;
	
	public ArrayQueue(int capacity) {
		elements = (E[])new Object[capacity];
	}
	
	@Override
	public int size() {
		return sizeOfElements;
	}

	@Override
	public boolean isEmpty() {
		if(sizeOfElements == 0){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void enqueue(E e) {
		if(sizeOfElements != elements.length){
			int availablePos = (front + sizeOfElements)%(elements.length);
			elements[availablePos] = e;
			sizeOfElements++;
		}
		else{
			throw new IllegalStateException("Queue is Full");
		}
	}

	@Override
	public E dequeue() {
		if(isEmpty()){
			return null;
		}
		else{
			E dataToReturn = elements[front];
			elements[front] = null;
			sizeOfElements--;
			front = (front + 1)% elements.length;
			return dataToReturn;
		}
	}

	@Override
	public E first() {
		if(isEmpty()){
			return null;
		}
		else{
			return elements[front];
		}
	}
}
