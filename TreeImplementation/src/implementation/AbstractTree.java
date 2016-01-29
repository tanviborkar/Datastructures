package implementation;

import api.Position;
import api.TreeAPI;

public abstract class AbstractTree<E> implements TreeAPI<E> {
	//method to check if the position is internal or not
	public boolean isInternal(Position<E> p){
		if(numChildren(p)>0){
			return true;
		}
		return false;
	}
	
	//method to check if the position is external or not
	public boolean isExternal(Position<E> p){
		if(numChildren(p) == 0){
			return true;
		}
		return false;
	}
	
	//method to check if the position is the root of the tree or not
	public boolean isRoot(Position<E> p){
		if(p == root()){
			return true;
		}
		return false;
	}
	
	//method to check if the tree is empty or not
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		}
		return false;
	}
	
	//method to find the depth of a node
	public int depth(Position<E> p){
		if(isRoot(p)){
			return 0;
		}
		else{
			return 1 + depth(parent(p));
		}
	}
	
	//method to find height with a computationally expensive method
	public int height(){
		int height = 0;
		for(Position<E> p : positions()){
			if(isExternal(p)){
				height = Math.max(height, depth(p));
			}
		}
		return height;
	}
	
	//method to find height of tree recursively 
	public int height(Position<E> p){
		int height = 0;
		for(Position<E> child : children(p)){
			height = Math.max(height, height(child));
		}
		return height;
	}
}
