package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG1 
{

//	public static void main(String[] args) 
//	{
	

//	}
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void SayGoodBye()
	{
		System.out.println("Good Bye my hero!");
	}
	
	@AfterSuite
	public void RunsItAfterAllTest()
	{
		System.out.println("This runs after all tests ran!");
	}

}
