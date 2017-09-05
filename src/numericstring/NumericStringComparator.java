package com.sort.numericstring;

import java.util.Comparator;

public class NumericStringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		Integer val1 = Integer.parseInt(s1);
		Integer val2 = Integer.parseInt(s2);
		return val1.compareTo(val2);
	}
}
