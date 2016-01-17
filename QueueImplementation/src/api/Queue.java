package api;

public interface Queue<E> {

	//returns the number of elements in the queue
	public int size();
	
	//checks whether elements are present in the queue
	public boolean isEmpty();
	
	//inserts element at the rear of the queue
	public void enqueue(E e);
	
	//removes and returns element from the front of the queue
	public E dequeue();
	
	//returns element present at the front of the queue
	public E first();
}
