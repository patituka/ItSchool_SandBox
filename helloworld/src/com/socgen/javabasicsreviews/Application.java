package com.socgen.javabasicsreviews;

public class Application {

    private static void compare() {
	boolean cond = 10 < 0;
	if (cond)
	    System.out.println("10 is less than 0");
	else
	    System.out.println("10 is greater than 0");

	int value = 10;

	if (value == 0) {
	    System.out.println("if = value equals 0");
	} else if (value == 5) {
	    System.out.println("else if = value equals 5");
	} else {
	    System.out.println("Value equals " + value);
	}
    }

//    private static void autoboxing() {
//	int value = 32;
//	Integer boxed = Integer.valueOf(value);
//	Integer autoboxed = value; // auto boxing
//
//	int age = Integer.valueOf(32); // (auto) unboxing
//
//	// erreur si la class pointer est nulle => null pointer exception
//	Integer boxedValue = null;
//	int unboxedValue = boxedValue;
//	System.out.println(unboxedValue);
//    }

    private static void sum(double... vvalues) {
	double total = 0.0;
	for (double d : vvalues) {
	    total += d;
	}
	System.out.println(total);
    }

    public static void main(String[] args) {
	// argument[0]
	String majorityStr = args[0];
	Integer majority = Integer.valueOf(majorityStr);
	int maj = majority.intValue();

	String yoFirstName = args[1];
	String yoLastName = args[2];
	String joFirstName = args[3];
	String joLastName = args[4];
	String joAge = args[5];
	Integer age = Integer.valueOf(joAge);

	System.out.println("Majority=" + maj);

	Person yo = new Person(yoFirstName, yoLastName);
	Person jo = new Person(joFirstName, joLastName, age.intValue());

	System.out.println(yo);
	System.out.println(jo);

	compare();
	sum(3.3, 2.4, 8.1, 3, 5);
	// autoboxing();
    }

}
