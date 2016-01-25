package test;

import implementation.SimpleLinkedList;

public class SimpleLinkedListTest {
	
	public static void main(String[] args) {
		SimpleLinkedList<String> simpleLL = new SimpleLinkedList<String>();
		//inserting elements at the head of the linked list
		simpleLL.addFirst("BOS");
		simpleLL.addFirst("ATL");
		System.out.println("Size of Linked List: "+simpleLL.size());
		simpleLL.addFirst("MSP");
		simpleLL.addFirst("LAX");
		System.out.println("Size of Linked List: "+simpleLL.size());
		System.out.println("Displaying Linked List after insertion of element at the beginning");
		simpleLL.displayList();
		
		//inserting elements at the tail of the linked list
		simpleLL.addLast("MIA");
		System.out.println("Displaying Linked List after insertion of element at the end");
		simpleLL.displayList();
		
		//fetching the first element of the list
		System.out.println("Before deletion the first element is: "+simpleLL.first());
		
		//fecthing the last element of the list
		System.out.println("Before deletion the last element of the list is: "+simpleLL.last());
		
		//deleting the first element if the list
		System.out.println("Element deleted is: "+simpleLL.removeFirst());
		
		//displaying the list after deletion
		simpleLL.displayList();
		
		//fetching the first and the last elements after deletion
		System.out.println("After deletion the first element of the list is: "+simpleLL.first());
		System.out.println("After deletion the last element of the list is: "+simpleLL.last());
	}

}
