package com.lesson3;
//perform simple calculation using methods
public class Calculator {

	private double result;
	
	public void add(double numberOne, double numberTwo){
		
		result = numberOne + numberTwo;
		System.out.println(numberOne + " + " + numberTwo +  " = " + result);
		
		result = numberOne - numberTwo;
		System.out.println(numberOne + " - " + numberTwo +  " = " + result);
		
		result = numberOne / numberTwo;
		System.out.println(numberOne + " / " + numberTwo +  " = " + result);
		
		result = numberOne * numberTwo;
		System.out.println(numberOne + " * " + numberTwo +  " = " + result);
	}
	
	
	
	
	public static void main(String[] args) {
		

	}//end main

}//end class
