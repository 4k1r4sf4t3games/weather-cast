package com.placeworkers.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.placeworkers.tools.Durchschnittstemp;
import com.placeworkers.tools.TagUndTemp;

public class TestCaseDurchschnittstemp  {
	int[] tag = TagUndTemp.getTag();
	int[] temperatur = TagUndTemp.getTemperatur();
	@Test
	public void test() {
		Durchschnittstemp durchschnittstemp = new Durchschnittstemp(temperatur);
		int testZahl = durchschnittstemp.getDurchschnittstemp(temperatur);
		assertEquals(12, testZahl);
	}

}
