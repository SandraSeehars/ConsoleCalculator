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
	public int sum(int summand1, int summand2) {
		return summand1 + summand2; 
	}
	
	public int subtract(int minuend, int subtrahend) {
		return minuend - subtrahend; 
	}
	
	public int divide(int dividend, int divisor) {
		return dividend / divisor; 
	}
	
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
}
