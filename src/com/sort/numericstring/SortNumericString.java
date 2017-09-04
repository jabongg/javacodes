package com.sort.numericstring;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author jang
 *
 */
public class SortNumericString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] numericString = { "10_34", "7_10", "6_45", "5_34", "4_98", "9_47", "8_34", "0_49" };
		List<String> list = Arrays.asList(numericString);
		//natural sorting
		Collections.sort(list);

		System.out.println("before comparator : " + list);
	
		//Customized sorting
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				String[] fromToArr = s1.split("_");
				String[] fromToArr2 = s2.split("_");

				Integer val1 = Integer.parseInt(fromToArr[0]);
				Integer val2 = Integer.parseInt(fromToArr2[0]);
				return val1.compareTo(val2);
			}
		});
		
		System.out.println("after comparator : " + list);
	}

}
