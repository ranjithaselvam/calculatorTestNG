package com.calculator;

import org.testng.annotations.Test;

public class Calculator {

	@Test
	public double add(double a, double b) {
		System.out.println("add");
		return a + b;

	}

	@Test
	public double sub(double a, double b) {
		System.out.println("sub");
		return a - b;
	}

	@Test
	public double mul(double a, double b) {
		System.out.println("mul");
		return a * b;
	}

	@Test
	public double div(double a, double b) {
		System.out.println("div");
		return a / b;
	}

}
