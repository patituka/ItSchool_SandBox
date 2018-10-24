package com.socgen.javabasics;

/**
 * This class provides. Detailed description...
 * 
 * @author Administrateur, Pati
 *
 */

public class Calculator {

    /**
     * This variable provides. Detailed description...
     */
    private double a;
    private double b;

    /**
     * This constructor provides. Detailed description...
     * 
     * @param a operand a
     * @param b operand b
     *
     */
    public Calculator(double a, double b) {
	this.a = a;
	this.b = b;

    }

    /**
     * This method provides. Detailed description...
     */
    public double add() {
	return a + b;
    }

    public double substract() {
	return a - b;
    }

    public double multiply() {
	return a * b;
    }

    public double divide() {
	return a / b;
    }
}
