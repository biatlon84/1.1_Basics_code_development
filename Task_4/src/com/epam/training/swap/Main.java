package com.epam.training.swap;

//Swap the fractional and integer parts
public class Main {
	public static void main(String[] args) {
		double x = 765.912;
		double an;
		an = (x * 1000) % 1000;
		an += ((int) x) / 1000.0;
		System.out.println(an);
	}
}
