package service;

import java.util.Scanner;

public class TestingSymbolChecking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string to be checked");
		String expression = input.nextLine();
		StackForSymbolChecking symbolChecking = new StackForSymbolChecking();
		if(symbolChecking.checkSymbols(expression)){
			System.out.println("Symbol checking passed");
		}
		else{
			System.out.println("Symbol checking failed");
		}
		input.close();
	}
}
