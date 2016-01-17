package service;

public class StaticArrayStackTest {

	public static void main(String[] args) {
		
		StaticArrayStack<Integer> stack = new StaticArrayStack<Integer>();
		System.out.println("Is stack empty? "+stack.isEmpty());
		System.out.println("Stack size : "+stack.size());
		stack.push(25);
		stack.push(35);
		stack.push(45);
		stack.push(55);
		
		System.out.println("Top element in stack : "+stack.top());
		System.out.println("Element deleted : "+stack.pop());
		System.out.println("Element deleted : "+stack.pop());
		stack.push(65);
		
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
