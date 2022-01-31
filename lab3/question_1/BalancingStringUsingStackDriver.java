package com.lab3.question_1;

import java.util.Scanner;

public class BalancingStringUsingStackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BalancingStringUsingStack balancingbrackets = new BalancingStringUsingStack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String data = sc.next();
		boolean result = balancingbrackets.isStringBalanced(data);
		if(result) {
			System.out.println("The entered String has Balanced Brackets.");
		}
		else {
			System.out.println("The entered String does not contain Balanced Brackets.");
		}
		
	}

}
