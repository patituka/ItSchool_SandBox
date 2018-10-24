package com.socgen.javabasics;

public class Primitives {

    public static void main(String[] args) {
	Calculator calc2 = new Calculator(5, 5);

	System.out.println(calc2.add());
	System.out.println(calc2.substract());
	System.out.println(calc2.divide());
	System.out.println(calc2.multiply());

	// type primitif
	double doubleType = 0;
	int intType = 0;
	short shortType;
	byte byteType;
	float floatType;
	char charType;
	long longType;
	boolean booleanType;
    }
}
