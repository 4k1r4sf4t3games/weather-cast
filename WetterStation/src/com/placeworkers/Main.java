package com.placeworkers;

import com.placeworkers.tools.*;

public class Main {

	public static void main(String[] args) {
		int[] tag = TagUndTemp.getTag();
		int[] temperatur = TagUndTemp.getTemperatur();
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
		int temperaturWechsel;
		WarmphaseKaltphasenwechsel warmphaseKaltphasenwechsel = new WarmphaseKaltphasenwechsel(tag, temperatur);
		anfangsTag = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[0];
		temperaturWechsel = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[1];
		System.out.println("Groesster Temp Unterschied von Tag " + Integer.toString(anfangsTag + 1) + " zu Tag "
				+ Integer.toString(anfangsTag + 2) + " betraegt: " + temperaturWechsel + " °C");

	}

}
