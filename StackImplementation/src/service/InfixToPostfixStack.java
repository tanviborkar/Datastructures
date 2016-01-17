package service;

public class InfixToPostfixStack {

	private StaticArrayStack<Character> expCharacters = new StaticArrayStack<Character>();
	private String postfixEx = "";
	
	public String getPostfixExpression(String infixExp){
		char tempChar;
		for(int i=0;i< infixExp.length();i++){
			tempChar = infixExp.charAt(i);
			if(PrecedenceComparator.getOperatorPrecedence(tempChar) == -1){
				postfixExp+= tempChar;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
