package com.placeworkers.tools;

public class WarmphaseKaltphasenwechsel {

	int tempUnterschied = 0;
	int startTag = 0;
	int[] tempUndTag = new int[2];

	int[] mTemp;
	int[] mTag;

	public WarmphaseKaltphasenwechsel(int[] tagArray, int[] temperaturArray) {
		mTemp = temperaturArray;
		mTag = tagArray;
	}

	public int[] getTempUnterschiedUndTag() {
		int newTempUnterschied = 0;
		for (int i = 0; i < mTemp.length; i++) {
			if ((i + 1) < mTemp.length) {
				if (mTemp[i] < mTemp[i + 1]) {
					newTempUnterschied = mTemp[i + 1] - mTemp[i];
				}
				if (mTemp[i] >= mTemp[i + 1]) {
					newTempUnterschied = mTemp[i] - mTemp[i + 1];
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