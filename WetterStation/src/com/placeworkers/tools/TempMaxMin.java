package com.placeworkers.tools;

public class TempMaxMin {

	public int[] mTemp;

	public TempMaxMin(int[] temperaturArray) {
		mTemp = temperaturArray;
	}

	public int getMaxTemp() {
		int maxTemp = -100;
		for (int i = 0; i < mTemp.length; i++) {

			if (maxTemp < mTemp[i]) {
				maxTemp = mTemp[i];
			}
		}
		return maxTemp;
	}

	public int getMinTemp() {
		int minTemp = +100;
		for (int i = 0; i < mTemp.length; i++) {
			if (minTemp > mTemp[i]) {
				minTemp = mTemp[i];
			}
		}
		return minTemp;
	}
}
