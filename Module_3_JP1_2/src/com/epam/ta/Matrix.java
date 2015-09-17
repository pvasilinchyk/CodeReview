package com.epam.ta;

public class Matrix {
	private int[][] a;

	public Matrix(int n, int m) {
		a = new int[n][m];
	}

	public int getVerticalSize() {
		return a.length;
	}

	public int getHorizontalSize() {
		return a[0].length;
	}

	public void setElement(int i, int j, int value) {
		a[i][j] = value;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nMatrix : " + a.length + " X "
				+ a[0].length + "\n");
		for (int[] row : a) {
			for (int value : row) {
				sb.append(value + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public int getElement(int i, int j) {
		return a[i][j];
	}
}
