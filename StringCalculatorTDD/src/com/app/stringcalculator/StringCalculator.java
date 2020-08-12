package com.app.stringcalculator;

public class StringCalculator {
	
	public int Add(String input) {
		
		if(input.isEmpty()) {
			return 0;
		}else {
			return convertStringToInteger(input);
		}
	}
	
	public int convertStringToInteger(String input) {
		return Integer.parseInt(input);
	}
}
