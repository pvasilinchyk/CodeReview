package com.epam.ta;

public class Transponer {
	
	public static Matrix transpone(Matrix t) {
		Matrix trans = new Matrix(t.getHorizontalSize(), t.getVerticalSize());
		for (int i = 0; i < t.getVerticalSize(); i++) {
			for (int j = 0; j < t.getHorizontalSize(); j++) {
				trans.setElement(j, i, t.getElement(i, j));
			}
		}
		return trans;
	}
}
