package com.epam.ta;

public class MatrixCreator {

	public static void fillMatrix(Matrix t, int minVal, int maxVal) {
		for (int i = 0; i < t.getVerticalSize(); i++) {
			for (int j = 0; j < t.getHorizontalSize(); j++) {
				int value = (int) (Math.random() * (maxVal - minVal) + minVal);
				t.setElement(i, j, value);
			}
		}
	}
}
