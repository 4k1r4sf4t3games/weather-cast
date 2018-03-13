package com.placeworkers.tools;

public class TagUndTemp {
	
	 private static int[] tag = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
	  private static int[] temperatur = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

	
	public  void setTag(int[] tag) {
		TagUndTemp.tag = tag;
		return;
		
	}
	public  void setTemperatur(int[] temperatur) {
		TagUndTemp.temperatur = temperatur;
		return;
	}
	public static int[] getTemperatur() {
		return temperatur;
	}
	public static int[] getTag() {
		return tag;
	}
}
