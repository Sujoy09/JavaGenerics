package com.bridgelabz.DummyTesting;

public class FindMaximumTest <T extends Comparable<T>> {
	
		T x, y, z;
		
		public FindMaximumTest(T x, T y, T z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		public T maximum() {
			return FindMaximumTest.maximum(x, y, z);
		}
		
		public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			T max = x;
			if(y.compareTo(max)>0) {
				max = y;
			}
			if(z.compareTo(max)>0) {
				max = z;
			}
			printMax(x, y, z, max);
			return max;
		}

		public static <T> void printMax(T x, T y, T z, T max) {
			System.out.printf("Max of %s, %s and %s is %s\n",x,y,z,max);
		}
		
	public static void main(String[] args) {
		Integer xInt = 3, yInt = 4, zInt = 6;
		Float xF1 = 6.6f, yF1 = 8.8f, zF1 = 10.7f;
		String xStr = "Pear", yStr = "Apple", zStr = "Orange";
		
		FindMaximumTest.maximum(xStr, yStr, zStr);
		new FindMaximumTest(xInt, yInt, zInt).maximum();
		new FindMaximumTest(xF1, yF1, zF1).maximum();
		new FindMaximumTest(xStr, yStr, zStr).maximum();
	}

}
