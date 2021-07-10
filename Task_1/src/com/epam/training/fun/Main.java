package com.epam.training.fun;

import java.util.Scanner;

//Find value of function
public class Main {
	public static void main(String[] args) {
		double a, b, c, z;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("type A\n>>");
		a = Typing(sc1);
		System.out.println("type B\n>>");
		b = Typing(sc1);
		System.out.println("type C\n>>");
		c = Typing(sc1);
		z = ((a - 3) * b / 2) + c;
		System.out.println("   Z=" + z);
	}

	public static double Typing(Scanner sc) {
		while (!sc.hasNextDouble()) {
			String line = sc.nextLine();
			System.out.print("type double\n>>");
		}
		return sc.nextDouble();
	}
}
