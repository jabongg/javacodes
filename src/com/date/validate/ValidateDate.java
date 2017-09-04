package com.date.validate;

import java.text.ParseException;

public class ValidateDate {
	public static void main(String[] args) {
		DateValidatorUtil dvu = new DateValidatorUtil();
		dvu.isThisDateValid("21/12/2017", "dd/MM/yyyy");
		try {
			dvu.validateDate();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
