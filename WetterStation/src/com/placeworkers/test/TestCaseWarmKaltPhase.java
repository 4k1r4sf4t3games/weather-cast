package com.placeworkers.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.placeworkers.tools.TagUndTemp;
import com.placeworkers.tools.WarmphaseKaltphasenwechsel;

public class TestCaseWarmKaltPhase extends TagUndTemp {

	@Test
	public void test() {
		WarmphaseKaltphasenwechsel warmphaseKaltphasenwechsel = new WarmphaseKaltphasenwechsel(tag, temperatur);
		int[] tempTestundTag = new int[2];

		int[] testcase = { 2, 5 };

		tempTestundTag = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag();
		assertEquals(testcase, tempTestundTag);

	}

}
//Funktioniert noch nicht.. Ich bekomme die falsche Char Adresse ....