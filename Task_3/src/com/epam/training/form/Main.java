package com.epam.training.form;

//Find value of formula (Task_3)
public class Main {

	public static void main(String[] args) {
		double x = 25;
		double y = 36;
		double sinX, cosX, cosY, sinY, ans;

		cosY = Math.cos(y);
		cosX = Math.cos(x);
		sinY = Math.sin(y);
		sinX = Math.sin(x);
		ans = ((sinX + cosY) / (cosX - sinY)) * Math.tan(x * y);
		System.out.println("The answer is ");
		System.out.println(">> " + ans);
	}

}
