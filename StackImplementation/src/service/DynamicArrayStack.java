package service;

import api.Stack;

public class DynamicArrayStack<E> implements Stack<E> {
	private static int CAPACITY = 5;
	private E[] dynamicStack;
	private E[] tempArray;
	private int top=-1;
	
	public DynamicArrayStack() {
		this(CAPACITY);
		
	}
	
	public DynamicArrayStack(int capacity) {
		dynamicStack = (E[])new Object[CAPACITY];
	}

	@Override
	public void push(E element) {
		if(CAPACITY == size()){
			doubleArraySize();
			System.arraycopy(dynamicStack, 0, tempArray, 0, tempArray.length);
			dynamicStack = tempArray;
		}
		top++;
		dynamicStack[top] = element;
	}

	@Override
	public E pop() {
		if(!isEmpty()){
			E dataToReturn = dynamicStack[top];
			dynamicStack[top] = null;
			top--;
			return dataToReturn;
		}
		return null;
	}

	@Override
	public int size() {
		return (top + 1);
	}

	@Override
	public E top() {
		if(!isEmpty()){
			return dynamicStack[top];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(top == -1){
			return true;
		}
		return false;
	}
	
	public void doubleArraySize() {
		CAPACITY = CAPACITY * 2;
		tempArray = (E[])new Object[CAPACITY];
	}
	
	public void shrinkArray(){
		
	}
}
