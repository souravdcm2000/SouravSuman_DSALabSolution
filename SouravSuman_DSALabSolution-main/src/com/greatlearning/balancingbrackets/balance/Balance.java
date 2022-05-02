package com.greatlearning.balancingbrackets.balance;

import java.util.Stack;

public class Balance {
	
	// Function to check input balance
	public boolean checkBalance(String brackets) {
		Stack<Character> bracketStack = new Stack<Character>();
		
		for(int i = 0; i < brackets.length(); i++) {
			char ch = brackets.charAt(i);
			char topChar;
			
			if( (ch == '{') || (ch == '(') || (ch == '[') ) {
				bracketStack.push(ch);
				continue;
			}
			
			if (bracketStack.isEmpty())
				return false;
			
			switch(ch) {
			
			case '}':
				topChar = bracketStack.pop();
				if( topChar != '{' )
					return false;
				break;
				
			case ')':
				topChar = bracketStack.pop();
				if( topChar != '(' )
					return false;
				break;
				
			case ']':
				topChar = bracketStack.pop();
				if( topChar != '[' )
					return false;
				break;
				
			default:
				return false;
			}
		}
		
		return bracketStack.isEmpty();
	}
}
