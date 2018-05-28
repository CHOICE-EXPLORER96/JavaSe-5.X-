/**
 * @author gaurnitai
 * @created_date May 27, 2018
 */

package com.javabasics.variables;

public class TypeCasting {

	int x = 344;
	double d ;//0 // 344.0
	float f ;

	void upCasting() {
		// converting lower primitive datatype into higher primitive datatype
		// storing value of lower datatype variable into higher datatype variable

		System.out.println("The value of d before storing x " + d); // 0.0
		d = x;
		System.out.println("The value of d after storing x " + d); // 344.0

	}

	void downCasting() {
		// converting higher primitive datatype into lower primitive datatype
		// storing value of higher datatype variable into lower datatype variable

		System.out.println("The value of f before storing d " + f); // 0.0F
		// f = d; // its throwing error since its explicit typecasting and cannot be
		// handle by Java itself

		f = (float)d;
		System.out.println("The value of f after storing d " + f); // 344.0

	}
	
	public static void main(String args[]) {
		
		TypeCasting tc = new TypeCasting();
		//tc.downCasting();
		tc.upCasting();
		tc.downCasting();
		
		
	}

}
