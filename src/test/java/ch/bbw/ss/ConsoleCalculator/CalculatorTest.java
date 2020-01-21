package ch.bbw.ss.ConsoleCalculator;

/**
 * Test class for Class Calculator
 * 
 * @author Sandra Seehars
 * @version 0.0.1
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator testee;

	@Test
	public void testSumTwoPositivesIsOk() {
		testee = new Calculator();
		assertTrue(testee.sum(10, 25) == 35);
	}
	
	@Test
	public void testSubtractionTwoPositivesIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtract(25,  10) == 15);
	}
}
