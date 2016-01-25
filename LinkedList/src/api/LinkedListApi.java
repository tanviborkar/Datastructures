package api;

public interface LinkedListApi<E> {
	//code to return the number of elements in the list
	public int size();
	
	//code to check whether the list is empty or not
	public boolean isEmpty();
	
	//code to insert a new element at the beginning of the list
	public void addFirst(E valueToInsert);
	
	//code to insert a new element at the end of the list
	public void addLast(E valueToInsert);
	
	//code to fetch the first element of the list
	public E first();
	
	//code to fetch the last element of the list
	public E last();
	
	//code to return and remove the first element of the list
	public E removeFirst();
}
