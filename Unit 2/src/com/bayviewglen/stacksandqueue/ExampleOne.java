package com.bayviewglen.stacksandqueue;

import java.util.Scanner;
import java.util.Stack;

public class ExampleOne {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a postfix expression: ");
		String expression = in.nextLine();
		
		String[] values = expression.split(" ");
		Stack<Integer> operands = new Stack<Integer>();
		
		for(String val : values){
			if (val.equals("*") || val.equals("+") || val.equals("-") || val.equals("/")){
				int number1 = operands.pop();
				int number2 = operands.pop();
				
				if (val.equals("*")){
					operands.push(number1*number2);
				} else if (val.equals("+")){
					operands.push(number1+number2);
				} else if (val.equals("/")){
					operands.push(number1/number2);
				} else if (val.equals("-")){
					operands.push(number1-number2);
				}
			}else{
				operands.push(new Integer(val));
			}
		}
		
		System.out.println("The answer is: " + operands.pop());

	}

}
