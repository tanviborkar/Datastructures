package implementation;

import api.Position;

public class LinkedBinaryTrees<E> extends AbstractBinaryTree<E> {

	//class to define each position in the tree
	protected static class Node<E> implements Position<E>{
		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;
		
		//constructor for the node class
		public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
			super();
			this.element = element;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
		
		//getter-setter methods for the fields
		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node<E> getParent() {
			return parent;
		}

		public void setParent(Node<E> parent) {
			this.parent = parent;
		}

		public Node<E> getLeft() {
			return left;
		}

		public void setLeft(Node<E> left) {
			this.left = left;
		}

		public Node<E> getRight() {
			return right;
		}

		public void setRight(Node<E> right) {
			this.right = right;
		}
	}
	
	//code to create new node for the tree
	public Node<E> createNode(E element, Node<E> parent, Node<E> left, Node<E> right){
		return new Node<E>(element, parent, left, right);
	}
	
	protected Node<E> root = null;
	private int size = 0;
	
	//method to validate the position
	public Node<E> validate(Position<E> p)throws IllegalStateException{
		if(!(p instanceof Node)){
			throw new IllegalStateException("Not valid position");
		}
		Node<E> nodeP = (Node<E>) p;
		if(nodeP.getParent() == nodeP){
			throw new IllegalStateException("Node not in the tree");
		}
		return nodeP;
	}
	
	//general methods for binary trees
	//method to check if the tree is empty
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//method to find the number of nodes(positions) in the tree
	public int size(){
		return size;
	}
	
	//additional accessor methods for binary trees
	//method to find the left child of position
	public Position<E> left(Position<E> p){
		Node<E> parent = validate(p);
		return parent.getLeft();
	}
	
	//method to find the right child of position
	public Position<E> right(Position<E> p){
		Node<E> parent = validate(p);
		return parent.getRight();
	}
	
	//method to get the root of the tree
	public Position<E> root(){
		return root;
	}
	//update methods for Binary trees
	//method to add root node to the tree
	public Position<E> addRoot(E element) throws IllegalStateException{
		if(isEmpty()){
			root = createNode(element, null, null, null);
			size = 1;
			return root;
		}
		else{
			throw new IllegalStateException("Tree is not empty");
		}
	}
	
	//method to add left child of a position
	public Position<E> addLeft(Position<E> p, E element)throws IllegalArgumentException{
		Node<E> parent = validate(p);
		if(parent.getLeft() != null){
			throw new IllegalArgumentException("Left child already exists");
		}
		Node<E> leftChild = createNode(element, parent, null, null);
		size++;
		parent.setLeft(leftChild);
		return leftChild;
	}
	
	//method to add right child of a position
	public Position<E> addRight(Position<E> p, E element)throws IllegalArgumentException{
		Node<E> parent = validate(p);
		if(parent.getRight() != null){
			throw new IllegalArgumentException("Right child already exists");
		}
		Node<E> rightChild = createNode(element, parent, null, null);
		parent.setRight(rightChild);
		size++;
		return rightChild;
	}
	
	//method to replace element stored at a position
	public E set(Position<E> p, E newElement){
		Node<E> nodeP = validate(p);
		E temp = nodeP.getElement();
		nodeP.setElement(newElement);
		return temp;
	}
	
	//method to add two subtrees to a position
	public void attach(Position<E> p, LinkedBinaryTrees<E> tree1, LinkedBinaryTrees<E> tree2)throws IllegalArgumentException{
		Node<E> parent = validate(p);
		if(isInternal(parent)){
			throw new IllegalArgumentException("Position is not the leaf of the tree");
		}
		if(!tree1.isEmpty()){
			tree1.root.setParent(parent);
			parent.setLeft(tree1.root);
			tree1.root = null;
			tree1.size = 0;
		}
		if(!tree2.isEmpty()){
			tree2.root.setParent(parent);
			parent.setRight(tree2.root);
			tree2.root = null;
			tree2.size = 0;
		}
		size+= tree1.size() + tree2.size();
	}
	
	//method to remove the position from the tree
	public E remove(Position<E> p)throws IllegalArgumentException{
		Node<E> nodeToRemove = validate(p);
		if(numChildren(p) == 2){
			throw new IllegalArgumentException("The position has two children");
		}
		Node<E> child;
		if(nodeToRemove.getLeft() != null){
			child = nodeToRemove.getLeft();
		}
		else{
			child = nodeToRemove.getRight();
		}
		if(child != null){
			child.setParent(nodeToRemove.getParent());
		}
		if(nodeToRemove == root){
			root = child;
		}
		else{
			Node<E> parent = nodeToRemove.getParent();
			if(parent.getLeft() == nodeToRemove){
				parent.setLeft(child);
			}
			else{
				parent.setRight(child);
			}
		}
		E temp = nodeToRemove.getElement();
		nodeToRemove.setElement(null);
		nodeToRemove.setLeft(null);
		nodeToRemove.setRight(null);
		nodeToRemove.setParent(nodeToRemove);
		
		size--;
		return temp;
	}
}
