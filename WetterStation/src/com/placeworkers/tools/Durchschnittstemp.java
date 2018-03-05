package com.placeworkers.tools;

public class Durchschnittstemp {

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
