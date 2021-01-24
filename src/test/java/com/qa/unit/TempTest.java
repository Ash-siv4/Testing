package com.qa.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TempTest {
	
	Temp t = new Temp();
	
	@Test
	public void conF2C() {
		assertEquals(20,t.convertFahrenheitToCelsius(68),2);
		assertEquals(37.7,t.convertFahrenheitToCelsius(100),3);
		assertEquals(-5,t.convertFahrenheitToCelsius(23),1);
	}
	
	@Test
	public void conC2F() {
		assertEquals(53.6,t.convertCelsiusToFahrenheit(12),3);
	}
	
	@Test
	public void conK2F() {
		assertEquals(80.6,t.convertKelvinToFahrenheit(300),3);
	}
	
	@Test
	public void conF2K() {
		assertEquals(305.7,t.convertFahrenheitToKelvin(91),4);
	}
}
