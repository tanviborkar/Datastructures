package api;

import java.util.Iterator;

public interface TreeAPI<E> extends Iterable<E> {

	//code to obtain the root position of the tree
	public Position<E> root();
	
	//code to obtain the parent of a position 
	public Position<E> parent(Position<E> p);
	
	//code to obtain the children of a position
	public Iterable<Position<E>> children(Position<E> p);
	
	//code to obtain the number of children of a position
	public int numChildren(Position<E> p);
	
	//code to check whether a position is root of the tree
	public boolean isRoot(Position<E> p);
	
	//code to check if the position is internal or not
	public boolean isInternal(Position<E> p);
	
	//code to check if the position is external or not
	public boolean isExternal(Position<E> p);
	
	//code to get the number of positions in the tree
	public int size();
	
	//code to check if the tree has elements or not
	public boolean isEmpty();
	
	//code to iterate through all the elements of the tree
	public Iterator<E> iterator();
	
	//code to obtain all the positions in the tree
	public Iterable<Position<E>> positions();
}
