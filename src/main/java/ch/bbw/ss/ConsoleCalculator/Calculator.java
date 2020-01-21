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
	
	// Addition methods with overflow handlings
	// 1
	// 2
	// 3
	// 4
	// 5
	// 6
	// 7
	// 8
	
	// SUBTRACTION METHODS
	public int subtract(int minuend, int subtrahend) {
		return minuend - subtrahend; 
	}
	
	// Subtraction methods with overflow handling
	// 1
	// 2
	// 3
	// 4
	// 5
	// 6
	// 7
	// 8
	
	// DIVISION METHODS
	public int divide(int dividend, int divisor) {
		return dividend / divisor; 
	}
	
	// Division methods with overflow handling
	// 1
	// 2
	// 3
	// 4
	// 5
	// 6
	// 7
	// 8
	
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
