package com.app.stringcalculator;

public class StringCalculator {
	
	public int Add(String input) {
		String [] arr = input.split(",");
		if(input.isEmpty()) {
			return 0;
		}else if(input.length()==1){
			return convertStringToInteger(input);
		}else {
			return getSum(arr[0],arr[1]);
		}
	}
	
	public int convertStringToInteger(String input) {
		return Integer.parseInt(input);
	}
	
	public int getSum(String value1,String value2) {
		return convertStringToInteger(value1)+convertStringToInteger(value2);
	}
}
