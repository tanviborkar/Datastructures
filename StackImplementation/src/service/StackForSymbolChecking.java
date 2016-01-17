package service;

public class StackForSymbolChecking {
	LinkedListStack<Character> bracketStacks = new LinkedListStack<Character>();
	
	public boolean checkSymbols(String expForChecking){
		for(int i=0;i<expForChecking.length();i++){
			if(!checkForBracketsAndAnalyze(expForChecking.charAt(i))){
				return false;
			}
		}
		if(!bracketStacks.isEmpty()){
			return false;
		}
		return true;
	}
	
	public boolean checkForBracketsAndAnalyze(char charOfExpression){
		if((charOfExpression == '{') || (charOfExpression == '(') || (charOfExpression == '[')){
			bracketStacks.push(charOfExpression);
		}
		else if((charOfExpression == '}') || (charOfExpression == ')') || (charOfExpression == ']')){
			if(!compareCharacters(bracketStacks.pop(), charOfExpression)){
				return false;
			}
		}
		return true;
	}
	
	public boolean compareCharacters(char openBracket, char closeBracket){
		if((closeBracket == '}') && (openBracket == '{')){
			return true;
		}
		if((closeBracket == ']') && (openBracket == '[')){
			return true;
		}
		if((closeBracket == ')') && (openBracket == '(')){
			return true;
		}
		return false;
	}
}
