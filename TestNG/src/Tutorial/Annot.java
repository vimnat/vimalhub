package Tutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {
	
	@Test
	public void firstmethod()
	{
		System.out.println("first");
		
	}
	@Test
	public void secondmethod()
	{
		System.out.println("second");
	}
	
	@BeforeTest
	public void btestan()
	{
		System.out.println("before test annotation");
	}
	
	@AfterTest
	public void atestan()
	{
		System.out.println("after test annotation");
	}
	
	@BeforeSuite
	public void bsuitean()
	{
		System.out.println("before suite annotation");
	}
	
	@AfterSuite
	public void asuitean()
	{
		System.out.println("after suite annotation");
	}
	
	@BeforeMethod
	public void bmethodan()
	{
		System.out.println(" before method annotation");
	}
	
	@AfterMethod
	public void amethodan()
	{
		System.out.println("after method annotation");
	}
	
	@AfterClass
	public void aclassan()
	{
		System.out.println("after class annotation");
	}
	
	@Test
	public void thirdmethod()
	{
		System.out.println("third");
	}
	
	
	@Test
	public void fourthmethod()
	{
		System.out.println("fourth");
	}
	
	@Test
	public void fifthhmethod()
	{
		System.out.println("fifth");
	}


}
