package com.placeworkers.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.placeworkers.tools.TagUndTemp;
import com.placeworkers.tools.WarmphaseKaltphasenwechsel;

public class TestCaseWarmKaltPhase extends TagUndTemp {

	@Test
	public void test() {
		WarmphaseKaltphasenwechsel warmphaseKaltphasenwechsel = new WarmphaseKaltphasenwechsel(tag, temperatur);
		int[] testZahl = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag();
		assertEquals(5, testZahl);

	}

}
