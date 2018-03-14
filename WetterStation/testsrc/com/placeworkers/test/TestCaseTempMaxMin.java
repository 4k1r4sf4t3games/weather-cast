package com.placeworkers.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.placeworkers.tools.AusgangswerteUndRechnungen;
import com.placeworkers.tools.TempMaxMin;

public class TestCaseTempMaxMin {

	@Test
	public void test() {
		int[] temperatur = TagUndTemp.getTemperatur();
		TempMaxMin tempMaxMin = new TempMaxMin(temperatur);
		int testZahlMax = tempMaxMin.getMaxTemp();
		int testZahlMin = tempMaxMin.getMinTemp();
		assertEquals(16,testZahlMax);
		assertEquals(8,testZahlMin);
	}

}
