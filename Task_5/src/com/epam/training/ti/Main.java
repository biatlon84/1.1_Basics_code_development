package com.epam.training.ti;

//T is time in seconds (Task_5)
// output T in this view HHh MMm SSs 
public class Main {
	public static void main(String[] args) {
		long T;
		int h;
		int m;
		T = System.currentTimeMillis() / 1000;
		// --------
		T = 10023;
		h = (int) (T / 3600);
		T -= (h * 3600);
		m = (int) (T / 60);
		T -= m * 60;
		System.out.println("Time formatted");
		System.out.printf("%02dh %02dm %02ds", h, m, T);
	}
}
