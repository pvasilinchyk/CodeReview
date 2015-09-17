package com.epam.ta;

public class Calculator {

	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public double minus(double num1, double num2) {
		return num1 - num2;
	}

	public double division(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Division by ZERO!");
			return 0;
		} else
			return num1 / num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

}
