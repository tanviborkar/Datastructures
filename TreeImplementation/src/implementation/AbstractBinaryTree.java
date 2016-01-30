package implementation;

import java.util.ArrayList;
import java.util.List;

import api.BinaryTreeAPI;
import api.Position;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTreeAPI<E> {

	//method to find the sibling of a position(node)
	public Position<E> sibling(Position<E> p){
		Position<E> parent = parent(p);
		if(parent == null){
			return null;
		}
		if(p == left(parent)){
			return right(parent);
		}
		else{
			return left(parent);
		}
	}
	
	//method to find the number of children of a position(node)
	public int numChildren(Position<E> p){
		int count = 0;
		if(left(p) != null){
			count++;
		}
		if(right(p) != null){
			count++;
		}
		return count;
	}
	
	//method to get the children of a position
	public Iterable<Position<E>> children(Position<E> p){
		List<Position<E>> snapshot = new ArrayList<Position<E>>(2);
		if(left(p) != null){
			snapshot.add(left(p));
		}
		if(right(p) != null){
			snapshot.add(right(p));
		}
		return snapshot;
	}
}
