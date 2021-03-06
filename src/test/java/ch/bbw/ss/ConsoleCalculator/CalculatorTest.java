package ch.bbw.ss.ConsoleCalculator;

/**
 * Test class for Class Calculator
 * 
 * @author Sandra Seehars
 * @version 0.0.1
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSumTwoPositivesIsOk() {
		assertTrue(testee.sum(10, 25) == 35);
	}
	
	@Test
	public void testSumTwoNegativesIsOk() {
		assertTrue(testee.sum(-10,  -25) == -35);
	}
	
	@Test
	public void testSubtractionTwoPositivesIsOk() {
		assertTrue(testee.subtract(25,  10) == 15);
	}
	
	@Test
	public void testSubtractionTwoNegativesIsOk() {
		assertTrue(testee.subtract(-25,  -10) == -15);
	}
	
	// No exception expected - otherwise: test has an error
	@Test
	public void testDivisionTwoPositivesIsOk() throws ArithmeticException {
		assertTrue(testee.divide(25,  5) == 5);
	}
	
	// This test forces an unexpected exception and contains an error
//	@Test
//	public void testDivisionForceUnexpectedException() throws java.lang.ArithmeticException {
//		assertTrue(testee.divide(10, 0) == 5);
//	}
	
	// Exception expected - otherwise: test has an error
	@Test (expected=ArithmeticException.class)
	public void testDivisionByZeroThrowsExpectedException() throws ArithmeticException {
		assertTrue(testee.divide(25,  0) == Double.POSITIVE_INFINITY); // POSITIVE_INFINITY: A constant holding the positive infinity of type double.
	}
}
