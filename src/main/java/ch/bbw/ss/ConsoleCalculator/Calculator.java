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
}
