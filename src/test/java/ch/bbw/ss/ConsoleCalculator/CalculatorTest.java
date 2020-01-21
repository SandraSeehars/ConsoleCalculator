package ch.bbw.ss.ConsoleCalculator;

/**
 * Test class for Class Calculator
 * 
 * @author Sandra Seehars
 * @version 0.0.1
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator testee;
	// created constants to have the same String input for the visibility test methods
	private final static String HELLO_WORLD_TEST_STRING = "Hello World!";
	private final static String HELLO_WORLD_EXPECTED_RESULT_STRING = "Hello World!"; 
	
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	// ADDITION TEST METHODS
	@Test
	public void testSumTwoPositivesIsOk() {
		assertTrue(testee.sum(10, 25) == 35);
	}
	
	@Test
	public void testSumTwoNegativesIsOk() {
		assertTrue(testee.sum(-10,  -25) == -35);
	}
	
	// SUBTRACTION TEST METHODS
	@Test
	public void testSubtractionTwoPositivesIsOk() {
		assertTrue(testee.subtract(25,  10) == 15);
	}
	
	@Test
	public void testSubtractionTwoNegativesIsOk() {
		assertTrue(testee.subtract(-25,  -10) == -15);
	}
	
	// DIVISION TEST METHODS
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
	
	// VISIBILITY TEST METHODS
	// Exception expected - otherwise: test has an error
	@Test (expected=ArithmeticException.class)
	public void testDivisionByZeroThrowsExpectedException() throws ArithmeticException {
		assertTrue(testee.divide(25,  0) == Double.POSITIVE_INFINITY); // POSITIVE_INFINITY: A constant holding the positive infinity of type double.
	}
	
	@Test
	public void testHelloWorldProtected() {
		assertEquals(HELLO_WORLD_EXPECTED_RESULT_STRING, testee.helloWorldProtected(HELLO_WORLD_TEST_STRING));
	}
	
	// this is a test method that will cause an error
//	@Test
//	public void testHelloWorldProtectedWithWrongTextInput() {
//		assertNotEquals(HELLO_WORLD_EXPECTED_RESULT_STRING, testee.helloWorldProtected("Hello Bob!"));
//	}
	
	@Test
	public void testHelloWorldPackage() {
		assertEquals(HELLO_WORLD_EXPECTED_RESULT_STRING, testee.helloWorldPackage(HELLO_WORLD_TEST_STRING));
	}
	
	@Test
	public void testHelloWorldPublic() {
		assertEquals(HELLO_WORLD_EXPECTED_RESULT_STRING, testee.helloWorldPublic(HELLO_WORLD_TEST_STRING));
	}
}
