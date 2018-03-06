package com.placeworkers.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.placeworkers.tools.TagUndTemp;
import com.placeworkers.tools.WarmphaseKaltphasenwechsel;

public class TestCaseWarmKaltPhase extends TagUndTemp {

	@Test
	public void test() {
		WarmphaseKaltphasenwechsel warmphaseKaltphasenwechsel = new WarmphaseKaltphasenwechsel(tag, temperatur);

		int tempTestundTag1 = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[0];
		int tempTestundTag2 = warmphaseKaltphasenwechsel.getTempUnterschiedUndTag()[1];

		assertEquals(1, tempTestundTag1);
		assertEquals(5, tempTestundTag2);

	}

}
