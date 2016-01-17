package api;

public interface Stack<E> {

	//inserting element into the top of the stack
	//@param element the element to be inserted
	public void push(E element);
	
	//removing and returning element from the top of the stack
	//@return element removed
	public E pop();
	
	//return the number of elements in the stack
	//@return number of elements in stack
	public int size();
	
	//return the element at the top of the stack
	//@return the latest element inserted in the stack
	public E top();
	
	//check if the stack contains elements or not
	//@return true if stack empty, else false
	public boolean isEmpty();
}
