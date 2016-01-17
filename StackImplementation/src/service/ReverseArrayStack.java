package service;

public class ReverseArrayStack {

	public static void main(String[] args) {
		
		Integer[] numbersToReverse = new Integer[15];
		
		for(int i=0;i<numbersToReverse.length;i++){
			numbersToReverse[i] = (i +1)*100;
		}
		StaticArrayStack<Integer> stack = new StaticArrayStack<Integer>(numbersToReverse.length);
		System.out.println("The reversed array elements are : ");
		stack.reverse(numbersToReverse);
	}
}
