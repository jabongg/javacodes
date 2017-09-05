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
		String[] numericString = { "0-5", "6-10", "11-30","31-45", "46-50","50-100", "100-110"/*"10_34", "7_10", "6_45", "5_34", "4_98", "9_47", "8_34", "0_49"*/ };
		List<String> list = Arrays.asList(numericString);
		//natural sorting
		Collections.sort(list);

		System.out.println("before comparator : " + list);
	
		//Customized sorting
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
/*				String[] fromToArr = s1.split("_");
				String[] fromToArr2 = s2.split("_");
*/
	/*			String[] fromToArr = s1.split("-");
				String[] fromToArr2 = s2.split("-");

				Integer val1 = Integer.parseInt(fromToArr[0]);
				Integer val2 = Integer.parseInt(fromToArr2[0]);
				return val1.compareTo(val2);
	*/			
			            return Integer.parseInt(o1.split("-")[0]) - Integer.parseInt(o2.split("-")[0]);
			}
		});
		
		System.out.println("after comparator : " + list);
	}

}
