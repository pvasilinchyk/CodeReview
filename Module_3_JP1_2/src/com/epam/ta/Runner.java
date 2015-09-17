package com.epam.ta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Please, enter Matrix parameters: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Matrix vertical size: ");
		try {
			int vert = scan.nextInt();
			System.out.println("Matrix horisontal size: ");
			int horz = scan.nextInt();
			System.out.println("Please, enter generated values range: ");
			System.out.println("Matrix MIN value: ");
			int minV = scan.nextInt();
			System.out.println("Matrix MAX value: ");
			int maxV = scan.nextInt();
			if (minV > maxV) {
				System.out
						.println("Min value is bigger then Max value... maybe there is a mistake? ");
			}
			Matrix abs = new Matrix(vert, horz);
			MatrixCreator.fillMatrix(abs, minV, maxV);
			System.out.println("--=Generated Matrix:=--");
			System.out.println(abs);
			System.out.println("--=Transponed Matrix:=--");
			System.out.println(Transponer.transpone(abs));
		} catch (InputMismatchException ex) {
			System.err.println(ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex);
		}
		scan.close();
	}
}
