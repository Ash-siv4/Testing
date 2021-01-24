package com.qa.unit;

public class Temp {

	public float convertFahrenheitToCelsius(int fahrenheit) {
//		float a =  ((fahrenheit - 32) * 5 / 9);
//		System.out.println(a);
		
//		return (5 / 9) * (fahrenheit - 32) --- doesn't work
		return ((fahrenheit - 32) * 5/9);
	}

	public float convertCelsiusToFahrenheit(int celsius) {
//		return (9 / 5) * (celsius) + 32 --- doesn't work right
		return (celsius * 9/5) + 32;
		
	}

	public float convertKelvinToCelsius(int kelvin) {
		return (kelvin - 273);
	}

	public float convertCelsiusToKelvin(int celsius) {
		return (celsius + 273);
	}

	public float convertKelvinToFahrenheit(int kelvin) {
		return ((kelvin - 273) * 9/5) + 32;
	}

	public float convertFahrenheitToKelvin(int fahrenheit) {
		return ((fahrenheit - 32) * 5/9) + 273;
	}

}
