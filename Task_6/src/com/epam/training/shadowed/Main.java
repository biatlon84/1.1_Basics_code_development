package com.epam.training.shadowed;

import java.util.Scanner;

//Print "true" if input coordinate (Task_6)
//pleased in the shadowed field, or print "false" otherwise
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean q;
		boolean i;
		double x = -3;
		double y = -11;

		System.out.println("type value of X\n>>");
		x = Typing(scn);
		System.out.println("type value of Y\n>>");
		y = Typing(scn);

		x = Math.abs(x);
		i = (x <= 4) && (y <= 0 && y >= -3);
		q = (x <= 2) && (y <= 4 && y > 0);
		System.out.println("<<^^>> ");
		System.out.println(q || i);
	}

	public static double Typing(Scanner sc) {
		while (!sc.hasNextDouble()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type double\n>>");
		}
		return sc.nextDouble();
	}
}
