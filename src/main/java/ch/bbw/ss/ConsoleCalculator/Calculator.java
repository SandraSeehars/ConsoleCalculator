package ch.bbw.ss.ConsoleCalculator;

/**
 * Calculator class
 * 	- method to sum two numbers 
 *  - method to subtract two numbers 
 * 
 * @author Sandra Seehars
 * @version 21.01.2020
 */

public class Calculator {
	// ADDITION METHODS
	public int sum(int summand1, int summand2) {
		return summand1 + summand2; 
	}
	
	// Addition method with overflow handlings
	public int sumWithOverflowHandlingException(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2; 
	}
	
	// SUBTRACTION METHODS
	public int subtract(int minuend, int subtrahend) {
		return minuend - subtrahend; 
	}
	
	// Subtraction method with overflow handling
	
	// DIVISION METHODS
	public int divide(int dividend, int divisor) {
		return dividend / divisor; 
	}
	
	// Division method with overflow handling

	
	// VISIBILITY METHODS (until line 49)
	protected String helloWorldProtected(String string) {
		System.out.println(string);
		return string; 
	}
	
	// package is the default modifier - no need to write package protected
	String helloWorldPackage(String string) {
		System.out.println(string);
		return string; 
	}
	
	public String helloWorldPublic(String string) {
		System.out.println(string);
		return string; 
	}
	
	// this is a error source because unused private method
//	private String helloWorldPrivate(String string) {
//		System.out.println(string);
//		return string; 
//	}
}
