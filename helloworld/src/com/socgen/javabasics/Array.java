package com.socgen.javabasics;

public class Array {

    public static void main(String[] args) {
	int[] ints = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);

	boolean[] booleans = new boolean[10];
	// booleans[0] = true;
	// System.out.println(booleans[0]);

	for (int i = 0; i < booleans.length; i++) {
	    if (i % 2 == 0)
		booleans[i] = !booleans[i];
	    System.out.println(booleans[i]);
	}

	for (int i = 0; i < booleans.length; i++) {
	    System.out.println("Index = " + i + ", Valeur = " + booleans[i]);
	}
	System.out.println("");
	for (boolean i : booleans) {
	    System.out.println(i);
	}

	String explosion = "explosion";
	char[] exploded = explosion.toCharArray();
	for (int i = 0; i < exploded.length; i++) {
	    System.out.println(exploded[i]);
	}
    }
}
