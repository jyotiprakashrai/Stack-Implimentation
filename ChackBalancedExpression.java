package com.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class ChackBalancedExpression {

	public static void main(String[] args) {
		
		System.out.print("Enter expression: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(isBalanced(str)) {
			System.out.println("Result: Balanced");
		}else {
			System.out.println("Result: Un-Balanced");
		}

	}

	public static boolean isBalanced(String exp) {
		Stack<Character> chars = new Stack<>();
		char[] c = exp.toCharArray();
		int len = c.length;

		for (int i = 0; i < len; i++) {

			if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
				chars.push(c[i]);
			} else if (c[i] == ')' || c[i] == '}' || c[i] == ']') {

				if (chars.isEmpty() || !isPairs(chars.peek(), c[i])) {
					return false;
				} else {
					chars.pop();
				}
			}
		}
		return chars.isEmpty() ? true:false;
	}

	public static boolean isPairs(char opening, char closing) {

		if ((opening == '(' && closing == ')') || (opening == '{' && closing == '}')
				|| (opening == '[' && closing == ']')) {
			return true;
		}
		return false;

	}

}
