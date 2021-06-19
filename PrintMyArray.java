package com.bridgelabz.DummyTesting;

public class PrintMyArray<E> {
	E[] myArray;
	
	public PrintMyArray(E[] myArray) {
		this.myArray = myArray;
	}
	public static void main( String[] args ) {
	Integer[] a = {1,2,3};
	Double[] b = {1.2, 1.3, 1.4};
	Character[] c = {'a', 'b', 'c'};
	toPrint(a);
	toPrint(b);
	toPrint(c);
	new PrintMyArray<Integer>(a).toPrint();
	new PrintMyArray<Double>(b).toPrint();
	new PrintMyArray<Character>(c).toPrint();
	}
	private static <E> void toPrint(E[] a) {
		for (E i:a) {
			System.out.println(i);
		}
	}
	private void toPrint() {
		toPrint(myArray);
	}
}