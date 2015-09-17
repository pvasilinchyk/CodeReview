package com.epam.ta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out
					.println("Please, enter expression for calculation e.x. 20 * 5");
			double num1 = scan.nextDouble();
			String operation = scan.next();
			double num2 = scan.nextDouble();
			Calculator calc = new Calculator();
			double result = 0;
			switch (operation) {
			case "+":
				result = calc.sum(num1, num2);
				break;
			case "-":
				result = calc.minus(num1, num2);
				break;
			case "/":
				result = calc.division(num1, num2);
				break;
			case "*":
			case "X":
			case "x":
			case "õ":
			case "Õ":
				result = calc.multiply(num1, num2);
				break;
			default: 
				System.out.println("Please, enter correct operation!");
			}
			System.out.println("Result = " + result);
			scan.close();
		} catch (InputMismatchException ex) {
			System.err.println(ex);
		}

	}
}
