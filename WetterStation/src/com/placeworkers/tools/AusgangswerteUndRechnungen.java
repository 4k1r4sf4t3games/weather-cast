package com.placeworkers.tools;

public class AusgangswerteUndRechnungen {
	
	 private static int[] tag = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
	  private static int[] temperatur = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

	
	public  void setTag(int[] tag) {
		AusgangswerteUndRechnungen.tag = tag;
		return;
		
	}
	public  void setTemperatur(int[] temperatur) {
		AusgangswerteUndRechnungen.temperatur = temperatur;
		return;
	}
	public static int[] getTemperatur() {
		return temperatur;
	}
	public static int[] getTag() {
		return tag;
	}
	 public static class durchschnittstemp {

		public int[] mTemp = null;

		public durchschnittstemp(int[] temperatur) {
			mTemp = temperatur;
		}

		public int getDurchschnittstemp(int[] arr) {
			int durchschnittstemp = 0;

			for (int i = 0; i < arr.length; i++) {
				durchschnittstemp = durchschnittstemp + arr[i];
			}
			durchschnittstemp = durchschnittstemp / arr.length;

			return durchschnittstemp;

		}
		public static class tempMaxMin {

			public int[] mTemp2;

			public tempMaxMin(int[] is) {
				mTemp2 = is;
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


	}

public static class warmphaseKaltphasenwechsel  {

	int tempUnterschied = 0;
	int startTag = 0;
	int[] tempUndTag = new int[2];

	int[] mTemp3;
	int[] mTag;

	public warmphaseKaltphasenwechsel(int[] is, int[] is2) {
		mTemp3 = is2;
		mTag = is;
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
}
