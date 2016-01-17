package service;

public class PrecedenceComparator {

	public static int getOperatorPrecedence(char operator){
		switch(operator){
			case '[':
			case ']':
			case '(':
			case ')':
			case '.': return 0;
			
			case '*':
			case '/':
			case '%': return 1;
			
			case '+':
			case '-': return 2;
			
			case '<':
			case '>': return 3;
			
			case '&': return 4;
				
			case '^': return 5;
			
			case '|': return 6;
			
			case '=': return 7;				
		}
		
		return -1;
	}
}
