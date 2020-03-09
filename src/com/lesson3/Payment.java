package com.lesson3;
//calculate salary payment based on working hours (standart hours, overtime hours)
public class Payment {

	//declare instance variable for the values to be calculated
	
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	
	//declare a method with 3 params to calculate the payment
	public void calculatePayment(double payRate, double standardHours, double overtimeHours);
	//calculate the overtime payment
	standardPay = payRate * standardHours;
	
	double overtimeRatePay = payRate * 1.5;
	overtimePay = overtimePayRate * overtimeHours;
	
	totalPay = standardPay + overtimePay;
	
}

	public void displayPayment(){
		System.out.println("My standard pay: " + standardPay);
		System.out.println("My standard overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
	}
		
	public static void main(String[] args) {
		//declare a variable of type of Payment
		Payment myPayment;
		
		//create an object of type of Payment
		myPayment = new Payment();
		
		double pR, sH, oH;
		pR = 20;
		sH = 39;
		oH = 20;
		
		myPayment.calculatePayment(pR, sH, oH);
		myPayment.displayPayment();

	}//end main

}// end class
