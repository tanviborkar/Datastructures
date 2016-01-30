package api;

public interface BinaryTreeAPI<E> extends TreeAPI<E>{
	//method to find the left child of given position(node)
	public Position<E> left(Position<E> p);
	
	//method to find the right child of given node(position)
	public Position<E> right(Position<E> p);
	
	//method to find the siblings of the given position(node)
	public Position<E> sibling(Position<E> p);
}
