package com.app.stringcalculator;


import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	StringCalculator calculator;
	
	@Before
	public void intialize() {
		calculator = new StringCalculator();
	}
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
	
	@SuppressWarnings("deprecation")
	@Test
	public void returnSameValueWhenSingleStringIsProvided() {
		//Given
		String input = "1";
		//when
		int output = calculator.Add(input);
		//Then
		assertThat(output,Matchers.equalTo(1));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void whenTwoCommaSeperatedValuesProvidedThenReturnSum() {
		//Given
		String input = "1,2";
		//when
		int output = calculator.Add(input);
		//Then
		assertThat(output,Matchers.equalTo(3));
	}
	
	

}
