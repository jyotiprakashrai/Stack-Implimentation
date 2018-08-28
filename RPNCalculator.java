package com.paytm.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*This program parses postfix expressions, performing the indicated arithmetic. 
It uses a stack to accumulate the operands.*/

/*An arithmetic expression is said to be in postfix notation (also called reverse Polish notation,
or RPN) if each operator is placed after its operands. For example, the postfix expression for
3*(4 + 5) is 3 4 5 + * . [The expression 3*(4 + 5) is called an infix expression.]*/

public class RPNCalculator {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		Scanner in = new Scanner(System.in);
		while (true) {
			String input = in.nextLine();
			char ch = input.charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				double y = Double.parseDouble(stack.pop());
				double x = Double.parseDouble(stack.pop());
				double z = 0;
				switch (ch) {
				case '+':
					z = x + y;
					break;
				case '-':
					z = x - y;
					break;
				case '*':
					z = x * y;
					break;
				case '/':
					z = x / y;
				}
				System.out.printf("\t%.2f %c %.2f = %.2f%n", x, ch, y, z);
				stack.push(new Double(z).toString());
			} else if (ch == 'q' || ch == 'Q') {
				return;
			} else {
				stack.push(input);
			}
		}
	}

}
