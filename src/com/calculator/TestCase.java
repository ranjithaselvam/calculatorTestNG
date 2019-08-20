package com.calculator;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	Calculator cal = new Calculator();


	@Test(priority=0,groups="cal")
	
	public void add() {
		Assert.assertEquals(cal.add(5, 6), 11.0);

	}

	@Test(priority=4,groups="my")
	public void div() {
		Assert.assertEquals(cal.div(10, 6), 1.6666666666666667);
	}

	@Test(priority=2,groups="my")
	public void mul() {
		Assert.assertEquals(cal.mul(10, 6), 60.0);
	}

	@Test(priority=1,groups="cal")
	public void sub() {
		Assert.assertEquals(cal.sub(10, 6), 4.0);
	}

	@AfterMethod()
	public void aftermethod(Method method) {
		System.out.println(" Test just executed is : " + method.getName());
	}

	@AfterTest
	public void test() {
		System.out.println("");

	}

	@BeforeMethod
	public void beforemethod(Method method) {
		System.out.println("Test to be executed is : " + method.getName());
	}

}
