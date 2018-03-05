package com.placeworkers.tools;

public class TempMaxMin {

	public int[] mTemp2;

	public TempMaxMin(int[] temperaturArray) {
		mTemp2 = temperaturArray;
	}

	public int getMaxTemp() {
		int maxTemp = -100;
		for (int i = 0; i < mTemp2.length; i++) {

			if (maxTemp < mTemp2[i]) {
				maxTemp = mTemp2[i];
			}
		}
		return maxTemp;
	}

	public int getMinTemp() {
		int minTemp = +100;
		for (int i = 0; i < mTemp2.length; i++) {
			if (minTemp > mTemp2[i]) {
				minTemp = mTemp2[i];
			}
		}
		return minTemp;
	}
}
