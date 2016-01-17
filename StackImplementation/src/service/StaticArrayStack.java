package service;

import api.Stack;

public class StaticArrayStack<E> implements Stack<E> {
	public static final int CAPACITY = 3;
	private int top = -1;
	private E[] arrayStack;
	
	public StaticArrayStack(){
		this(CAPACITY);	
	}
	
	public StaticArrayStack(int capacity){
		arrayStack = (E[])new Object[capacity];
	}
	
	public int size(){
		return (top + 1);
	}
	
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void push(E element)throws IllegalStateException{
		try{
			if(size() != CAPACITY){
				top++;
				arrayStack[top] = element;
			}
		}
		catch(IllegalStateException e){
			throw new IllegalStateException("Stack is full");
		}
	}
	
	public E pop(){
		if(!isEmpty()){
			E elementToReturn = arrayStack[top];
			//to aid garbage collection
			arrayStack[top] = null;
			top--;
			return elementToReturn;
		}
		return null;
	}
	
	public E top(){
		if(!isEmpty()){
			return arrayStack[top];
		}
		return null;
	}
	
	public void reverse(E[] arrayToReverse){
		for(int i=0;i<arrayToReverse.length;i++){
			push(arrayToReverse[i]);
		}
		while(size() != 0){
			System.out.print(pop() + " ");
		}
		System.out.println();
	}
}
