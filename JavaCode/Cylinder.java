/**
 * @author gaurnitai
 * @created_date May 20, 2018
 */

package com.javabasics.variables;

import java.util.Scanner;

class Cylinder {
	final static double PI = 3.14;
	double r; //0 // 40
	static double h; // 0 // 50 

	void calculateSurfaceArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r " ); 
		r = sc.nextDouble(); // 40
		System.out.println("Enter h " );
		h = sc.nextDouble(); // 50 
		double result = 2 * PI * r * h;
		System.out.println(result );
		Cylinder c = new Cylinder();
		System.out.println("r" + c.r); // 0
		System.out.println("h" + c.h); // 0
	}

	void calculateVolume() {
		
		double result = 2 * PI * r * r * h; // 0
		System.out.println(result );
	}
	
	public static void main(String args[]) {
		Cylinder c = new Cylinder();
		c.calculateSurfaceArea(); // 12K
		c.calculateVolume(); // 0
	}

}
