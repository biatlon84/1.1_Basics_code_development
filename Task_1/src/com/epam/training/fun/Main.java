package com.epam.training.fun;

import java.util.Scanner;

//Find value of function (Task1)
public class Main {
	public static void main(String[] args) {
		double a, b, c, z;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("type value of A\n>>");
		a = Typing(sc1);
		System.out.println("type value of B\n>>");
		b = Typing(sc1);
		System.out.println("type value of C\n>>");
		c = Typing(sc1);
		z = ((a - 3) * b / 2) + c;
		System.out.println("   Z=" + z);
	}

	public static double Typing(Scanner sc) {
		while (!sc.hasNextDouble()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type double\n>>");
		}
		return sc.nextDouble();
	}
}
