package com.greatlearning.balancingbrackets.main;

import java.util.Scanner;

import com.greatlearning.balancingbrackets.balance.Balance;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String of Brackets");
		String bracketString = sc.nextLine();
		Balance balance = new Balance();
		
		boolean isBalanced = balance.checkBalance(bracketString);
		
		if(isBalanced) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
		sc.close();
	}

}
