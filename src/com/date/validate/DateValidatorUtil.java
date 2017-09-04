package com.date.validate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidatorUtil {
	public boolean isThisDateValid(String dateToValidate, String dateFromat){

		if(dateToValidate == null){
			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);

		try {

			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);

		} catch (ParseException e) {

			e.printStackTrace();
			return false;
		}

		return true;
	}
	
    public static boolean validateDate() throws ParseException {
    	String input = "2012-01-20 12:05:10.321";
    	DateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    	Date date = inputFormatter.parse(input);

    	DateFormat outputFormatter = new SimpleDateFormat("MM-dd-yyyy");
    	String output = outputFormatter.format(date); // Output : 01/20/2012
    	System.out.println(output);
		return false;
    }
}
