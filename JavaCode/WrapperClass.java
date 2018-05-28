/**
 * @author gaurnitai
 * @created_date May 27, 2018
 */

package com.javabasics.variables;

public class WrapperClass {

	void boxing() {
		// converting primitive datatype into its corresponding object explicitly
		int x = 45;

		String s = "345";
		// convert int x into its object using wrapper class Integer
		Integer io = new Integer(x);
		System.out.println("The value of io after converting " + io);

		// lets try AUTO-BOXING
		// converting primitive datatype into its corresponding object implicity (by
		// JVM)

		Integer io2 = x;
		System.out.println("The value of io2 after converting " + io2);

		// Lets try using new Integer(String)

		System.out.println("The sum of s + s is " + (s + s));
		Integer si = new Integer(s);
		System.out.println("The sum of s + s after converting into Integer object " + (si + si));

		int si2 = Integer.parseInt(s); // Strimng object cannot be Auto boxed directly

		Integer si3 = Integer.valueOf(s);
		System.out.println("The sum of s + s after converting into Integer object " + (si + si));

	}

	void unBoxing() {

		int x = 45;
		Integer ix = new Integer(x);

		int ax = ix; // Auto unboxing

		System.out.println("The ix + ix is " + (ix + ix));

		System.out.println("The ax + ax is " + (ax + ax));
		int ir = ix.intValue(); // intValue() to convert Integer object into its primitive
		System.out.println("The ir + ir is " + (ir + ir));
		double y = 45.65;
		Double dx = new Double(y);
		dx.doubleValue();

	}

	public static void main(String[] args) {
		WrapperClass wc = new WrapperClass();
		wc.boxing();
		wc.unBoxing();

	}

}
