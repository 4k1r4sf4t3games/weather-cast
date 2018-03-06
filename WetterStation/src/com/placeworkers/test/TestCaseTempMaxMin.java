package com.placeworkers.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.placeworkers.tools.TagUndTemp;
import com.placeworkers.tools.TempMaxMin;

public class TestCaseTempMaxMin extends TagUndTemp {

	@Test
	public void test() {
		TempMaxMin tempMaxMin = new TempMaxMin(temperatur);
		int testZahlMax = tempMaxMin.getMaxTemp();
		int testZahlMin = tempMaxMin.getMinTemp();
		assertEquals(16,testZahlMax);
		assertEquals(8,testZahlMin);
	}

}
