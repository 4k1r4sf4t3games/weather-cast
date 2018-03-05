package com.placeworkers.tools;

public class WarmphaseKaltphasenwechsel {

	int tempUnterschied = 0;
	int startTag = 0;
	int[] tempUndTag = new int[2];

	int[] mTemp3;
	int[] mTag;

	public WarmphaseKaltphasenwechsel(int[] tagArray, int[] temperaturArray) {
		mTemp3 = temperaturArray;
		mTag = tagArray;
	}

	public int[] getTempUnterschiedUndTag() {
		int newTempUnterschied = 0;
		for (int i = 0; i < mTemp3.length; i++) {
			if ((i + 1) < mTemp3.length) {
				if (mTemp3[i] < mTemp3[i + 1]) {
					newTempUnterschied = mTemp3[i + 1] - mTemp3[i];
				}
				if (mTemp3[i] >= mTemp3[i + 1]) {
					newTempUnterschied = mTemp3[i] - mTemp3[i + 1];
				}
				if (tempUnterschied < newTempUnterschied) {
					tempUnterschied = newTempUnterschied;
					startTag = i;
				}
			}
		}
		tempUndTag[0] = startTag;
		tempUndTag[1] = tempUnterschied;
		return tempUndTag;
	}

}