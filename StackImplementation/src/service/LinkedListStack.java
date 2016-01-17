package service;

import java.util.Iterator;
import java.util.LinkedList;

import api.Stack;

public class LinkedListStack<E> implements Stack<E> {
	private LinkedList<E> stackList;
	
	public LinkedListStack(){
		stackList = new LinkedList<E>();
	}
	
	public int size(){
		return stackList.size();
	}
	
	public boolean isEmpty(){
		return stackList.isEmpty();
	}
	
	public void push(E element){
		stackList.addFirst(element);
	}
	
	public E pop(){
		if(!stackList.isEmpty()){
			return stackList.removeFirst();
		}
		return null;
	}
	
	public E top(){
		if(!stackList.isEmpty()){
			return stackList.getFirst();
		}
		return null;
	}
	
	public void displayStackElements(){
		if(!stackList.isEmpty()){
			Iterator iterate = stackList.iterator();
			while(iterate.hasNext()){
				System.out.print(iterate.next()+" ");
			}
		}
		else{
			System.out.println("Stack is empty");
		}
	}
}
