package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 

{
	@Test
	public void Hithere()
	{
		System.out.println("Hi There!");
	}
	
	@Test
	public void HiDubai()
	{
		System.out.println("HiDubai!");
	}
	
	@Test(groups={"smoke"})
	public void HiUAE()
	{
		System.out.println("HiUAE!");
	}

	@BeforeTest
	public void RunsItBeforeAllOtherTests()
	{
		System.out.println("This method is executed before all other Tests");
	}
	
	@BeforeMethod
	public void RunsAfterEachTestMethod()
	{
		System.out.println("I will execute before each and every tests in this class");
	}
	
	@AfterTest
	public void RunsItAfterAllOtherTests()
	{
		System.out.println("This method is executed after a Test gets called");
	}
	
	@AfterMethod
	public void AFterEvery()
	{
		System.out.println("I will execute after each and every tests in this class");
	}
}
