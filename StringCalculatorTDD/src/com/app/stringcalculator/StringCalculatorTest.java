package com.app.stringcalculator;


import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

public class StringCalculatorTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void returnZeroWhenEmptyStringIsProvided() {
		//Given
		StringCalculator calculator = new StringCalculator();
		String input = "";
		//when
		int output = calculator.Add(input);
		//Then
		assertThat(output,Matchers.equalTo(0));
		
	}
	
	

}
