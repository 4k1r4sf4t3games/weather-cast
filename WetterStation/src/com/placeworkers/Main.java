package com.placeworkers;

import com.placeworkers.tools.*;

public class Main {
	public static void main(String[] args) {

		int[] tag = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int[] temperatur = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

		int durchschnittsTemperatur = 0;
		Durchschnittstemp durchschnittstemp = new Durchschnittstemp(temperatur);
		durchschnittsTemperatur = durchschnittstemp.getDurchschnittstemp(temperatur);

		int minTemp = 0;
		int maxTemp = 0;
		TempMaxMin tempMaxMin = new TempMaxMin(temperatur);
		maxTemp = tempMaxMin.getMaxTemp();
		minTemp = tempMaxMin.getMinTemp();
		System.out.println("Durchschnittstemp. betraegt: " + durchschnittsTemperatur);
		System.out.println("Max Temp betraegt: " + maxTemp + " °C");
		System.out.println("Min Temp obetraegt: " + minTemp + " °C");

		int anfangsTag;
		int temperaturPeriode;
		WarmphaseKaltphasenwechsel warmphaseKaltphasenwechsel = new WarmphaseKaltphasenwechsel(tag, temperatur);
		anfangsTag = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[0];
		temperaturPeriode = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[1];
		System.out.println("Groesster Temp Unterschied von Tag " + Integer.toString(anfangsTag + 1) + " zu Tag "
				+ Integer.toString(anfangsTag + 2) + " betraegt: " + temperaturPeriode + " °C");

	}

}
