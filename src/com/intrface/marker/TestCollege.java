package com.intrface.marker;

/**
 * This class is used to test the custom marker interface functionality.
 * @author javawithease
 */

public class TestCollege {


	public static void main(String args[]) {
		College1 college1 = new College1();
		College2 college2 = new College2();
		
		college1.setName("Colleg1");
		college2.setName("Colleg2");
		
		//test college objects
		tester(college1);
		tester(college2);
	}
	
		
	static void tester(Object obj){
		if (obj instanceof AGradeCollegeMarker) {
                 String message = obj instanceof College1
                		 			? "College1"
                		 			: "College2";
                 System.out.println(message);
        }
	}
}
