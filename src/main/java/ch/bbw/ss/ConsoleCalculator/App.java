package ch.bbw.ss.ConsoleCalculator;

/**
 * Application class
 * 	- prints out results in console
 * 
 * @author Sandra Seehars
 * @version 21.01.2020
 */

public class App {
    public static void main( String[] args ) {
    	Calculator calculator = new Calculator();
    	int valueA = 0;
    	int valueB = 0;
    	
    	
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        
        valueA = 10; 
        valueB = 20;
        System.out.println("Sum " + valueA + " + " + valueB + " = " + calculator.sum(10, 20));
    }
}
