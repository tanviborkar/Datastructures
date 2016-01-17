package service;

public class LinkedListStackTest {

	public static void main(String[] args) {
		
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		System.out.println("Is stack empty? "+stack.isEmpty());
		System.out.println("Stack size : "+stack.size());
		stack.push(25);
		stack.push(35);
		stack.push(45);
		stack.push(55);
		System.out.println("Elements in the stack : ");
		stack.displayStackElements();
		System.out.println("Top element in stack : "+stack.top());
		System.out.println("Element deleted : "+stack.pop());
		System.out.println("Element deleted : "+stack.pop());
		stack.push(65);
		System.out.println("Elements in the stack : ");
		stack.displayStackElements();
		System.out.println("Top element in stack : "+stack.top());
		System.out.println("Is stack empty? "+stack.isEmpty());
		System.out.println("Stack size : "+stack.size());
		System.out.println("Element deleted : "+stack.pop());
		System.out.println("Element deleted : "+stack.pop());
		System.out.println("Element deleted : "+stack.pop());
		System.out.println("Element deleted : "+stack.pop());
		System.out.println("Is stack empty? "+stack.isEmpty());
		System.out.println("Stack size : "+stack.size());
	}
}
