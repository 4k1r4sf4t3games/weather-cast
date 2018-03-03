package com.placeworkers.tools;

public class Durchschnittstemp {

	int[] day = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
	int[] temperatur = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };
	public int[] mTemp = null;

	public Durchschnittstemp(int[] temp) {
		mTemp = temp;
	}

	public int getDurchschnittstemp(int[] arr) {
		int durchschnittstemp = 0;

		for (int i = 0; i < arr.length; i++) {
			durchschnittstemp = durchschnittstemp + arr[i];
		}
		durchschnittstemp = durchschnittstemp / arr.length;

		return durchschnittstemp;

	}

}
