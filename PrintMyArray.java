package com.bridgelabz.DummyTesting;

public class PrintMyArray {
	public static void main( String[] args ) {
	int[] a = {1,2,3};
	double[] b = {1.2, 1.3, 1.4};
	char[] c = {'a', 'b', 'c'};
	toPrint(a);
	toPrint(b);
	toPrint(c);
	}
	private static void toPrint(int[] a) {
		for (int i:a) {
			System.out.println(i);
		}
	}
	private static void toPrint(double[] b) {
		for (double i:b) {
			System.out.println(i);
		}
	}
	private static void toPrint(char[] c) {
		for (char i:c) {
			System.out.println(i);
		}
	}
}
