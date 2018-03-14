package com.placeworkers;

import com.placeworkers.tools.*;
import com.placeworkers.tools.AusgangswerteUndRechnungen.durchschnittstemp.tempMaxMin;
import com.placeworkers.tools.AusgangswerteUndRechnungen.warmphaseKaltphasenwechsel;

public class Main {

	public static void main(String[] args) {
		int[] tag = AusgangswerteUndRechnungen.getTag();
		int[] temperatur = AusgangswerteUndRechnungen.getTemperatur();
		int durchschnittsTemperatur = 0;
		int[] durchschnittstemp = AusgangswerteUndRechnungen.getTemperatur();
		durchschnittsTemperatur = durchschnittstemp.length;

		int minTemp = 0;
		int maxTemp = 0;
		tempMaxMin tempMaxMin = new tempMaxMin(temperatur);
		maxTemp = tempMaxMin.getMaxTemp();
		minTemp = tempMaxMin.getMinTemp();
		System.out.println("Durchschnittstemp. betraegt: " + durchschnittsTemperatur);
		System.out.println("Max Temp betraegt: " + maxTemp + " °C");
		System.out.println("Min Temp obetraegt: " + minTemp + " °C");

		int anfangsTag;
		int temperaturWechsel;
		warmphaseKaltphasenwechsel warmphaseKaltphasenwechsel = new warmphaseKaltphasenwechsel(tag, temperatur);
		anfangsTag = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[0];
		temperaturWechsel = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[1];
		System.out.println("Groesster Temp Unterschied von Tag " + Integer.toString(anfangsTag + 1) + " zu Tag "
				+ Integer.toString(anfangsTag + 2) + " betraegt: " + temperaturWechsel + " °C");

	}

}
