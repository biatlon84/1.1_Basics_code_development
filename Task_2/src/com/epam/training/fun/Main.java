package com.epam.training.fun;

import java.util.Scanner;

//Find value of function
public class Main {
	public static void main(String[] args) {
		double a, b, c, z, x, y;
		Scanner scn = new Scanner(System.in);
		System.out.println("type value of A\n>>");
		a = Typing(scn);
		System.out.println("type value of B\n>>");
		b = Typing(scn);
		System.out.println("type value of C\n>>");
		c = Typing(scn);
		// -----
		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a);
		x = Math.pow(a, 3) * c;
		y = Math.pow(b, -2);
		System.out.println("answer is\n>>" + (z - x + y));
	}

	public static double Typing(Scanner sc) {
		while (!sc.hasNextDouble()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type double\n>>");
		}
		return sc.nextDouble();
	}

}
