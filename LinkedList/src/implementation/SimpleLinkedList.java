package implementation;

import api.LinkedListApi;

public class SimpleLinkedList<E> implements LinkedListApi<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	private static class Node<E>{
		E element;
		Node<E> next;
		
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	
	//code to get the no. of elements in the linked list
	public int size(){
		return size;
	}
	
	//code to check whether the list is empty or not
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//code to return the first element in the list
	public E first(){
		if(!isEmpty()){
			return head.getElement();
		}
		return null;
	}
	
	//code to return the last element in the list
	public E last(){
		if(!isEmpty()){
			return tail.getElement();
		}
		return null;
	}
		
	//code to insert a new element in linked list
	public void addFirst(E valueToInsert){
		head = new Node<E>(valueToInsert, head);
		if(isEmpty()){
			tail = head;
		}
		size++;
	}
	
	//code to insert a new element at the end of the linked list
	public void addLast(E valueToInsert){
		Node<E> newNode = new Node<E>(valueToInsert, null);
		if(isEmpty()){
			head = newNode;
		}
		else{
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}
	
	//code to remove and return first element of the list
	public E removeFirst(){
		if(isEmpty()){
			return null;
		}
		else{
			E elementToReturn = head.getElement();
			head = head.getNext();
			if(isEmpty()){
				tail = null;
			}
			size--;
			return elementToReturn;
		}
	}
	
	//code to display elements of the linked list
	public void displayList(){
		if(isEmpty()){
			System.out.println("List is empty");
		}
		else{
			Node<E> nodeToDisplay = head;
			while(nodeToDisplay != null){
				System.out.println(nodeToDisplay.getElement());
				nodeToDisplay = nodeToDisplay.getNext();
			}
		}
	}
}
